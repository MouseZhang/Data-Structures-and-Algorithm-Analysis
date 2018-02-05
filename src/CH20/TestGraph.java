package CH20;

public class TestGraph {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertex('A');
		g.addVertex('B');
		g.addVertex('C');
		g.addVertex('D');
		g.addVertex('E');
		
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(0, 3);
		g.addEdge(3, 4);
		
		g.mst();
		
		System.out.println();
		
		Graph h = new Graph();
		h.addVertex('A');
		h.addVertex('B');
		h.addVertex('C');
		h.addVertex('D');
		h.addVertex('E');
		
		h.addEdge(0, 1);
		h.addEdge(0, 2);
		h.addEdge(0, 3);
		h.addEdge(0, 4);
		h.addEdge(1, 2);
		h.addEdge(1, 3);
		h.addEdge(1, 4);
		h.addEdge(2, 3);
		h.addEdge(2, 4);
		h.addEdge(3, 4);
		
		h.mst();
		
	}
}