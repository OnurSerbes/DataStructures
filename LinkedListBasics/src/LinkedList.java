public class LinkedList {

    //instance variable
    private Node head;

    public LinkedList() {
        head = null;
    }

    //add node to the beginning;
    public void add(String itemName, int count) {

        head = new Node(itemName, count, head); // it will point to the head Node, head Node will be the second node after this.
    }

    public boolean deleteTheHeadNode() {

        if (head != null) {
            head = head.getPointer(); // head will be the second node and previous head node will be lost in the data garbage.
            return true;
        } else {
            //the LL is empty, head == null
            return false;
        }
    }

    public boolean contains(String target) {

        Node position=head; // this head position will travel by the each of nodes

        while(position!=null) {
            if(position.getItem().equals(target)) {
                return true; // end of the sequence
            }
            position=position.getPointer(); //if the position node didn't find the target which is wanted it will go to the next by the items pointer
        }
        return false;

    }

    public int size(){

        int counter = 0;
        Node position = head;

        while(position!=null){
            counter++;
            position = position.getPointer();
        }
        return counter;
    }

    public void display(){
        Node position = head;
        while(position != null){
            System.out.println(position.getItem() + " - " + position.getCount());
            position = position.getPointer();
        }
    }

}

