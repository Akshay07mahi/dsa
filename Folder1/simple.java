/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> result = nums.stream()
    .filter(n -> n % 2 != 0)
       .map(n -> n * n)
    .collect(Collectors.toList());
    
    
    for ( int i : result)
    {
        System.out.print(" "+i);
    }

        // SinglyLinkedList list = new SinglyLinkedList();
        // list.insertFirst(5);
        // list.insertLast(10);
        // list.insertFirst(3);
        // list.insertFirst(7);
        // list.insertLast(1);
        // list.insertFirst(2);

        // list.print(); 
        
        // System.out.println(" Deleting First");
        // list.deleteFirst();
        
        // System.out.println(" Deleteing  last ");
        // list.deleteLast();
        
        // System.out.println(" deleting based on Value");
        // list.deleteByvalue(5);
        //  list.print(); 
    }
}

// class SinglyLinkedList {
//     private Node head = null;

//     private static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void insertFirst(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     public void insertLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
    
//     public void deleteFirst()
//     {
//         if ( head == null)
//         {
//             System.out.println(" the list is empty ");
//             return;
//         }
        
//         System.out.println(" deleted "+head.data);
//         head = head.next;
//     }
//     public void deleteByvalue(int d)
//     {
//         if( head == null)
//         {
//             System.out.println(" no list item");
//             return;
//         }
//         Node temp = head;
        
//         while( temp.next != null)
//         {
//             if( temp.data  == d)
//             {
//                 System.out.println(" Deleted "+temp.data);
//                 temp= temp.next;
//                 return;
//             }
//         }
        
//     }
    
//     public void deleteLast()
//     {
//         if ( head == null)
//         {
//             System.out.println(" the  List is null");
//             return;
//         }
        
//         Node temp = head;
        
//         while ( temp.next != null )
//         {
//         temp = temp.next;
        
//         }
        
//         System.out.println(" Delted Item is "+temp.data);
//         temp = null;
//     }
// }
