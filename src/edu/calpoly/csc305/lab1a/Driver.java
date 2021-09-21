package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String[] args) {
    Example ex = new Example("Ryan", new int[]{1, 2, 3, 4, 5});
    int total = 0;

    System.out.println(ex.sameName("Ryan"));

    while (true) {
      int num = ex.getNums()[0];
      total += num;
      break;
    }

    System.out.println(total);
  }
}

