package anatomy.bean;

import java.io.Serializable;

public class NetEdge<T> implements Serializable {
    private String data;      //边标识符
    private NetNode pointA = null;//顶点A
    private NetNode pointB = null;//顶点B

    public NetNode getPointA() {
        return pointA;
    }

    public void setPointA(NetNode pointA) {
        this.pointA = pointA;
    }

    public NetNode getPointB() {
        return pointB;
    }

    public void setPointB(NetNode pointB) {
        this.pointB = pointB;
    }

    public NetEdge(String data, NetNode pointA, NetNode pointB){
        this.data = data;
        this.pointA = pointA;
        this.pointB = pointB;
    }

}
