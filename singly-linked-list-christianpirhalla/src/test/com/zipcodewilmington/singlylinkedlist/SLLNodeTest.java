package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SLLNodeTest {

    @Test
    public void constructorTest(){
        //Given
        String expectedElement = "Hello";
        SLLNode expectedNext = null;
        SLLNode<String> slln = new SLLNode<String>("Hello");

        //When
        String actualElement = slln.getElement();
        SLLNode actualNext = slln.getNext();

        //Then
        Assert.assertEquals(expectedElement, actualElement);
        Assert.assertEquals(expectedNext, actualNext);
    }
}
