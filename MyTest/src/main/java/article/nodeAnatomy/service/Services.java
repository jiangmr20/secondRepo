package article.nodeAnatomy.service;

import article.nodeAnatomy.bean.AttributeNode;
import article.nodeAnatomy.bean.Edge;
import article.nodeAnatomy.bean.NetNode;

import java.util.ArrayList;
import java.util.List;

public class Services {

    //处理单个节点的属性及属性连接
    public void dealAttmByNode(NetNode node,double a[][]){
        if(node == null){
            System.out.println("输入节点为空");
            return;
        }else{
            //输出节点情况
            String data = node.getData().toString();
            int count = node.getFriends().size();//邻居节点的个数
            int attrSize = node.getAttrs().size();//拥有属性的个数
            System.out.println(data+"  "+count+"  "+attrSize);
        }
        int attrSize = node.getAttrs().size();//拥有属性的个数
        for(int i=0;i<attrSize;i++){
            AttributeNode attributeNode = (AttributeNode)node.getAttrs().get(i);
            String id = attributeNode.getAttrId();
            switch (id){
                case "1":
                    a[0][0]++;
                    break;

                case "2":
                    a[1][1]++;
                    break;

                case "3":
                    a[2][2]++;
                    break;

                default:
                    System.out.println("属性个数错误");
                    return;
            }
        }
    }

    //处理由边连接形成的属性连接
    public void dealAttmByEdge(Edge edge, double a[][]){
        if(edge == null){
            System.out.println("输入边为空");
            return;
        }else{
            //输出边情况
            List<NetNode> point = edge.getPoint();//边的两个顶点
            int maxDegree = edge.getMaxDegree();//最大度数
            List<AttributeNode> attrsForEdge = edge.getAttrsForEdge();//关联属性
            System.out.println(maxDegree+" ; "+point+" ; "+attrsForEdge);
        }
        double maxDegree = edge.getMaxDegree();//最大度数
        int attrSize = edge.getAttrsForEdge().size();//关联属性的个数
        for(int i=0;i<attrSize;i++){
            AttributeNode attributeNode = (AttributeNode)edge.getAttrsForEdge().get(i);
            String id = attributeNode.getAttrId();
            double d = 1/maxDegree;
            switch (id){
                case "1":
                    a[0][0] += d;
                    break;

                case "2":
                    a[1][1] += d;
                    break;

                case "3":
                    a[2][2] += d;
                    break;

                default:
                    System.out.println("属性个数错误");
                    return;
            }
        }
    }

    //从社交网络找出边/找出社交连接关系
    public List<Edge> findEdges(NetNode node){
        //已找出所有边的节点不能再出相同的边（无向图）
        //if()鲁棒性
        //List<NetNode> delList = new ArrayList<>();

        //取出所有的属性值
        List<AttributeNode> allAttr = CreateSocialNet.getAllAttr();
        //为了方便先简单弄现成的边
        Edge u0u1 = new Edge();
        Edge u1u2 = new Edge();
        Edge u2u3 = new Edge();
        Edge u1u3 = new Edge();

        List<AttributeNode> attrsForu0u1 = new ArrayList<>();//处理u0u1，加上关联属性
        attrsForu0u1.add(allAttr.get(0));
        u0u1.setAttrsForEdge(attrsForu0u1);
        u0u1.setMaxDegree(3);

        List<AttributeNode> attrsForu1u2 = new ArrayList<>();
        attrsForu1u2.add(allAttr.get(0));
        attrsForu1u2.add(allAttr.get(1));
        u1u2.setAttrsForEdge(attrsForu1u2);
        u1u2.setMaxDegree(3);

        List<AttributeNode> attrsForu2u3 = new ArrayList<>();
        u2u3.setAttrsForEdge(attrsForu2u3);
        u2u3.setMaxDegree(2);

        List<AttributeNode> attrsForu1u3 = new ArrayList<>();
        attrsForu1u3.add(allAttr.get(2));
        u1u3.setAttrsForEdge(attrsForu1u3);
        u1u3.setMaxDegree(3);

        //把四条边加进list里面
        List<Edge> result = new ArrayList<>();
        result.add(u0u1);
        result.add(u1u2);
        result.add(u2u3);
        result.add(u1u3);

        return result;
    }

}
