package com.array.samples;
import org.junit.Assert;
import org.junit.Test;

public class ArrayAlgorithmTest {

  /*
  Easy algorithms
   */

  //Search Insert Position
  @Test
  public void getIndexArrayTest(){
    ArrayAlgorithm arrayAlgorithm = new ArrayAlgorithm();
    int[] numbers = {1, 3, 5, 7};
    int target = 5;
    int index = arrayAlgorithm.getIndexArray(numbers, target);
    Assert.assertEquals(2, index);
  }

  //Best time to buy and sell stocks
  //the first item in the array is buy and the second is sell
  @Test
  public void maxProfitTest(){
    ArrayAlgorithm arrayAlgorithm = new ArrayAlgorithm();
    int[] prices = {7, 1, 5, 3, 6, 4};
    Assert.assertEquals(5, arrayAlgorithm.maxProfit(prices));
  }

  //Two sum
  @Test
  public void twoSumTest(){
    ArrayAlgorithm arrayAlgorithm = new ArrayAlgorithm();
    int[] nums = {2, 7, 11, 15, 3};
    int target = 5;
    Assert.assertEquals(0, arrayAlgorithm.twoSum(nums, target));
  }

}
