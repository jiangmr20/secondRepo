package article.nodeAnatomy.service;

import article.nodeAnatomy.bean.Edge;
import article.nodeAnatomy.bean.NetNode;

import java.util.Arrays;
import java.util.List;

public class Control {

    //局部属性分布矩阵生成
    private static int size = CreateSocialNet.getAllAttr().size();//矩阵的大小/属性值的数量
    private static double a[][] = new double[size][size];//二维数组矩阵

    //找出子图所有节点来处理
    public void dealByNode(NetNode node){
        Services s = new Services();
        s.dealAttmByNode(node,a);
        int count = node.getFriends().size();//邻居节点的个数
        for(int i=0;i<count;i++){
            s.dealAttmByNode((NetNode)node.getFriends().get(i),a);
        }
        System.out.println("处理了单个节点属性的矩阵");
        System.out.println(Arrays.deepToString(a));//打印出来
    }

    //处理由边连接形成的属性连接
    public void dealByEdge(List<Edge> list){
        Services s = new Services();
        for(int i=0;i<list.size();i++){
            s.dealAttmByEdge(list.get(i),a);
        }
        System.out.println("处理了由边连接形成的属性的矩阵");
        System.out.println(Arrays.deepToString(a));
    }

    //现成的矩阵（先用着）
    public static double[][] getAttm(){
        double b[][] = new double[3][3];
        b[0][0] = (double)11/3;
        b[0][1] = (double)8/3;
        b[0][2] = (double)13/6;
        b[1][0] = (double)8/3;
        b[1][1] = (double)7/3;
        b[1][2] = (double)11/6;
        b[2][0] = (double)13/6;
        b[2][1] = (double)11/6;
        b[2][2] = (double)7/3;
        return b;
    }

    public static void main(String[] args){
        /*
        Control c = new Control();
        Services s = new Services();
        CreateSocialNet csn = new CreateSocialNet();
        c.dealByNode(csn.createNet());
        c.dealByEdge(s.findEdges(null));
        */
        double c[][] = getAttm();
        System.out.println(Arrays.deepToString(c));
    }
}
