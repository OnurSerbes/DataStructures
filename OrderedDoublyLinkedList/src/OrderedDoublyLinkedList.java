public class OrderedDoublyLinkedList {
    private Node first;
    private Node last;

    public OrderedDoublyLinkedList(){
        first = null;
        last = null;

    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(String itemName) {
        if (isEmpty()) {
            first = last = new Node(itemName, first);
        } else {
            Node newItem = new Node(itemName);
            Node current = first;
            while (current != null) {
                if (current.getItem().compareTo(itemName) > 0) { // current bizim atadağımız node, itemName ise yeni girecek olan node :) meali ===== yeni item var olandan küçük ise...
                    if (current == first) {
                        newItem.setNext(first);
                        first.setPrev(newItem);
                        first = newItem;
                        break;
                    } else {
                        newItem.setPrev(current.getPrev()); // yeni item currentten önce fakat diğerlerinden sonra olacağından araya girmiş oluyor. Bu yüzden newItem.setPrev yaparak currentten bir önceki node artık newItem'ın bir önceki node u oluyor
                        current.getPrev().setNext(newItem);
                        newItem.setNext(current);
                        current.setPrev(newItem);
                        break;
                    }
                } else if (current == last) {
                    last.setNext(newItem);
                    newItem.setPrev(last);
                    last = newItem;
                    break;
                }
                current = current.getNext();
            }
        }
    }

    public boolean remove(String itemName){
        if(isEmpty()){
            System.out.println("the list is empty");
            return false;
        }else{
            Node current = first;
            while(current != null){
                if(current.getItem().equals(itemName)){
                    if(current == first){
                        if(first == last){
                            first = last = null;
                        }else{
                            first = current.getNext();
                            first.setPrev(null);
                        }
                        return true;
                    }else if(current == last){
                        last = current.getPrev();
                        last.setNext(null);
                        return true;
                    }else{
                        current.getPrev().setNext(current.getNext());
                        current.getNext().setPrev(current.getPrev());
                        return true;
                    }
                }
                current = current.getNext();
            }
            System.out.println(itemName + "is not in the lsit!");
            return false;
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
        while (current !=null) {
            System.out.println(current.getItem());
            current = current.getPrev();
        }
    }
    public void search(String target){
        int pos = -1;
        char direction = 'f';
        Node position = new Node();
    }
}
