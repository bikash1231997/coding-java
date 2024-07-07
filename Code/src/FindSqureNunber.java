//From a list of numbers, take square of those numbers and collect them in a new List using Streams collect method
public class FindLongestNumber {

   public static void main(String[] args) {
      System.out.println("hello");
     List<Integer> numbers = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);
     List<Integer> squaredNum = numbers.stream().map(n -> n *n).collect(Collector.toList());
     System.out.println(numbers);
     System.out.println(squaredNum);
   }
}
