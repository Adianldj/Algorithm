package MicrosoftOnsite;

public class JosephCircle {
	class ChildNode{  
	     int Num;//编号  
	     ChildNode nextChildNode=null;//指向下一个结点  
	     ChildNode preChildNode=null;  
	     public ChildNode(int num){  
	         this.Num=num;  
	     }  
	}  
	class CycLink{//环形链表  
	    //先定义一个指向链表第一个结点的引用,指向第一个结点的引用，不能动  
	    ChildNode TofirstChildNode=null;  
	    ChildNode temp=null;  
	    int len=0;//共有多少个结点  
	    int k=0;//从第几个人开始数数  
	    int m=0;//数m下  
	    int n=1;//第n个人出局  
	    //设置链表大小  
	    public CycLink(int len,int k,int m){  
	         this.len=len;//设置环形链表大小  
	         this.k=k;//设置从第几个人开始数数  
	         this.m=m;//设置数m下  
	         creatLink();  
	         showLink();  
	         play();  
	    }  
	    //开始约瑟夫规则游戏  
	    private void play(){  
	        ChildNode cursor=this.TofirstChildNode;  
	        //1.先开始找到开始数数的人  
	        for(int i=1;i<k;i++){  
	            cursor=cursor.nextChildNode;  
	        }  
	        while(this.len!=1){  
	        //2.数m下,找到了要删除的结点  
	        for(int j=1;j<m;j++){  
	            cursor=cursor.nextChildNode;  
	            //其实没人引用了，那么过会儿就会被GC回收  
	        }  
	        //3.将数到m的结点，退出圈  
	         System.out.println("第"+this.n+"次出局的人编号是:"+cursor.Num);  
	         cursor.preChildNode.nextChildNode=cursor.nextChildNode;//删除操作  
	         cursor.nextChildNode.preChildNode=cursor.preChildNode;//删除操作  
	         //让cursor指向下一个开始数数的人，这个动作很重要，不然游标就不动了  
	         cursor=cursor.nextChildNode;  
	         this.len--;//出圈一个人，  
	         this.n++;  
	        }  
	        //最后一个剩下的结点  
	        System.out.println("最后还在桌子上坐着的人编号："+cursor.Num);  
	    }  
	    //初始化环形链表  
	    private void creatLink(){  
	        for(int i=1;i<=len;i++){  
	            if(i==1){  
	            //创建第一个结点  
	            ChildNode ch=new ChildNode(i);  
	            this.TofirstChildNode=ch;  
	            temp=ch;  
	           }  
	            else{  
	                //创建最后一个结点  
	                if(i==len){  
	                    ChildNode ch=new  ChildNode(i);  
	                    temp.nextChildNode=ch;  
	                    ch.preChildNode=temp;  
	                    temp=ch;  
	                    temp.nextChildNode=this.TofirstChildNode;  
	                    this.TofirstChildNode.preChildNode=ch;  
	                }  
	                else{  
	                //继续创建结点  
	                 ChildNode ch=new  ChildNode(i);  
	                 temp.nextChildNode=ch;  
	                 ch.preChildNode=temp;  
	                 temp=ch;  
	               }  
	            }  
	        }  
	    }  
	    //打印环形链表  
	    private void showLink(){  
	        //定义一个游标  
	       ChildNode cursor=this.TofirstChildNode;  
	       do{  
	           System.out.println("参员编号为："+cursor.Num);  
	           cursor=cursor.preChildNode;   
	       }  
	       while(cursor!=this.TofirstChildNode);  
	    }  
}
}
