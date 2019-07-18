package cn.wanli.ioc.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Resource是spring内部定位资源的接口。
 *
 * @author wanli
 * @date 2019-07-19 00:00
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
