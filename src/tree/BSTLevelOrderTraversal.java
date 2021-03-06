package tree;
import java.util.*;
import java.io.*;
import java.util.LinkedList;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BSTLevelOrderTraversal{

	static void levelOrder(Node root){
      //Write your code here
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()){
    	  Node tempNode = q.poll();;
    	  System.out.print(tempNode.data + " ");
    	  if(tempNode.left != null){
    		  q.add(tempNode.left);
    	  }
    	  if(tempNode.right != null){
    		  q.add(tempNode.right);
    	  }
      }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}