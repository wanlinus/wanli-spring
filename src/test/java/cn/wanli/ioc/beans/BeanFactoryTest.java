package cn.wanli.ioc.beans;

import cn.wanli.ioc.factory.AutowireCapableBeanFactory;
import cn.wanli.ioc.factory.BeanFactory;
import org.junit.Test;

/**
 * @author wanli
 * @date 2019-07-18 21:17
 */
public class BeanFactoryTest {

    @Test
    public void test() {
        //1. 初始化beanFactory
        BeanFactory factory = new AutowireCapableBeanFactory();

        //2. 注入Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("cn.wanli.ioc.beans.beans.HelloBean");
        factory.registerBeanDefinition("helloBean", beanDefinition);

        //3. 获取Bean
        HelloBean bean = (HelloBean) factory.getBean("helloBean");
        bean.hellworld();
    }
}
