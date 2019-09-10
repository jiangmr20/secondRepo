package anatomy.service;

import anatomy.bean.AttributeEdge;
import anatomy.bean.NetNode;

import java.util.ArrayList;
import java.util.List;

public class Services {

    //get邻居子图
    public List<NetNode> getSv(NetNode v){
        List<NetNode> neighborNode = v.getNes();
        return neighborNode;
    }

    //get需要分割的节点序列
    public List<NetNode> getL(List<NetNode> allNodes){
        if(allNodes==null){
            System.out.println("没有节点");
            return null;
        }
        List<NetNode> nodeList = new ArrayList<>();
        for(int i=0;i<allNodes.size();i++){
            NetNode v = allNodes.get(i);
            List<AttributeEdge> edgeList = v.getAes();//找出属性连接边
            if(edgeList!=null){
                for(int j=0;j<edgeList.size();j++){
                    String data = edgeList.get(j).getAttr().getData();
                    if(data.equals("隐私属性值")){       //自行定义隐私属性值
                        nodeList.add(v);
                    }
                }
            }
        }
        return nodeList;
    }

}
