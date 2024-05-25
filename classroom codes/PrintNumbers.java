package stud;

import java.util.Scanner;

public class PrintNumbers {
     public void displayNum(){

         int i;
         int rot[]={};
         int arr[]={1,2,3,4,5,6,7,8,9,10};
         Scanner s = new Scanner(System.in);
         System.out.println("enter input");
         int input=s.nextInt();

         for(i=0; i<input; i++){
             System.out.print(arr[i]);
             System.out.print(" ");
         }
         for(i=0;i<input;i++){
             rot[i]=arr[i+1];
         }
         System.out.print(rot[i]);
         System.out.print(" ");
    }
}
/*
    PrintNumbers p = new PrintNumbers();
    p.displayNum();
*/