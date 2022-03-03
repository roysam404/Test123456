package com.SamplePackage;

public class Reverse {

    static void swap(String m, int length)
    {

        String msg[] = m.split(" ");

        String temp = msg[0];
        msg[0] = msg[msg.length - 1];
        msg[msg.length - 1] = temp;

        String mid = "";
 
        for (int i = msg.length - 2; i >= 1; --i) 
        {
            String temp_s = msg[i];
            for (int j = temp_s.length() - 1; j >= 0; --j) 
            {
                mid += temp_s.charAt(j);
            }
            mid += " ";
        }
 
  
        System.out.print(msg[0] + " " + mid + " " + msg[msg.length - 1]);
    }
 
   
    public static void main(String[] args)
    {
        
        String m = "Samir this is the Sudeshna";
        int length = m.length();
        swap(m, length);
    }
}
