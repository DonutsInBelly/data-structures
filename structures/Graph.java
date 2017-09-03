package structures;
import java.util.*;

public class Graph {
    public GNode[][] board;
    public int height;
    public int width;

    public Graph(int width, int height) {
        this.board = new GNode[height][width];
        this.height = height;
        this.width = width;
        int count = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                count++;
                this.board[y][x] = new GNode(count, y, x);
            }
        }
    }

    public ArrayList<GNode> getNeighbors(int x, int y) {
        ArrayList<GNode> result = new ArrayList<GNode>();
        if (y > 0) {
            result.add(this.board[y-1][x]);
        }
        if (y < height-1) {
            result.add(this.board[y+1][x]);
        }
        if (x > 0) {
            result.add(this.board[y][x-1]);
        }
        if (x < width-1) {
            result.add(this.board[y][x+1]);
        }
        return result;
    }

    public int DepthFirstSearch(int target) {
        // Start at 0,0
        Stack<GNode> s = new Stack<GNode>();
        GNode start = board[0][0];
        s.push(start);
        ArrayList<GNode> visited = new ArrayList<GNode>();
        visited.add(start);
        while(!s.empty()) {
            GNode curr = s.pop();
            System.out.println("Checking " + curr.x + "," + curr.y);
            // Push neighbors onto Stack
            for (GNode neighbor: getNeighbors(curr.x, curr.y) ) {
                if (!visited.contains(neighbor)) {
                    s.push(neighbor);
                    visited.add(neighbor);
                }
            }
            if (curr.value == target) {
                return curr.value;
            }
        }
        return -1;
    }

    public int BreadthFirstSearch(int target) {
        // Start at 0,0
        // Queue<GNode>
        return 0;
    }

    public void printBoard() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                System.out.print(" " + this.board[y][x] + " ");
            }
            System.out.println();
        }
    }
}
