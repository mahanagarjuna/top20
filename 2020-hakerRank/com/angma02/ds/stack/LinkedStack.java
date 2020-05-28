package com.angma02.ds.stack;

import com.angma02.ds.stack.LinkNode;

/**
 * 
 * @param <T>
 */
public class LinkedStack<T> {

    private int length;
    private LinkNode top;

    public LinkedStack() {
        length = 0;
        top = null;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack<>();

        try {
            for (int i = 0; i < 10; i++) {
                stack.push(i);
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("** Popping Element: " + stack.pop());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Stack Elements: \n" + stack.toString());

    }

    /**
     * Push the top node down and make a new Top
     * 
     * @param data
     */
    public void push(int data) {
        LinkNode temp = new LinkNode(data);

        temp.setNext(top);
        top = temp;
        length++;
    }

    /**
     * 
     * @return
     */
    public int pop() throws Exception {
        int result;
        if (isEmpty()) {
            throw new Exception("LinkedStack is Empty!!");
        } else {

            LinkNode temp = top;
            top = top.getNext();
            length--;

            return temp.getData();
        }

    }

    /**
     * Return TRUE is the stack is empty.
     * 
     * @return
     */
    private boolean isEmpty() {
        return (length == 0);
    }

    /**
     * Returns the size of the stack
     * 
     * @return length
     */
    public int size() {
        return this.length;
    }

    /**
     * Return the top value, but doesn't delete it.
     * 
     * @return
     * @throws Exception
     */
    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is Empty!!");

        return top.getData();
    }

    /**
     * 
     */
    public String toString() {
        String result = "";

        LinkNode current = top;
        while (current != null) {
            result = result + current.getData() + "\n";
            current = current.getNext();
        }

        return result;
    }

}