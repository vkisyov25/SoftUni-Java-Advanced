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

        /*//testing method removeFirst
        System.out.println(list.removeFirst());
        System.out.println(list.getSize());
        System.out.println(list.getHead().value);
        System.out.println("***********************************");

        //testing method removeLast
        System.out.println(list.removeLast());
        System.out.println(list.getSize());
        System.out.println(list.getTail().value);

        //testing method forEach
        list.forEach(e-> System.out.println(e));*/


        //testing method addAfter
        list.addAfter(5,7);
        list.forEach(e-> System.out.printf("%d ",e));
        System.out.println();
        System.out.println("***************************");

        list.addAfter(3, 25);
        list.forEach(e-> System.out.printf("%d ",e));
        System.out.println();
        System.out.println("***************************");


        /*//error
        list.addAfter(10,111);
        list.forEach(e-> System.out.print(e));
        System.out.println("***************************");*/


        list.removeAfter(3);
        list.forEach(e-> System.out.printf("%d ",e));
        System.out.println();
        System.out.println("--------------------------");

        list.removeAfter(8);
        list.forEach(e-> System.out.printf("%d ",e));
        System.out.println();
        System.out.println("---------------------------");

        /*//error
        list.removeAfter(3); list.forEach(e-> System.out.printf("%d ",e));
        System.out.println();
        System.out.println("***************************");*/


    }
}