public class Sorting{
  public static void main (String [] args) {
   int [] array = {41,134,8,43,1,40,79,33,45,2,8,6};
   int temp;
   for (int i = 1; i < array.length; i++) {
    for (int j = i; j > 0; j--) {
     if (array[j] < array [j - 1]) {
      temp = array[j];
      array[j] = array[j - 1];
      array[j - 1] = temp;
     }
    }
   }
   for (int i = 0; i < array.length; i++) {
     System.out.println(array[i]);
   }
  }
}