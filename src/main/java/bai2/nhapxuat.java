/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Shu
 */
public class nhapxuat {
    public static void main(String[] arge)
    {
        boolean flag = true;
        int a = 59;
        byte b = 1;
        double c = 16.9;
        float d = 9.1f;
        String s = "Hello";
        char ch = 'E';
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap ho va ten cua ban: ");
        String hoten = sc.nextLine();
        System.out.println("Ho va ten cua ban la: " + hoten);
        
        System.out.println("Hay nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("So nguyen cua ban la: " + a);
        
        System.out.println("Hay nhap vao mot so thuc: ");
        input = sc.nextLine();
        c = Double.parseDouble(input);
        System.out.println("So thuc cua ban la: " + c);
    }
}
