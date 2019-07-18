package cn.wanli.ioc.factory;

import cn.wanli.ioc.beans.BeanDefinition;

/**
 * @author wanli
 * @date 2019-07-18 21:04
 */
public interface BeanFactory {

    /**
     * 获取Bean
     *
     * @param name bean name
     * @return Bean
     */
    Object getBean(String name);

    /**
     * 注册bean
     *
     * @param name           bean name
     * @param beanDefinition bean 定义
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);


}
