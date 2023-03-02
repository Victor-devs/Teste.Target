package testeFibonacci;

import java.util.Scanner;

public class TesteFibonacci {

	    public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	        int num;

	        System.out.print("Digite um número inteiro positivo: ");
	        num = input.nextInt();

	        int a = 0, b = 1, c;
	        boolean pertence = false;

	        while (b <= num) {
	            if (b == num) {
	                pertence = true;
	                break;
	            }
	            c = a + b;
	            a = b;
	            b = c;
	        }

	        if (pertence) {
	            System.out.println(num + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println(num + " não pertence à sequência de Fibonacci.");
	        }
	    }
	}
	
