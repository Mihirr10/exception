package com.exception;

public class Main {

  public static void main(String[] args) {

    int number1 = 10;
    int number2 = 0;

    try {
      int result = number1 / number2;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("You should not divide the number by zero !!");
    } catch (Exception e) {
      System.out.println("Exception occured");
    } finally {
      System.out.println("finally block is executed");
    }

  }
}