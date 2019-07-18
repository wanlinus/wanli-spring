package cn.wanli.ioc.beans;

import cn.wanli.ioc.BeanDefinition;
import cn.wanli.ioc.PropertyValue;
import cn.wanli.ioc.PropertyValues;
import cn.wanli.ioc.factory.AutowireCapableBeanFactory;
import cn.wanli.ioc.factory.BeanFactory;
import org.junit.Test;

/**
 * @author wanli
 * @date 2019-07-18 21:17
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        //1. 初始化beanFactory
        BeanFactory factory = new AutowireCapableBeanFactory();

        // 2.bean定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClass(HelloBean.class);

        // 3.设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello Bean"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4.生成bean
        factory.registerBeanDefinition("helloBean", beanDefinition);

        //3. 获取Bean
        HelloBean bean = (HelloBean) factory.getBean("helloBean");
        bean.hellworld();
    }
}
