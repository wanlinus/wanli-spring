package cn.wanli.ioc.beans;

/**
 * @author wanli
 * @date 2019-07-18 21:19
 */
public class HelloBean {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void hellworld() {
        System.out.println(text);
    }
}
