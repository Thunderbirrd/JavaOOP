package com.company.seven;

public class DoubleList extends Struct {
    static class Node{
        private Node next;
        private Node prev;
        private final int value;

        public Node(Node next, Node prev, int value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public DoubleList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int pop() {
        int a = last.value;
        last = last.prev;
        size--;
        return a;
    }

    @Override
    public void push(int el) {
        Node node = new Node(first, null, el);
        if(first == null && last == null){
            first = node;
            last = node;
        }
        else if (first == last){
            first = node;
            first.next = last;
            last.prev = first;
        } else {
            assert first != null;
            first.prev = node;
            first = node;
        }
        size++;
    }
    @Override
    public int get() {
        return last.value;
    }
}
