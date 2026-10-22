// import java.util.*;
// class Node{ // user defined data type
//     int val;
//     Node next;
//     Node(int val){
//         this.val=val; 
//     }
// }
// class LinkedList{ // user define data structure
// Node head; //null
// Node tail; // null
// int search(int val){
//   if(head==null) return -1;
//   Node temp=head;
//   int idx=0;
//   while(temp !=null){
//     if(temp.val==val) return idx;
//     temp=temp.next;
//     idx++;
//   }
//   return -1;
// }

// void addAtHead(int val) {
//     Node temp = new Node(val);

//     if (head == null) {
//         head = tail = temp;
//     } else {
//         temp.next = head;
//         head = temp;
//     }
//     size++;
// }

// void addAtTail(int val) {
//     Node temp = new Node(val);

//     if (tail == null) {
//         head = tail = temp;
//     } else {
//         tail.next = temp;
//         tail = temp;
//     }
//     size++;
// }

// void deleteAtHead() {
//     if (head == null) {
//         System.out.println("List is empty!");
//         return;
//     }

//     head = head.next;
//     size--;

//     if (head == null) {
//         tail = null;
//     }
// }

// void insert(int val, int idx) {
//     if (idx < 0 || idx > size) {
//         System.out.println("Invalid Index!");
//         return;
//     }

//     if (idx == 0) {
//         addAtHead(val);
//         return;
//     }

//     if (idx == size) {
//         addAtTail(val);
//         return;
//     }

//     Node temp = head;

//     for (int i = 1; i < idx; i++) {
//         temp = temp.next;
//     }

//     Node t = new Node(val);
//     t.next = temp.next;
//     temp.next = t;
//     size++;
// }

// void delete(int idx) {
//     if (idx < 0 || idx >= size) {
//         System.out.println("Invalid Index!");
//         return;
//     }

//     if (idx == 0) {
//         deleteAtHead();
//         return;
//     }

//     Node temp = head;

//     for (int i = 1; i < idx; i++) {
//         temp = temp.next;
//     }

//     temp.next = temp.next.next;

//     if (idx == size - 1) {
//         tail = temp;
//     }

//     size--;
// }

// public class LinkedListDataStructure {
//       public static void main(String args[]){
//         LinkedList ll=new LinkedList();
//         ll.addAtTail(1540);
//         ll.addAtTail(98);
//         ll.addAtTail(65);
//         ll.addAtTail(25);
//         ll.display();
//         ll.addAtHead(54);
//          ll.display();
//          ll.deleteAtHead();
//           ll.display();
//           ll.insert(45,2);
//       }
// }


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    // Search for a value and return its index
    int search(int val) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.val == val) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1;
    }

    // Add a node at the beginning
    void addAtHead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    // Add a node at the end
    void addAtTail(int val) {
        Node temp = new Node(val);

        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    // Delete the first node
    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    // Insert a node at a specified index
    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (idx == 0) {
            addAtHead(val);
            return;
        }

        if (idx == size) {
            addAtTail(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;

        size++;
    }

    // Delete a node at a specified index
    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
            return;
        }

        if (idx == 0) {
            deleteAtHead();
            return;
        }

        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (idx == size - 1) {
            tail = temp;
        }

        size--;
    }

    // Display all nodes
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Return the number of nodes
    int getSize() {
        return size;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addAtTail(1540);
        ll.addAtTail(98);
        ll.addAtTail(65);
        ll.addAtTail(25);

        ll.display();

        ll.addAtHead(54);
        ll.display();

        ll.deleteAtHead();
        ll.display();

        ll.insert(45, 2);
        ll.display();

        ll.delete(2);
        ll.display();

        System.out.println("Index of 65: " + ll.search(65));
        System.out.println("Size: " + ll.getSize());
    }
}
