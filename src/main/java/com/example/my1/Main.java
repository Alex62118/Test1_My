package com.example.my1;

class Main {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;

    int result1 = a + b;
    int result2 = a * b;

    System.out.println(result1);
    System.out.println(result2);

    int[] arr = {15, 27, 3, 344, 17 };
    int summ = 0;
    for (int i: arr) {
      summ += i;
    }
    System.out.println(summ / arr.length);
  }
}