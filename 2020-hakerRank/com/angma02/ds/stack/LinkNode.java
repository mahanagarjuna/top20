package com.angma02.ds.stack;

public class LinkNode {

    private int data;
    private LinkNode next;

    public LinkNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(LinkNode node) {
        this.next = node;
    }

    public LinkNode getNext() {
        return this.next;
    }

}