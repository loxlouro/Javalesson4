
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Node> theQueue = new LinkedList<>();
        Node first = new Node("i");
        Node second = new Node("j");
        theQueue.addFirst(first);
        theQueue.addFirst(second);
        Node third =new Node("g");
        enqueue(theQueue,third);
        toStringQueue(theQueue);
        dequeue(theQueue);
        toStringQueue(theQueue);
        System.out.println(theFisrt(theQueue).data);

    }

    public static void enqueue (LinkedList<Node> queue, Node newLast){
        Node current = queue.getFirst();

        if (current==null){
            queue.addFirst(newLast);
        } else {
            while (current.next!=null){
                current=current.next;
            }

            current.next = newLast;
        }

    }

    public static Node dequeue(LinkedList<Node> queue){
        Node theFirst = queue.getFirst();
        Node buffer = queue.getFirst().next;
        queue.removeFirst();
        queue.addFirst(buffer);
        return theFirst;
    }

    public static Node theFisrt(LinkedList<Node> theQueue){
        return theQueue.getFirst();
    }

    public static void toStringQueue(LinkedList<Node> theQueue){
        for (Node i:theQueue){
            System.out.print(i.data+"\t");
        }
        System.out.println();
    }

    public static class Node{
        String data;
        public Node next;

        public Node(String data){
            this.data = data;
            next=null;
        }
    }
}