import java.util.Iterator;
import java.util.LinkedList;
public class DFS_implementation {
    static class Graph {
        int V;
        LinkedList<Integer> adjListArray[];

        Graph(int V) {
            this.V = V;
            adjListArray = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjListArray[src].add(dest);
        }

        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;
            System.out.print(v + " ");
            Iterator<Integer> i = adjListArray[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    DFSUtil(n, visited);
                }
            }
        }

        void DFS(int v) {
            boolean visited[] = new boolean[V];
            DFSUtil(v, visited);
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.DFS(2);
    }
}
