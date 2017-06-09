package structures;
import java.util.*;

public class TreeNode {
  public int value;
  public ArrayList<TreeNode>() children;

  public TreeNode(int value) {
    this.value = value;
    this.children = new ArrayList<TreeNode>();
  }

  public void print() {
        print("", true);
  }

  private void print(String prefix, boolean isTail) {
    System.out.println(prefix + (isTail ? "└── " : "├── ") + value);
    for (int i = 0; i < children.size() - 1; i++) {
      children.get(i).print(prefix + (isTail ? "    " : "│   "), false);
    }
    if (children.size() > 0) {
      children.get(children.size() - 1)
              .print(prefix + (isTail ?"    " : "│   "), true);
    }
  }
}
