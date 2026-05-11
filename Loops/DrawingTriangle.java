/*
Write a method drawTriangle that will print out a right triangle whose length (height and width)
is represented by the integer parameter. Look at the examples for what your code should do. If
the length is less than zero, throw an IllegalArgumentException.
*/

public static String drowingTriangle(int num){
  if(num < 0) {
  throw new IllegalArgumentException("num can't be negative number");
}

for(int i = 1; i <= num; i++){
  for(int x = 1; x <= i; x++){
    System.out.print("*");
  }
  System.out.println();
}
return print;
}
