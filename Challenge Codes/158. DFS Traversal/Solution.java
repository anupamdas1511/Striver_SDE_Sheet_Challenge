import java.util.ArrayList;

public class Solution {    
	static void dfs(int node , ArrayList<ArrayList<Integer>> adj, int visit[],  ArrayList<Integer> ds) {        
		visit[node]=1;        
		ds.add(node);        
		for(Integer x : adj.get(node)){            
			if(visit[x]==0){                
				dfs(x, adj , visit , ds);            
			}        
		}    
	}    

	public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {        
		// Write your code here.        
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();        
		for(int i =0;i<v;i++) adj.add(new ArrayList<Integer>());         
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();        
		for(int i=0;i<edges.size();i++){            
			int m = edges.get(i).get(0);            
			int n = edges.get(i).get(1);                        
			adj.get(m).add(n);            
			adj.get(n).add(m);        
		}       
		//         System.out.println(edges.get(0).size());        
		int visit[]= new int[v];        
		for(int i =0;i<v;i++){            
			if(visit[i]==0){                               
				ArrayList<Integer> ds = new ArrayList<>();                
				dfs(i , adj, visit , ds);                
				res.add(ds);            
			}                    
		}        
		return res;            
	} 
}