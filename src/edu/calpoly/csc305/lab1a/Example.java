package edu.calpoly.csc305.lab1a;

import java.util.Objects;

class Example {
  private final String name;
  private int[] nums = {1, 2, 3, 4, 5};

  public Example(String name, int[] nums) {
    this.name = name;
    this.nums = nums;
  }

  boolean sameName(String other) {
    return Objects.equals(other, name);
  }

  public int[] getNums() {
    return nums;
  }
}  
