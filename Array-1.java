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

// Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

public int sum2(int[] nums) {
  if (nums.length == 0) {
    return 0;
  }
  else if (nums.length == 1) {
    return nums[0];
  }
  else {
    return nums[0] + nums[1];
  }
}

// Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

public int[] middleWay(int[] a, int[] b) {
  int[] middle = {a[1], b[1]};
  return middle;
}

// Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

public int[] makeEnds(int[] nums) {
  int[] newNums = {nums[0], nums[nums.length - 1]};
  return newNums;
}

// Given an int array length 2, return true if it contains a 2 or a 3.

public boolean has23(int[] nums) {
  for (int num : nums) {
    if (num == 2 || num == 3) {
      return true;
    }
  }
  return false;
}

// Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

public int[] makeLast(int[] nums) {
  int newArrLen = nums.length * 2;
  int [] newNums = new int[newArrLen];
  newNums[newArrLen - 1] = nums[nums.length - 1];
  return newNums;
}

// Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

public boolean double23(int[] nums) {
  int count2 = 0, count3 = 0;
  for (int num : nums) {
    if (num == 2) {
      count2 += 1;
    }
    else if (num == 3) {
      count3 += 1;
    }
  }
  return count2 >= 2 || count3 >= 2;
}

// Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

public int[] fix23(int[] nums) {
  for (int i = 1; i < nums.length; i++) {
    if (nums[i - 1] == 2 && nums[i] == 3) {
      nums[i] = 0;
    }
  }
  return nums;
}

// Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

public int start1(int[] a, int[] b) {
  int start1 = 0;
  if (a.length != 0 && a[0] == 1) {
    start1 += 1;
  }
  if (b.length != 0 && b[0] == 1) {
    start1 += 1;
  }
  return start1;
}

// Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

public int[] biggerTwo(int[] a, int[] b) {
  int sumA = 0;
  int sumB = 0;
  
  for (int num : a) {
    sumA += num;
  }
  for (int num : b) {
    sumB += num;
  }
  
  if (sumA >= sumB) {
    return a;
  }
  return b;
}

// Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

public int[] makeMiddle(int[] nums) {
  int middle = nums.length / 2;
  int [] middleNum = {nums[middle - 1], nums[middle]};
  return middleNum;
}

// Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

public int[] plusTwo(int[] a, int[] b) {
  int[] combined = {a[0], a[1], b[0], b[1]};
  return combined;
}
