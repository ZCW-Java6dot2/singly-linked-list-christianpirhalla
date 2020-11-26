package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<E extends Comparable<E>>{
    SLLNode<E> head;

    public SinglyLinkedList(SLLNode<E> head){
        this.head = head;
    }

    public SinglyLinkedList(E element){
        this.head = new SLLNode<E>(element);
    }

    public SinglyLinkedList(){
        head = null;
    }

    public void add(E element) {
        SLLNode<E> currNode = head;
        SLLNode<E> nodeToBeAdded = new SLLNode<E>(element);

        if (head == null) { head = nodeToBeAdded;}

        else {
            while (currNode.getNext() != null){
                currNode = currNode.getNext();
            }
            currNode.setNext(nodeToBeAdded);
        }

    }

    public E get(int index){
        SLLNode currNode = head;
        int currIndex = 0;
        if (index > this.size() - 1 || index < 0){throw new IndexOutOfBoundsException("Invalid index");}

            while (currNode != null){
                if (currIndex == index) {
                    return (E) currNode.getElement();
                }
                currNode = currNode.getNext();
                currIndex++;
            }

        return null;
    }


    public boolean remove(int index) {
        SLLNode prevNode = null;
        SLLNode currNode = head;
        int currIndex = 0;
        //what do we do if it's in the head?
        try {
            do {
                if (currIndex == index) {
                    if (prevNode == null){
                        head = null;
                    } else {
                    prevNode.setNext(currNode.getNext());
                    }
                    return true;
                }
                prevNode = currNode;
                currNode = currNode.getNext();
                currIndex++;
            } while (currNode.getNext() != null);
        }
        catch (NullPointerException n){
            System.out.println("Error: head is null");
        }

        return false;

    }

    public boolean contains(E element) {
        SLLNode currNode = head;

        try {
            do {
                if (currNode.getElement().equals(element)) {
                    return true;
                }
                currNode = currNode.getNext();
            } while (currNode.getNext() != null);
        }
        catch (NullPointerException n){
            System.out.println("Error: head is null");
        }

        return false;
    }

    public int find(E desiredElement) {
        SLLNode currNode = head;
        int index = 0;
        try {
            if (head.getNext() == null){ // if the head is the only element
                if (head.getElement().equals(desiredElement)) {
                    return index;
                }
                return -1;
            }
            else {
                while (currNode.getNext() != null) {
                    if (currNode.getElement().equals(desiredElement)) {
                        return index;
                    }
                    currNode = currNode.getNext();
                    index++;
                }
            }
        }
        catch (NullPointerException n){
            System.out.println("Head is null");
        }

        return -1;
    }

    public int size() {
        SLLNode currNode = head;
        if (head == null) {return 0;}
        int size = 1;

        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
            size++;
        }
        return size;
    }


    public SinglyLinkedList<E> copy() {
        SinglyLinkedList<E> copyOfThisList = new SinglyLinkedList<E>();

        SLLNode<E> currNode = head;

        while (currNode != null){
            copyOfThisList.add(currNode.getElement());
            currNode = currNode.getNext();
        }
        return copyOfThisList;
    }


    public void sort() {
        SLLNode<E> currNode = head;
        SLLNode<E> prevNode = null;
        Boolean swapped = true;
        while (swapped) {
            swapped = false;
            prevNode = null;
            currNode = head;
            while (currNode.getNext() != null) {
                SLLNode<E> nextNode = currNode.getNext();
                if (currNode.getElement().compareTo(nextNode.getElement()) == 1) {
                    currNode.setNext(nextNode.getNext());
                    nextNode.setNext(currNode);
                    if (prevNode != null){
                        prevNode.setNext(nextNode);
                    } else { head = nextNode;}

                    swapped = true;
                }
                else {
                    prevNode = currNode;
                    currNode = currNode.getNext();
                }
            }
        }

    }


}

