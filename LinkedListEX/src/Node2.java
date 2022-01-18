public class Node2 {

    private String item;
    private Node2 link;

    public Node2(String item){
        this.item = item;
        link=null;
    }

    public Node2(String item, Node2 link) {
        this.item = item;
        this.link = link;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Node2 getLink() {
        return link;
    }

    public void setLink(Node2 link) {
        this.link = link;
    }
}
