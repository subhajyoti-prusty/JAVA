import java.util.LinkedList;
import java.util.Queue;

public class BFS_implementation{
    public class Node {
        public int data;
        Node left;
        Node right;

        public Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    void printLevelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.data + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }

    void BFS(Node root) {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node n = q.poll();
            System.out.print(n.data + " ");
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }

    public static void main(String[] args) {
        BFS_implementation tree = new BFS_implementation();
        BFS_implementation.Node root = tree.new Node(6);
        root.left = tree.new Node(4);
        root.right = tree.new Node(2);
        root.left.left = tree.new Node(5);
        root.left.right = tree.new Node(3);
        root.left.left.left = tree.new Node(2);
        root.left.left.right = tree.new Node(1);

        System.out.println("Level Order Traversal:");
        tree.printLevelOrder(root);

        System.out.println("\nBreadth First Search Traversal:");
        tree.BFS(root);
    }
}
