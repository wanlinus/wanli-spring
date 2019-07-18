package cn.wanli.ioc.factory;

import cn.wanli.ioc.BeanDefinition;
import cn.wanli.ioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * 自动装备Bean
 *
 * @author wanli
 * @date 2019-07-18 22:56
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        //先生成实例
        Object bean = beanDefinition.getBeanClass().newInstance();
        //赋值
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            //先保存字段的可访问性
            boolean accessible = declaredField.isAccessible();
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
            declaredField.setAccessible(accessible);
        }
        return bean;
    }
}
