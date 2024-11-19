package com.qapitol.demo;

import java.util.Random;
import java.util.Scanner;

public class FliptheCoin {
 public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      System.out.print("Enter the number of flips: ");
      int flipcounts = scanner.nextInt();

      int headsCount = 0;
      int tailsCount = 0;

      for (int i = 1; i <= flipcounts; i++) {
          boolean one = random.nextBoolean();
          if (one) {
              headsCount++;
              System.out.println("Flip " + (i) + ": Heads");
          } else {
              tailsCount++;
              System.out.println("Flip " + (i) + ": Tails");
          }
      }

      System.out.println("Total Heads: " + headsCount);
      System.out.println("Total Tails: " + tailsCount);

}
}
