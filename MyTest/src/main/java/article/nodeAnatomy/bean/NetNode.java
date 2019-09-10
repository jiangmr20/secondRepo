package article.nodeAnatomy.bean;

import java.io.Serializable;
import java.util.List;

public class NetNode<T> implements Serializable {
    private T data;      //节点标示符/节点主键，唯一标识节点
    private List<NetNode> friends = null;       //节点的邻居节点们
    private List<AttributeNode> attrs = null;    //节点拥有的属性

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<NetNode> getFriends() {
        return friends;
    }

    public void setFriends(List<NetNode> friends) {
        this.friends = friends;
    }

    public List<AttributeNode> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AttributeNode> attrs) {
        this.attrs = attrs;
    }

    public NetNode(T data, List<NetNode> friends, List<AttributeNode> attrs) {
        this.data = data;
        this.friends = friends;
        this.attrs = attrs;
    }

}
