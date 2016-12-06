//**********************************************************
// Assignment: J3A1P2
//
// Description: Write a program that asks the user to enter a number of minutes. 
//              Your program will convert the number of minutes and display the 
//              equivalent number of days, remaining hours and remaining minutes.
//
// Author: Darshil Patel
// Date Completed: Oct 28, 2016
//
// Completion time: 15 mins
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************


import java.util.*;

public class J3A1P2{
   public static void main (String[] args)
   {
      Scanner stdin = new Scanner(System.in);

      int days, hours, minutes, mLeft;
      final int MINUTES_PER_DAY = 1440;
      final int MINUTES_PER_HOUR = 60;
   
      System.out.println ("Please enter the number of minutes: ");
      minutes = Integer.parseInt(stdin.nextLine());
   
      days = minutes / MINUTES_PER_DAY;
      mLeft = minutes % MINUTES_PER_DAY;
      hours = mLeft / MINUTES_PER_HOUR;
      mLeft = mLeft % MINUTES_PER_HOUR;
       System.out.println (minutes + " minutes = " + (days) + " days, " + (hours) + " hours and " + (mLeft) + " minutes.");
   
   }}