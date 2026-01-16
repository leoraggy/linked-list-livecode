public class MyLL {
    private class Node {
        public Node next;
        public char value;

        public Node(char value, Node next){
            this.value = value;
            this.next = next;

        }
    }

    private Node head;

    public MyLL(){
        head = null;
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public boolean contains(char toFind){
        Node current = head;
        while (current != null){
            if (current.value == toFind){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public char remove(char toRemove){
        if (head == null) return '\0';

        if (head.value == toRemove) head = head.next;


        Node current = head;
        while (current.next != null){
            if (current.next.value == toRemove){
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }

        return '\0';
    }
}