public class Node {

    //instance variable
    private String item;
    private int count;
    private Node pointer;


    public Node(){
        item = null;
        count = 0;
        pointer = null;
    }

    public Node(String item, int count, Node pointer) {
        this.item = item;
        this.count = count;
        this.pointer = pointer;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }
}
