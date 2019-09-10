package anatomy.bean;

import java.io.Serializable;

public class AttributeEdge<T> implements Serializable {
    private String data;      //边标识符
    private NetNode point = null;//顶点
    private AttributeNode attr = null;//属性顶点

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NetNode getPoint() {
        return point;
    }

    public void setPoint(NetNode point) {
        this.point = point;
    }

    public AttributeNode getAttr() {
        return attr;
    }

    public void setAttr(AttributeNode attr) {
        this.attr = attr;
    }

    public AttributeEdge(String data, NetNode point, AttributeNode attr){
        this.data = data;
        this.point = point;
        this.attr = attr;
    }
}
