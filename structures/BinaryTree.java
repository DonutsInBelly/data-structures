public class BinaryTree {

  public enum Child {
    LEFT(0);
    RIGHT(1);
  }

  public TreeNode root;

  public void insert(int value) {
    if (this.root == null) {
      this.root = new TreeNode(value);
      return;
    }
    TreeNode curr = this.root;
    do {
      if (value == curr.value) {
        System.out.println("Value is a duplicate and already exists in the tree.");
        return;
      } else if (value < curr.value) {
        if (curr.children.get(Child.LEFT) == null) {
          curr.children.add(Child.LEFT, new TreeNode(value));
          return;
        }
        curr = curr.children.get(Child.LEFT);
      } else if (value > curr.value) {
        if (curr.children.get(Child.RIGHT) == null) {
          curr.children.add(Child.RIGHT, new TreeNode(value));
          return;
        }
        curr = curr.children.get(Child.RIGHT);
      }
    } while (curr != null);
    System.out.println("Something went wrong here!");
  }
}
