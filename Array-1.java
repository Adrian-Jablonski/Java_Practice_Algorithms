// Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

public boolean firstLast6(int[] nums) {
  int numLen = nums.length - 1;
  return nums[0] == 6 || nums[numLen] == 6;
}

// Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

public boolean sameFirstLast(int[] nums) {
  int numLen = nums.length - 1;
  if (numLen < 0) {
    return false;
  }
  return nums[0] == nums[numLen];
}

// Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

// Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.

public boolean commonEnd(int[] a, int[] b) {
  int aLen = a.length - 1;
  int bLen = b.length - 1;
  return a[aLen] == b[bLen] || a[0] == b[0];
}

// Given an array of ints length 3, return the sum of all the elements.

public int sum3(int[] nums) {
  int sum = 0;
  for (int num: nums) {
    sum += num;
  }
  return sum;
}

// Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

public int[] rotateLeft3(int[] nums) {
  int[] rotateNums = {nums[1], nums[2], nums[0]};
  return rotateNums;
}

// Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

public int[] reverse3(int[] nums) {
  int[] revNums = {nums[2], nums[1], nums[0]};
  return revNums;
}

// Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.

public int[] maxEnd3(int[] nums) {
  int maxInt = nums[0] > nums[2] ? nums[0] : nums[2];
  int[] max3 = {maxInt, maxInt, maxInt};
  return max3;
}

