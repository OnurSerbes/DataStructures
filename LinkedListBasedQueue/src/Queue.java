
import javax.lang.model.element.Element;

public class Queue {
    private Node front;
    private Node rear;

    public Queue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return (front==null);
    }

    public void initializeQueue(){
        front = null;
        rear = null;
    }

    public int getFront(){
        assert (front != null);
        return front.getInfo();
    }

    public int getRear(){
        assert (rear != null);
        return rear.getInfo();
    }

    public void addQueue(int newElement){
        Node a = new Node (newElement);

        if(front == null){ //if the queue is empty
            front = rear = a;
        }else { // add new node at the end
            rear.setLink(a);
            rear = rear.getLink();
        }
    }

    public void deleteQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            front = front.getLink();
            if (front == null){ // if after deletion the queue is empty
              rear = null; // also set rear to null
            }
        }
    }

    public void outputQueue(){
        if (!isEmpty()){
            Node c = new Node();
            c = front;
            while (c != null){
                System.out.println(c.getInfo());
                c = c.getLink();
            }
        }
    }
}
