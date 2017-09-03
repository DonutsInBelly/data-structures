package structures;
import java.util.*;
import java.util.ArrayList;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;
    public ArrayList<TreeNode> children;

    public TreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<TreeNode>();
    }

    public String toString() {
        return "[ " + value + " ]-->";
    }
}
