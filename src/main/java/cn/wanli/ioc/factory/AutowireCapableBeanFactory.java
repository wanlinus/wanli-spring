package cn.wanli.ioc.factory;

import cn.wanli.ioc.beans.BeanDefinition;

/**
 * @author wanli
 * @date 2019-07-18 22:56
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }
}
