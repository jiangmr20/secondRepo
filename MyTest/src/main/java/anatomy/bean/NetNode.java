package anatomy.bean;

import java.io.Serializable;
import java.util.List;

public class NetNode<T> implements Serializable {
    private String data;      //节点标示符/节点主键，唯一标识节点
    private List<NetEdge> nes = null;       //社交连接边
    private List<AttributeEdge> aes = null;    //属性连接边

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<NetEdge> getNes() {
        return nes;
    }

    public void setNes(List<NetEdge> nes) {
        this.nes = nes;
    }

    public List<AttributeEdge> getAes() {
        return aes;
    }

    public void setAes(List<AttributeEdge> aes) {
        this.aes = aes;
    }

    public NetNode(String data, List<NetEdge> nes, List<AttributeEdge> aes) {
        this.data = data;
        this.nes = nes;
        this.aes = aes;
    }

}
