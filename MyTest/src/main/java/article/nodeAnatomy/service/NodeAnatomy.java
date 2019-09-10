package article.nodeAnatomy.service;

public class NodeAnatomy {

    public void anatomy(){
        //输入:属性-社交网络局部子图 Su,局部区域内属性相关性矩阵 C,匿名属性集合
        // P,相关度阈值α,已匿名节点,集合 Anonymizednodes;
        String Su ,C ,P ,a ,Anonymizednodes;
        for(each v  in  Su){  //节点属性连接分割
            if(v  in  Anonymizednodes){  //优先级高节点的分割结果
                //不作分割，完全继承
            }
            else if (exist  v.attribute a->|C(a,P)|>a && |v.attribute|>1 ){
                //如果该节点某属性与某敏感属性相关度较高,且多于 1 个属性,则可以进行分割
                v1,v2<-new node();//为当前节点生成对应的新节点;

                for( each attribute  b  of v){   //分割节点的属性关系
                    if (max|C(b, v1.attributes)|<a && max|C(b, v2.attributes)|<a ){  //与两点相关性均不强
                        Distributebynum(b,v1,v2);   //将 b 分配到属性较少的节点
                    }
                    if(max|C(b,v1.attributes)|>max|C(b,v2.attributes)|){   //与点 v1 相关性更强
                        Distributebycor(b,v1,v2,C(b,v1.attributes));    //根据相关性的正负,分配属性
                    }else{          //与点 v2 相关性更强
                        Distributebycor(b,v1,v2,C(b,v2.attributes));   //根据相关性的正负,分配属性
                    }
                }

                if(v1.attributes!=null && v2.attributes!=null){  //如果两个节点有的属性为空，则说明按规律属性分割分不开，则在else里按随机强制分割（random）
                    AttributeEdges(v1,v2);   //添加边
                    v.newnode←v1,v2;
                }else {
                    if (exists v.attribute a in p){    //包含敏感属性,强制分割
                        Randomize(v.attributes, v1, v2);
                        AttributeEdges(v1, v2);
                        v.newnode←v1, v2;
                    }else{
                        Remove(v1);      //不作分割,完全继承
                        Remove(v2);
                    }
                }
            }else{
                //不作分割，完全继承
            }
        }

        for(each User-node v in Su){   //节点社交连接分割
            if(exist EU〈v,v′〉 in Su){
                int a =|v.newnode| + |v′.nernode|;
                if (a != 0) {
                    Socialedge(v, v′);      //按共同属性多少,分别建立新连接
                    removeedge(v, v′);     //移除原社交连接
                }
                //若子图范围外某节点与被分割节点具有社交连接,该节点与两个新节点中共同属性多的连接;
                if ((v.newnode != null) && (EU〈v, v′〉not in Su)){
                    Outeredgeupdate(v1, v2, v′);
                }
            }
        }
        return Su;

    }

}
