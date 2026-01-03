public class Main {
    public static void printArray(int[] array) {
        int[] numbers = {6, 3, 9, 2, 7, 4};      

      System.out.println("Before:"); // print numbers before sorting
      for (int i = 0; i < numbers.length; i++) { // before sorting 
        System.out.print(numbers[i] + " "); 
      }

      System.out.println(); // print to the next line

      // start bubble sort 
      // nested for-loop where i iterates thru array
      for (int i = 0; i < numbers.length - 1; i++) 
      {
        // int j compares through each element in the array by subtracting i and 1
        for (int j = 0; j < numbers.length - i - 1; j++) {

          if (numbers[j] > numbers[j + 1]) { // if the preceding number is larger than the next, swap them
            
            int temporaryVariable = numbers[j]; // store the current value in the temporary variable

            numbers[j] = numbers[j + 1]; // move the (j+1) value to where the current was as that number is the smaller one

            numbers[j + 1] = temporaryVariable; // now the move the temporary variable into where (j + 1) was
            
          }
            
        }
      } 

      System.out.println("After: ");
      printArray(numbers);
    } 

  public static void main (String[] args) { 
    for (int i = 0; i < arr.length; i++) { // loop thru the array to print a variable
      System.out.print(arr[i] + " "); // print the values with spaces in between
    }

    System.out.println(); 
  }
}