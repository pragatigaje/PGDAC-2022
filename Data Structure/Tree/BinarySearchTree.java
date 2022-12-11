public class BinarySearchTree
{
	// Class containing left and right child of 
	//current node and key value
	class Node
	{
		int data;
		Node left,right;
		
		public Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	// Root of BST
	Node root;
	
	// Constructor
	BinarySearchTree() 
	{ 
		root=null;
	}
	BinarySearchTree(int data) 
	{ 
		root = new Node(data);
	}
	
	// This method mainly calls insert()
    void insert(int data)
	{ root = insertRec(root, data); }
	
	public Node insertRec(Node root,int data)
	{
		if(root==null)	//base call
		{
			root=new Node(data);
			return root;
		}
		if(data < root.data)
			root.left=insertRec(root.left,data);
		else
			root.right=insertRec(root.right,data );
		return root;
	}
	
	void inOrder()
	{
		inOrderRec(root);
	}
	
	public Node inOrderRec(Node root)
	{
		if(root==null)
			return null;
		inOrderRec(root.left);
		System.out.print(root.data+" ");
		inOrderRec(root.right);
		return root;
	}
	
	public Node search(Node root, int key)
	{
		// Base Cases: root is null or key is present at root
		if (root==null || root.data==key)
			return root;
	 
		// Key is greater than root's key
		if (root.key < key)
		   return search(root.right, key);
	 
		// Key is smaller than root's key
		return search(root.left, key);
	}

	public static void main(String args[])
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(5);
		tree.insert(9);
		tree.insert(3);
		tree.insert(8);
		tree.insert(1);
		
		tree.inOrder();
	}
}