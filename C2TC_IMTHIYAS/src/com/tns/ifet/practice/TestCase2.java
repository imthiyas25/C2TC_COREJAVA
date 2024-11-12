package com.tns.ifet.practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestCase2 {

		    public static int sumOfDigits(int number) {
		        int sum = 0;
		        while (number > 0) {
		            sum += number % 10;
		            number /= 10;
		        }
		        return sum;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Taking inputs
		        System.out.print("Enter n: ");
		        int n = scanner.nextInt();
		        System.out.print("Enter m: ");
		        int m = scanner.nextInt();
		        System.out.print("Enter N: ");
		        int targetSum = scanner.nextInt();

		        List<Integer> results = new ArrayList<>();
		        for (int i = n; i <= m; i++) {
		            int digitSum = sumOfDigits(i);
		            if (digitSum == targetSum) {
		                results.add(i);
		            }
		        }
		        System.out.println("The results are: " + results);
		        System.out.println("\nExplanation:");
		        for (int number : results) {
		            System.out.print(number + " => ");

		            int num = number;
		            int calculatedSum = 0;
		            while (num > 0) {
		                int digit = num % 10;
		                calculatedSum += digit;
		                num /= 10;
		                System.out.print(digit + (num > 0 ? "+" : "="));
		            }
		            System.out.println(calculatedSum);
		        }

		        scanner.close();
		    }
		}