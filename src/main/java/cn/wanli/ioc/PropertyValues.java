package cn.wanli.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanli
 * @date 2019-07-18 23:23
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv) {
        //可以去重
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
