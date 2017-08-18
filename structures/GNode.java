package structures;

public class GNode {
    public int value;
    public int x;
    public int y;

    public GNode() {
        this.value = -1;
    }

    public GNode(int value) {
        this.value = value;
    }

    public GNode(int value, int y, int x) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public void setVal(int value) {
        this.value = value;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
