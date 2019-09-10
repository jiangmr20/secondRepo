package article.nodeAnatomy.bean;

import java.io.Serializable;
import java.util.List;

public class Edge<T> implements Serializable {

    private List<NetNode> point = null;//两个顶点
    private int maxDegree;//最大点的度数
    private List<AttributeNode> attrsForEdge = null;    //该边关联的属性

    public List<NetNode> getPoint() {
        return point;
    }

    public void setPoint(List<NetNode> point) {
        this.point = point;
    }

    public int getMaxDegree() {
        return maxDegree;
    }

    public void setMaxDegree(int maxDegree) {
        this.maxDegree = maxDegree;
    }

    public List<AttributeNode> getAttrsForEdge() {
        return attrsForEdge;
    }

    public void setAttrsForEdge(List<AttributeNode> attrsForEdge) {
        this.attrsForEdge = attrsForEdge;
    }
}
