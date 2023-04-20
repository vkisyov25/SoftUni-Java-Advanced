import java.awt.dnd.InvalidDnDOperationException;
import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void addFirst(int elem){
        Node newNode = new Node(elem);

        if(this.isEmpty()){
            this.head = newNode;
            this.tail = newNode;
            //next and prev pint to null by default
            //node.next = null;
            //node.prev = null;
        }else {
            //first action
            this.head.prev = newNode;
            //second action
            newNode.next = this.head ;
            //third action
            this.head = newNode;
        }
        this.size++;
    }

    public void addLast(int elem){
        Node newNode = new Node(elem);
        if(this.isEmpty()){
            this.head = newNode;
            this.tail = newNode ;

        }else {
            this.tail.next = newNode;
           newNode.prev = this.tail;
           this.tail = newNode;

        }

        this.size++;

    }

    public int removeFirst(){
        if(this.isEmpty()){
            throw  new InvalidDnDOperationException("Remove called for collection with size 0");
        }

        int deleteElement = this.head.value;
        if(this.size == 1){
            this.head = null;
            this.tail = null;
        }else {
            this.head = this.head.next;
            this.head.prev = null;
        }

        this.size--;

        return deleteElement;
    }

    public int removeLast(){
        if(this.isEmpty()){
            throw  new InvalidDnDOperationException("Remove called for collection with size 0");
        }
        int lastElement = this.tail.value;

        if(this.size == 1){
            this.head = null;
            this.tail= null;
        }else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }

        this.size--;

        return lastElement;
    }

    public void forEach(Consumer<Integer> consumer){
        Node current = this.head;

        while (current !=null){
            consumer.accept((current.value));

            current = current.next;
        }
    }

    public void addAfter(int searchElement, int newElement){
        if(this.isEmpty()){
            throw new InvalidDnDOperationException("addAfter on empty list");
        }

        Node current = this.head;
        while ((current != null)){
            if(current.value == searchElement){
                Node newNode = new Node(newElement);

                newNode.next = current.next;
                newNode.prev = current;

                if(current.next != null){
                    current.next.prev = newNode;
                }else{
                    this.tail = newNode;

                }

                current.next = newNode;

                this.size++;
                return;
            }

            current = current.next;
        }


    }


}
