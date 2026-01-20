public class MyLL<T> {
    private class Node {
        public Node next;
        public T value;

        public Node(T value, Node next){
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

    public void addToBack(T toAdd){
        Node newNode = new Node(toAdd, null);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }


    public boolean contains(T toFind){
        Node current = head;
        while (current != null){
            if (current.value.equals(toFind)){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public T remove(T toRemove){
        if (head == null) return null;

        if (head.value == toRemove) head = head.next;


        Node current = head;
        while (current.next != null){
            if (current.next.value == toRemove){
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }

        return null;
    }
}