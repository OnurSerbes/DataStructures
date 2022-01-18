public class Node {
    private String item;
    private Node prev;
    private Node next;

    public Node(){
        prev = null;
        next = null;
        item = null;
    }

    public Node(String newItem){
        setItem(newItem);
        prev = null;
        next = null;
    }

    public Node(String newItem, Node nextValue){
        setItem(newItem);
        prev = null;
        next = nextValue;
    }

    public Node(String newItem, Node prevValue, Node nextValue){
        setItem(newItem);
        prev = prevValue;
        next = nextValue;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
