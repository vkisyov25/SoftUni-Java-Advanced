public class Main {
    public static void main(String[] args) {

        //testin method addFirst
        LinkedList list = new LinkedList();
        System.out.println(list.isEmpty());
        list.addFirst(5);
        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.addFirst(8);
        System.out.println(list.getHead().value);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());


        //testing method addLast
        list.addLast(3);
        System.out.println(list.getTail().value);
        System.out.println(list.getSize());
        System.out.println("***********************************");

        //testing method removeFirst
        System.out.println(list.removeFirst());
        System.out.println(list.getSize());
        System.out.println(list.getHead().value);
        System.out.println("***********************************");

        //testing method removeLast
        System.out.println(list.removeLast());
        System.out.println(list.getSize());
        System.out.println(list.getTail().value);

        //testing method forEach
        list.forEach(e-> System.out.println(e));


    }
}