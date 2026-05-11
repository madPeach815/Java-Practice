//In this question you will complete a method called countMultiples that traverses through an array of ints and counts how many values in the array that are multiples of three.
//Write the recursive method version, countMultiplesRecur, with no loops. You many write a helper method, but should not need to.

public static int countMultiplesRecur(int[] myNums){
  return countMultiplesAux(myNums, 0);
}

public static int countMultiplesAux(int[] myNums, int index){
  if(index >= myNums.length){
    return 0;
  }
  if(myNums[index] % 3 == 0){
    return 1 + countMultiplesAux(myNums, index+1);
  }

  return countMultiplesAux(myNums, index+1);
}
