package com.vetias.java.workshop.basics.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.vetias.java.workshop.basics.Wordcount;


public class Wordcounttest 
{
  @Test
    public void testWordCount(){
    
      Wordcount wordcount=new Wordcount();
      int count=wordcount.count("this is a java program to count words in a string");
      Assertions.assertEquals(11, count);
    }
  @Test
    public void testAnotherString(){
      Wordcount wordcount=new Wordcount();
      int count=wordcount.count("Vinu priya");
      Assertions.assertEquals(2, count);

    }
}
