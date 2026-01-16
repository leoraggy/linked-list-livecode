public class Practice {
    public static void main(String[] args) {
        System.out.println("~linked lists practice~");
        Node head = new Node('g', null);
        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null);

        printList(head);

        System.out.println(contains(head, 'x'));
        System.out.println(contains(head, 'f'));

        System.out.println(remove(head, 'z'));
    }

    public static void printList(Node start){
        Node current = start;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(Node start, char toFind){
        Node current = start;
        while (current != null){
            if (current.value == toFind){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public static char remove(Node head, char toRemove){
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