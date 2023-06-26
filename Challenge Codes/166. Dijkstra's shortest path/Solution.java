import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int vertices, int edges, int source){
		// Write your code here.
		ArrayList<Integer> dist = new ArrayList<>(vertices);
		ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

		for (int i=0;i<vertices;i++) {
			dist.add(Integer.MAX_VALUE);
			adj.add(new ArrayList<>());
		}

		for (ArrayList<Integer> edge: vec) {
			adj.get(edge.get(0)).add(new int[]{edge.get(1), edge.get(2)});
			adj.get(edge.get(1)).add(new int[]{edge.get(0), edge.get(2)});
		}

		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
		boolean[] visited = new boolean[vertices];
		dist.set(source, 0);
		pq.add(new int[]{source, 0});
		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			if (visited[cur[0]]) continue;
			visited[cur[0]] = true;
			for (int[] neighbor : adj.get(cur[0])) {
				int node = neighbor[0];
				int distance = neighbor[1];
				if (!visited[node] && dist.get(cur[0])!=Integer.MAX_VALUE && dist.get(cur[0])+distance < dist.get(node)) {
					dist.set(node, dist.get(cur[0]) + distance);
					pq.add(new int[]{node, dist.get(node)});
				}
			}
		}

		return dist;

	}
}