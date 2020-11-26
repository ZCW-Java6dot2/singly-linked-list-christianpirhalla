package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest(){
        //Given
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        Integer expected = 4;

        //When
        sll.add(expected);
        Integer actual = sll.get(0);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        //Given
        boolean expected = false;
        int expectedValue = 4;
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(expectedValue);

        //When
        sll.remove(0); // should only be one element in the list
        boolean actual = sll.contains(expectedValue);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void containsTest(){
        //Given
        boolean expected = true;
        int valueToBeAdded = 5;
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.add(valueToBeAdded);

        //When
        boolean actual = sll.contains(valueToBeAdded);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTest(){
        //Given
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        int val1 = 10;
        int val2 = 20;
        int val3 = 30;
        sll.add(val1);
        sll.add(val2);
        sll.add(val3);
        //the value at index 1 (the 2nd element) should be val2
        int expectedIndex = 1;

        //When
        int actualIndex = sll.find(val2);

        //Then
        Assert.assertEquals(expectedIndex, actualIndex);

    }

    @Test
    public void findTest2(){
        //Given
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        int val1 = 10;
        sll.add(val1);
        int expectedIndex = -1;

        //When
        int actualIndex = sll.find(20);

        //Then
        Assert.assertEquals(expectedIndex, actualIndex);

    }

    @Test
    public void findTest3(){
        //Given
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        int expectedIndex = -1;

        //When
        int actualIndex = sll.find(20);

        //Then
        Assert.assertEquals(expectedIndex, actualIndex);

    }

    @Test
    public void sizeTest(){
        //Given
        int expected = 3;
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();

        //When
        sll.add(1);
        sll.add(2);
        sll.add(3); // there are now 3 elements inside
        int actual = sll.size();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void copyTest(){
        //Given
        SinglyLinkedList<Integer> original = new SinglyLinkedList<Integer>();
        int expected1 = 2;
        int expected2 = 4;
        int expected3 = 6;
        original.add(expected1);
        original.add(expected2);
        original.add(expected3);

        //When
        SinglyLinkedList<Integer> copy = original.copy();
        int actual1 = copy.get(0);
        int actual2 = copy.get(1);
        int actual3 = copy.get(2);

        //Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }

    @Test
    public void sortTest(){
        //Given
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        int expected1 = 2;
        int expected2 = 4;
        int expected3 = 6;
        sll.add(expected2);
        sll.add(expected3);
        sll.add(expected1);

        //When
        sll.sort();
        int actual1 = sll.get(0);
        int actual2 = sll.get(1);
        int actual3 = sll.get(2);

        //Then
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
    }



}
