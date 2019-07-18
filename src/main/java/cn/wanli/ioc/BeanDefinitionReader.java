package cn.wanli.ioc;

/**
 * 从配置文件中读取BeanDefinitionReader
 *
 * @author wanli
 * @date 2019-07-18 23:56
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String localtion) throws Exception;
}
