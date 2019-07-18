package cn.wanli.spring.beans;

import org.junit.Test;

/**
 * @author wanli
 * @date 2019-07-18 21:17
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        //1. 初始化beanFactory
        BeanFactory factory = new BeanFactory();

        //2. 注入Bean
        BeanDefintion beanDefintion = new BeanDefintion(new HelloBean());
        factory.registerBeanDefinition("helloBean", beanDefintion);

        //3. 获取Bean
        HelloBean bean = (HelloBean) factory.getBean("helloBean");
        bean.hellworld();
    }
}
