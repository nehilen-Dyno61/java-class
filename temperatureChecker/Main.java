public class Main {
    public static void temperatureChecker(int temperature ) {

        if (temperature < 5) {
            System.out.println("Very cold!");

        } else if (temperature >= 5 && temperature <= 17) {
            System.out.println("Cold.");

        } else if (temperature >= 18 && temperature <= 22) {
            System.out.println("Warm.");

        } else if (temperature >= 23 && temperature <= 30) {
            System.out.println("Hot.");

        } else if (temperature >= 31) {
            System.out.println("Very hot.");
        }
    
    }

    public static void main(String[] args) {
        temperatureChecker(3);  // print very cold
        temperatureChecker(11); // print cold
        temperatureChecker(20); // print warm
        temperatureChecker(25); // print hot
        temperatureChecker(30); // print hot again
        temperatureChecker(31); // print very hot
    }
}