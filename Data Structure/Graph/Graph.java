import java.util.*;
public class Graph
{
    private int V;
    private LinkedList<Integer> adj[];
 
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void BFS(int s)
    {
		boolean visited_nodes[]= new boolean[adj.length];
		int  parent_nodes[]= new int[adj.length];
		LinkedList <Integer> q = new LinkedList();
		
		q.add(s);
		visited_nodes[s]=true;
		parent_nodes[s]=-1;
		
		while(!q.isEmpty())
		{
			int p = q.poll();
			System.out.print(p);
			for(int i : adj[p])
			{
				if(visited_nodes[i]!=true)
					visited_nodes[i]=true;
				q.add(i);
				parent_nodes[i]=p;
				
			}
		}
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
    }
}