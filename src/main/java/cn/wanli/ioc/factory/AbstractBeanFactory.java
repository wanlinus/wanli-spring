package cn.wanli.ioc.factory;

import cn.wanli.ioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wanli
 * @date 2019-07-18 21:51
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beansMap = new ConcurrentHashMap<>();

    @Override
    public Object getBean(String name) {
        return beansMap.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beansMap.put(name, beanDefinition);
    }

    /**
     * 初始化Bean
     *
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
