package com.SamplePackage;

import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("Enter password :");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
          int n = Validation(s1);
          if(n == 1){
              System.out.println("It is a valid password");
          }
          else {
              System.out.println("It is not a valid password");
          }
    }
    private static int Validation(String s1) {
        if(s1.matches(".*[0-9]{1,}.*") && s1.matches(".*[@#$]{1,}.*") && s1.length() >=6 && s1.length()<=20){
            return  1;
        }
        else
        {
            return -1;
        }
    }
}
