package com.zipcodewilmington.singlylinkedlist;


public class SLLNode<E> {

    private E data;
    private SLLNode next;


    public SLLNode(E data) {
        this.data = data;
    }


    public E getElement() {
        return data;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next){
        this.next = next;
    }
}
