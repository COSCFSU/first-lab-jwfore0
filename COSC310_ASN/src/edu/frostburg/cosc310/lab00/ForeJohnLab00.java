/*
 * John W. Fore
 * Date : 09/07/2018
 * Description:
 */
package edu.frostburg.cosc310.lab00;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author John
 */
public class ForeJohnLab00 implements Lab00{

/**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    
    public long problem2(int size) {
       
        ArrayList arrayList = new ArrayList();
 
       //Start of ArrayList time
       long start0 = System.currentTimeMillis();
       for(int i = 0; i < size; i++){
           arrayList.add(i);
       }
       long end0 = System.currentTimeMillis();
       long arrayTime0 = end0 - start0;
       //End of ArrayList time 
       
       return arrayTime0;
       
    }
    
    public long problem22(int size) {
       
       LinkedList linkedList = new LinkedList();
       
       //Start of LinkedList time
       long start1 = System.currentTimeMillis();
       for(int i = 0; i < size; i++){
           linkedList.add(i);
       }
       long end1 = System.currentTimeMillis();
       long linkedTime1 = end1 - start1;
       // End of LinkedList time
       
       return linkedTime1;
       
    }
    
}
