package article.nodeAnatomy.bean;

import java.io.Serializable;
import java.util.List;

public class AttributeNode<T> implements Serializable {
    private T field;     //属性字段/属性类
    private T data;      //属性值
    private String attrId;      //属性主键
    private List<NetNode> owners = null;

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<NetNode> getOwners() {
        return owners;
    }

    public void setOwners(List<NetNode> owners) {
        this.owners = owners;
    }

    public AttributeNode(String attrId, T field, T data, List<NetNode> owners) {
        this.attrId = attrId;
        this.field = field;
        this.data = data;
        this.owners = owners;
    }

    //不存owners的构造函数
    public AttributeNode(String attrId, T field, T data){
        this.attrId = attrId;
        this.field = field;
        this.data = data;
    }
}
