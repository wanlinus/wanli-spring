package cn.wanli.ioc.io;

import java.net.URL;

/**
 * @author wanli
 * @date 2019-07-18 23:59
 */
public class ResourceLoader {
    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
