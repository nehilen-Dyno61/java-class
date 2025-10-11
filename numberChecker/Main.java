import java.util.ArrayList;

public class Main {
    public static int binarySearch(ArrayList<Integer> list, int key) {
        int start = 0; // start is always 0
        int end = list.size() - 1; // end will be the size minus one

        while (start <= end) {
            int midPoint = (start + end) / 2;

            if (list.get(midPoint) == key) {
                return midPoint; // if this key is the midpoint, no need to go further
            }

            if (list.get(midPoint) > key) {
                end = midPoint - 1; // if key is greater, then you would subtract 1 from midPoint

            } else {
                start = midPoint + 1;
            }
        }

        return -1; // If not found
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        int key = 15;
        int finalPosition = binarySearch(list, key);

        if (finalPosition == -1) {
            System.out.println("Element not found."); // element is not found at -1 as there is no element at this index
        } else {
            System.out.println("Found element at index: " + finalPosition); //prints ( list , key )
        }
    }
}
    