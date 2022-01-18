public class Node {

    private String item;
    private Node link;

    public Node(){
        item = null;
        link=null;
    }

    public Node(String item, Node link) {
        this.item = item;
        this.link = link;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
