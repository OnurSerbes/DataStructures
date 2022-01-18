public class OrderedLinkedList {

    private Node first;
    private Node last;

    public OrderedLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(String itemName){
        if(isEmpty()){
            first = last = new Node(itemName,first);
        } else{

            Node newItem = new Node(itemName,null);
            Node current = first;
            Node prev = new Node();

            while(current !=null){ // control point for check the LL empty or not
                if(current.getItem().compareTo(itemName) > 0){ //if current's name is bigger
                    if(current == first){  //checking for if curret still in same point ( not moved )
                        newItem.setLink(first); //firstly connect first item to the newItem we dont want to loose the previous first node :)
                        first = newItem; // then make it first
                        break;
                    }
                    else{
                        prev.setLink(newItem);
                        newItem.setLink(current);
                        break;
                    }
                } else if(current == last){
                    last.setLink(newItem); // firstly connect last item to the newItem we dont want to loose the previous last node :)
                    newItem.setLink(null);
                    last = newItem; // then make it last
                }
                prev = current; // move on
                current = current.getLink(); //move on
            }

        }
    }

    public boolean remove(String itemName){
     if(isEmpty()){
         System.out.println("The list is empty!");
         return false;
     }else{

         Node current = first;
         Node prev = new Node();

         while(current != null){
             if(current.getItem().equals(itemName)){
                 if(current ==first){
                     first = current.getLink();
                     return true;
                 }else{
                     prev.setLink(current.getLink());
                     return true;
                 }
             }
             prev = current;
             current = current.getLink();
         }
         System.out.println(itemName + "is not in the list");
         return false;
     }
    }

    public int size(){
        int count = 0;
        Node current = first;

        while(current!=null){
            count++;
            current = current.getLink(); // at the end current.getLink() will be null and system will stop
        }
        return count;
    }

    public void outputList(){
        Node current = first;
        while(current != null){
            System.out.println(current.getItem());
            current = current.getLink();
        }
    }

    public boolean search(String target){
        Node position = first;
        String itemAtPosition;

        while (position!=null){
            itemAtPosition = position.getItem();
            if(itemAtPosition.equals(target))
                return true;
                position = position.getLink();
        }
        return false; // not in the list
    }

    public int findPosition(String target){
        int pos = -1;
        Node position = first;
        String itemAtPosition;
        while(position!=null){
            pos++;
            itemAtPosition = position.getItem();
            if(itemAtPosition.equals(target))
                return pos;
            position = position.getLink();
        }
        return pos;
    }
}
