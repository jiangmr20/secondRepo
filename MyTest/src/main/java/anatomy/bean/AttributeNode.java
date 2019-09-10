package anatomy.bean;

import java.io.Serializable;
import java.util.List;

public class AttributeNode<T> implements Serializable {
    private String field;     //属性/属性类
    private String data;      //属性值
    private String attrId;      //属性主键
    private List<AttributeEdge> aes = null;    //属性连接边

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public List<AttributeEdge> getAes() {
        return aes;
    }

    public void setAes(List<AttributeEdge> aes) {
        this.aes = aes;
    }

    public AttributeNode(String attrId, String field, String data, List<AttributeEdge> aes) {
        this.attrId = attrId;
        this.field = field;
        this.data = data;
        this.aes = aes;
    }

}
