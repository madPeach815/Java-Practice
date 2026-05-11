//Write a method makePalidrome that takes an int array, return a new int array that contains the values from the original array in their original order, followed by the elements from the original array in reversed order. 
//For example, given [5, 4, 8], it will return the array [5, 4, 8, 8, 4, 5]. The original array should not be modified. 

public int[] makePalidrome(int[] arr){
  int[] newArr = new int[arr.length * 2];

  for(int i = 0; i < arr.length; i++){
    newArr[i] = arr[i];
  }
  int index = arr.length;
  for(int x = arr.length - 1; x >= 0; x--){
    newArr[index++] = arr[x];
  }

  return newArr;
}
