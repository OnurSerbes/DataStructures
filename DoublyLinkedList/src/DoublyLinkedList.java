public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return(first == null);
    }

    public void insertAtFront(String itemName){
        if(isEmpty()){
            first = last = new Node(itemName, first);
        }else{
            Node a = new Node(itemName);
            a.setNext(first); // 1) new items next pointer needs to be pointed to the first item
            first.setPrev(a); // 2) then firsts prev points to new item
            first = a; // 3) finally first item needs to set as new item
        }
    }

    public boolean removeFromFront(){
        if(isEmpty()){
            System.out.println("The list is empty!");
            return false;
        }
        else{
            if(first == last){
                first = last = null;
            }else{
                first = first.getNext();
                first.setPrev(null);
            }
            return true;
        }
    }

    public void insertAtBack(String itemName){
        if(isEmpty()){
            first = last = new Node(itemName,first);
        }else{
            Node a = new Node(itemName);
            a.setPrev(last);
            a.setNext(null);
            last.setNext(a);
            last = last.getNext();
        }
    }

    public boolean removeFromBack(){
        if(isEmpty()){
            System.out.println("The list is empty");
            return false;
        }else{
            if(first == last){
                first = last = null;
            }else{
                last = last.getPrev();
                last.setNext(null);
            }
            return true;
        }
    }

    public int size(){
        int count = 0;
        Node current = first;

        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void outputList(){
        Node current = first;
        while(current != null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }

    public void outputListBackward(){
        Node current = last;
        while(current != null){
            System.out.println(current.getItem());
            current = current.getPrev();
        }
    }

    private Node find(String target){
        Node position = first;
        String itemAtPosition;
        while(position != null){
            itemAtPosition = position.getItem();
            if(itemAtPosition.equals(target))
                return position;
            position = position.getNext();
        }
        return null; //target was not found
    }

    public boolean contains(String item){
        return (find(item) != null);
    }
}
