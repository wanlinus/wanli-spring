package cn.wanli.spring.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wanli
 * @date 2019-07-18 21:04
 */
public class BeanFactory {
    private Map<String, BeanDefintion> map = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return map.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefintion beanDefintion) {
        map.put(name, beanDefintion);
    }
}
