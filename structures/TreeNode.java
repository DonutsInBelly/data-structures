package structures;
import java.util.*;

public class TreeNode {
  public int value;
  public ArrayList<TreeNode>() children;

  public TreeNode(int value) {
    this.value = value;
    this.children = new ArrayList<TreeNode>();
  }

  public String toString() {
    return "[ " + value + " ]-->";
  }
}
