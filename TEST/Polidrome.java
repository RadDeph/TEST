class Polidrome {
  public static void Polidrome() {

    String str = "123", reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is result of polidrome ");
    }
    else {
      System.out.println(str + " is not result of polidrome ");
    }
  }
}