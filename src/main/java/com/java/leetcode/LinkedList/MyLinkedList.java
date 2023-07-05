package com.java.leetcode.LinkedList;

public class MyLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    public MyLinkedList() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
    }

    public int get(int index) {
        if(index <0 || index >=size)
            return -1;
        Node temp = head;
        for(int i=0;i<=index;i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index<0 || index > size)
            return;
        Node temp = head;
        for(int i=0;i< index ;i++){
            temp = temp.next;
        }
        Node n = new Node(val);
        n.next = temp.next;
        temp.next = n;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index >= size)
            return;
        Node temp = head;
        for(int i=0;i< index ;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
}
