package article.nodeAnatomy.service;

import article.nodeAnatomy.bean.AttributeNode;
import article.nodeAnatomy.bean.NetNode;

import java.util.ArrayList;
import java.util.List;

public class CreateSocialNet {

    private static NetNode a,b,c,d = null;  //节点初始化
    private static AttributeNode a1,a2,a3;//属性初始化

    public NetNode createNet(){
        String data1 = "a";//初始化标示符
        String data2 = "b";
        String data3 = "c";
        String data4 = "d";

        //属性值对象定义
        a1 = new AttributeNode("1",null,null);
        a2 = new AttributeNode("2",null,null);
        a3 = new AttributeNode("3",null,null);

        //此时节点只是初始化，为null，不能用来建立连接，所以邻居连接最后再用setFriend去建立

        //节点a对象实体化与属性连接
        List<AttributeNode> aAttrs = new ArrayList<>();
        aAttrs.add(a1);
        a = new NetNode<String>(data1,null,aAttrs);

        //节点b对象实体化与属性连接
        List<AttributeNode> bAttrs = new ArrayList<>();
        bAttrs.add(a1);
        bAttrs.add(a2);
        bAttrs.add(a3);
        b = new NetNode<String>(data2,null,bAttrs);

        //节点c对象实体化与属性连接
        List<AttributeNode> cAttrs = new ArrayList<>();
        cAttrs.add(a1);
        cAttrs.add(a2);
        c = new NetNode<String>(data3,null,cAttrs);

        //节点d对象实体化与属性连接
        List<AttributeNode> dAttrs = new ArrayList<>();
        dAttrs.add(a3);
        d = new NetNode<String>(data4,null,dAttrs);

        //建立a节点的社交连接
        List<NetNode> aFriends = new ArrayList<>();
        aFriends.add(b);
        a.setFriends(aFriends);
        //建立b节点的社交连接
        List<NetNode> bFriends = new ArrayList<>();
        bFriends.add(a);
        bFriends.add(c);
        bFriends.add(d);
        b.setFriends(bFriends);
        //建立c节点的社交连接
        List<NetNode> cFriends = new ArrayList<>();
        cFriends.add(b);
        cFriends.add(d);
        c.setFriends(cFriends);
        //建立d节点的社交连接
        List<NetNode> dFriends = new ArrayList<>();
        dFriends.add(b);
        dFriends.add(c);
        d.setFriends(dFriends);

        return b;//以b为网络中心/出发点，进行遍历
    }

    //取出社交网络
//    public static NetNode getNet(){
//        return createNet();
//    }

    //取出所有的属性值
    public static List<AttributeNode> getAllAttr(){
        List<AttributeNode> allAttr = new ArrayList<>();
        allAttr.add(a1);
        allAttr.add(a2);
        allAttr.add(a3);
        return allAttr;
    }
}
