/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc310_test;

import edu.frostburg.cosc310.lab00.ForeJohnLab00;

/**
 *
 * @author SK
 */
public class COSC310_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ForeJohnLab00 lab = new ForeJohnLab00();
        System.out.println("Problem #0 : " + lab.problem0(9999));
        System.out.println("Problem #1 : " + lab.problem1(9999));
        System.out.println("Problem #2 : ArrayList - " + lab.problem2(9999999) + " LinkedList - " + lab.problem22(9999999));
    }
    
}
