package com.array.samples;

import java.util.HashMap;
import java.util.Map;

public class ArrayAlgorithm {

  //Search Insert Position
  public int getIndexArray(final int[] numbers, final int target) {
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == target){
        return i;
      }
      if(numbers[i + 1] > target ){
        return i +1;
      }
    }
    return 0;
  }

  //Best time to buy and sell stocks
  public int maxProfit(final int[] prices) {
    int maxCur = 0, maxSoFar = 0;
    for(int i=1; i < prices.length; i++){
      maxCur = Math.max(0, (maxCur += prices[i] - prices[i-1]));
      maxSoFar = Math.max(maxCur, maxSoFar);
    }
    return maxSoFar;
  }

  //Two sum
  public int twoSum(final int[] numbers, final int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] indices = new int[2];
    for (int i = 0; i < numbers.length; i++) {
      Integer number = map.get(target - numbers[i]);
      if(number == null){
        map.put(numbers[i], i);
      }else{
        indices[0] = number;
        indices[1] = i;
        break;
      }
    }

    return indices[0];
  }
}
