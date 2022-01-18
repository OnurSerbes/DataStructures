public class LinkedList {

    private Node2 first; // head
    private Node2 last;

    public LinkedList(){
        first = null;
        last = null;
    }

    public void insertAtFront(String item){
        if(first == null){ // Linked List is empty
            first = last = new Node2(item);
        } else {
            first = new Node2(item, first); // the link(pointer) of the Node2 will be node First
        }
    }

    public void removerFromFront(){
        if(first == null){
            System.out.println("nothing to delete");
        }else {
            if(first == last){
                first = last = null;
            }else{
                first = first.getLink(); // the first node will be the second node with geting the pointer.
            }
        }
    }

    public void insertAtBack(String item){
        if(first == null){
            first = last = new Node2(item);
        }else{
            last.setLink(new Node2(item));
            last = last.getLink();
        }
    }

    public void removeFromBack(){
        if(first == null){
            System.out.println("nothing to delete");
        }else{
            if(first==last){
                first=last=null;
            }else{
                Node2 current = first; // it will start from the beginning for searching the last node
                while(current.getLink()!=null){
                    current=current.getLink(); // after it comes to the last node, it will stop going to the upcoming node(beacuse there will be not)
                }
                last = current; //then the last node will be the current node ( current node not the last there is one more node after it
                // but we are not going to it's pointer
                current.setLink(null); // then the pointer gonna be deleted becuase we need to make it the last
            }
        }
    }

}
