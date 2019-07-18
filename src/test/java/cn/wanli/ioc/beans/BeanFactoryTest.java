package cn.wanli.ioc.beans;

import cn.wanli.ioc.BeanDefinition;
import cn.wanli.ioc.factory.AutowireCapableBeanFactory;
import cn.wanli.ioc.factory.BeanFactory;
import cn.wanli.ioc.io.ResourceLoader;
import cn.wanli.ioc.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @author wanli
 * @date 2019-07-18 21:17
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        //1. 读取配置文件
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");

        // 2.初始化BeanFactory并注册
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }
        // 3.获取bean
        HelloBean helloBean = (HelloBean) beanFactory.getBean("beanHello");
        helloBean.hellworld();
    }
}
