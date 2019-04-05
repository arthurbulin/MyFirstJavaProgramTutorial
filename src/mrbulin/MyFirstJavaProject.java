/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrbulin;

import java.util.Scanner;

/**
 *
 * @author Arthur Bulin
 */
public class MyFirstJavaProject {
    public static void main (String[] args){
        System.out.println("Hello World!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println(
                "Hello " 
                + name 
                + " nice to meet you!");
    }
    
}
