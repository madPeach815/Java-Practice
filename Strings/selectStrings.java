/*
Write a static method selectStrings that takes two arguments:
● A list of Strings
● A string prefix
The selectStrings method returns a list of Strings containing just the strings from the list
provided as an argument that start with the provided prefix. The arguments should not be
modified. For example, given the arguments [“CMSC132”, “MATH140”, “PSYC200”, “CMSC250”] and “CMSC”
, it should return [“CMSC132”, “CMSC250”].
*/

//first way.
public static ArrayList<String> selectStrings(ArrayList<String> arr, String prefix){
  ArrayList<String> selectS = new ArrayList<>();

  for(int i = 0; i < arr.size(); i++){
    if(arr.get(i).length() >= prefix.length() && arr.get(i).substring(0, prefix.length()).equals(prefix)){
      selectS.add(arr.get(i));
    }
  }
  return selectS;
}

//second way with startsWith(something);
public static ArrayList<String> selectStrings(ArrayList<String> arr, String prefix){
  ArrayList<String> selectS = new ArrayList<>();

  for(int i = 0; i < arr.size(); i++){
    if(arr.get(i).startsWith(prefix)){
      selectS.add(arr.get(i));
    }
  }
  return selectS;
}
