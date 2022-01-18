public class Node {
    private int info;
    private Node link;

    public Node(){
        link = null;
        info = 0;
    }

    public Node(int newInfo){
        setInfo(newInfo);
        link = null;
    }

    public Node(int newInfo, Node linkValue){
        setInfo(newInfo);
        link = linkValue;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
