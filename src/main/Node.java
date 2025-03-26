package main;

public class Node {
    private Node head;
    private Node tail;
    private int size;
    public Node(){
        this.size=0;
    }
    public void insert(int data){

    }
    private class Node1 {
        private int data;
        private Node next;

        public Node1(int data) {
            this.data = data;
        }

        public Node1(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
