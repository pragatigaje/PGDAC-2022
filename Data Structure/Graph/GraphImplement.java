import java.util.*;

class GraphImplement
{
	LinkedList <Integer> adjacency[]; 
	GraphImplement(int v)
	{
		adjacency = new LinkedList[v];
		for(int i=0; i<v ; i++)
		{
			adjacency[i]=new LinkedList <Integer>();
		}
	}
	
	void insertedge(int s, int d)
	{
		adjacency[s].add(d);
		adjacency[d].add(s);
		
		System.out.println(adjacency[d]);
		System.out.println(adjacency[s]);
	}
	
	void bfs(int source)
	{
		boolean visited_nodes[]= new boolean[adjacency.length];
		int  parent_nodes[]= new int[adjacency.length];
		Queue <Integer> q = new LinkedList();
		
		q.add(source);
		visited_nodes[source]=true;
		parent_nodes[source]=-1;
		
		while(!q.isEmpty())
		{
			int p = q.poll();
			System.out.print(p);
			for(int i : adjacency[p])
			{
				if(visited_nodes[i]!=true)
					visited_nodes[i]!=true;
				q.add(i);
				parent_nodes[i]=p;
				
			}
		}
		
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of vertices and edges :");
		int v =sc.nextInt();
		int e =sc.nextInt();
		GraphImplement g = new GraphImplement(v);
		System.out.println("Enter edges :");

		for(int i=0; i<e; i++)
		{
			int s = sc.nextInt();
			int d = sc.nextInt();
			g.insertedge(s,d);
		}
		
		System.out.println("Enter source for BFS traversal :");
		g.bfs(source);
	}
}