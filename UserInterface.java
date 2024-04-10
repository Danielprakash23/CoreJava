package com.ArrayMapping;


	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class UserInterface {

	    public static String getDuplicateElement() {
	        Scanner scanner = new Scanner(System.in);
	        int size;
	        int[] array;
	        int index;

	        try {
	            System.out.println("Enter the size of the array:");
	            size = scanner.nextInt();

	            if (size < 0) {
	                throw new NegativeArraySizeException();
	            }

	            array = new int[size];
	            System.out.println("Enter the elements of the array:");
	            for (int i = 0; i < size; i++) {
	                array[i] = scanner.nextInt();
	            }

	            System.out.println("Enter the index to replicate:");
	            index = scanner.nextInt();

	            return "The array elements are " + array[index] + " " + array[index];
	        } catch (NegativeArraySizeException e) {
	            return "Array size should be positive";
	        } catch (ArrayIndexOutOfBoundsException e) {
	            return "Array index is out of range";
	        } catch (InputMismatchException e) {
	            return "Input was not in the correct format";
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(getDuplicateElement());
	    }
	}


