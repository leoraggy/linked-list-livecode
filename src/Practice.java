public class Practice {
    public static void main(String[] args) {
        // Node head = new Node('g', null);
        // Node ryan = new Node('s', null);
        // head.next = ryan;
        // ryan.next = new Node('t', null);
        // ryan.next.next = new Node('x', null);

        // printList(head);

        // System.out.println(contains(head, 'x'));
        // System.out.println(contains(head, 'f'));

        // System.out.println(remove(head, 'z'));
        MyLL<Character> list = new MyLL<>();
        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');
        
        list.printList();
        System.out.println("Backwards now");
        list.printListBackwards();


        
        // MyLL<Integer> intList = new MyLL<>();
        // intList.addToBack(5);
        // intList.addToBack(99);
        // intList.addToBack(2);
        // intList.addToBack(-333333);
        // intList.addToBack(66);

        // intList.printList();

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