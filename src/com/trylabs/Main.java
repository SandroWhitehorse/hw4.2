package com.trylabs;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
 int [] sportsmensMarks = new int[10];
 Random random=new Random();
 int sum=0;
 for (int i=0;i<sportsmensMarks.length;i++){
     sum=sum+sportsmensMarks[i]; }
     if (sum>=60)
     System.out.println ("Sportsmen going next level of sport competitions");
        else System.out.println("Sportsmen not going next level of sport competitions\"");




    }
}
