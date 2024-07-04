import java.util.Arrays;

/**
 * FindLongestNumber
 */
public class FindLongestNumber {

   public static void main(String[] args) {
      System.out.println("hello");
      int a[] = { 1, 2, 3, 6, 75, 9, 81, 23, 45, 22 };

      // //Using Inbuild function
      // Arrays.sort(a);
      // System.out.println(a[a.length-1]);

      // //without using inbuild function
      // int largest = 0 ;
      // for (int i : a) {
      // largest = largest < i ? i : largest;
      // }
      // System.out.println(largest);

      // // using java Stream
      int max = Arrays.stream(a).max().getAsInt();
      System.out.println("Largest in given array is " + max);
   }
}