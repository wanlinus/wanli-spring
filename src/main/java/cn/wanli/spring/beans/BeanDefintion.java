package cn.wanli.spring.beans;

/**
 * @author wanli
 * @date 2019-07-18 21:08
 */
public class BeanDefintion {

    private Object bean;

    public BeanDefintion(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
