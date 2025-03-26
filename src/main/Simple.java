package main;

public class Simple {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(head.data + " ");
            temp = temp.next;
        }

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {             //constructor
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(5);           //object(Node)
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);

        a.next = b;                //nodes  ko akdusre se link ke liye
        b.next = c;                 // like 5-3 9 8 16
        c.next = d;                // 5-3-9 8 16
        //5-3-9-8 16  ak ak krke link ho rhii h

        //System.out.println(a.next);    // out-null

//        System.out.println(a.data);      //out-5
//        System.out.println(b.data);      //out-5
//        System.out.println(d.data);     //out-9
//        System.out.println(e.data);     //out-8
//        System.out.println(a.next.data);
//        System.out.println(b.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(d.next.data);

        //or
//        Node temp=a;                   //print the list
//
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp=temp.next;     //or  temp=temp.b;
//        }


        //or
        display(a);


    }

}
