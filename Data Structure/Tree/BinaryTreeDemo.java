import java.util.*;

// Class containing left and right child
// of current node and key value
class Node
{
	Node root;
	int data;
	Node left, right;
	
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}

// A Java program to introduce Binary Tree	
class BinaryTreeDemo
{
	static Node create()
	{
		 Scanner sc = new Scanner(System.in);
		 Node root = null;
		 System.out.println("Enter data");
		 int data = sc.nextInt();
		 
		 if(data==-1)
			 return null;
		 root = new Node(data);
		 
		 System.out.println("Enter left child of "+ root.data);
		 root.left=create();
		 
		 System.out.println("Enter right child of "+root.data);
		 root.right=create();
		 
		 return root;		
	}
	
	static void inOrder(Node root)	//LNR
	{
		if(root==null) 
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);	
	}
	
	static void preOrder(Node root)	//LNR
	{
		if(root==null) 
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);	
	}
	
	static void postOrder(Node root)	//LNR
	{
		if(root==null) 
			return;
		postOrder(root.left);
		postOrder(root.right);	
		System.out.print(root.data);		
	}
	
	public static void main(String args[])
	{
		// Root of Binary Tree
		Node root = create();
		System.out.println(" inOrder ");
		inOrder(root);
		
	}
}