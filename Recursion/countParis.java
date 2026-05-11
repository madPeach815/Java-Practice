/*
Write a recursive method countPairs that takes a String and returns the number of pairs in the
string, where we’ll define a "pair" in a string is two instances of a char separated by a char. So
"AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
Recursively compute the number of pairs in the given string. Do not use any looping constructs
or string methods other than length , charAt and substring .
Other example test cases:
● countPairs(“axa”) → 1
● countPairs("axax") → 2
● countPairs("axbx") → 1
*/

public int countPairs(String str){
  if(str == null || str.length() < 3){
  return 0;
  }

  if(str.charAt(0) == str.charAt(2)){
    return 1 + countPairs(str.substring(1));
  }

  return countPairs(str.substring(1));
}

  
