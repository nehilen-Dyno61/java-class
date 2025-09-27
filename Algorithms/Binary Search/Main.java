public class Main {

    // Binary search function
    public static int binarySearch(int[] array, int key) {

        int startPoint = 0;

        int endPoint = array.length - 1; 

        while (startPoint <= endPoint) {
            int midPoint = (startPoint + endPoint) / 2;

            if (array[midPoint] == key) {
                return midPoint; // key found, return index
            }
            else if (key < array[midPoint]) {
                endPoint = midPoint - 1; // search left side
            }
            else {
                startPoint = midPoint + 1; // search right side
            }
        }
        

    // Main
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 10, 11, 15, 17, 19}; 
        int key = 6;

        int finalPosition = binarySearch(array, key); 

        if (finalPosition != -1)
            System.out.println("Key " + key + " found at index: " + finalPosition);
        else
            System.out.println("Key " + key + " was not found in array");
    }
}