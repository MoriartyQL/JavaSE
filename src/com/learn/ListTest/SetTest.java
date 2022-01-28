package com.learn.ListTest;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Cedirc_Adie
 */
public class SetTest {

    @Test
    public void setTest(){
        Collection collection = new ArrayList(10);
        collection.add(10);
        collection.add(9);
        collection.add(10);
        collection.add(10);
        collection.add(10);
        collection.add(10);

        for(Object o :collection){
            System.out.println(o);
        }

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
