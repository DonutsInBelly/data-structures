package structures;

public class GraphApp {
    public static void main(String[] args) {
        Graph g = new Graph(10, 10);
        g.printBoard();
        System.out.println(g.DepthFirstSearch(77));

    }
}
