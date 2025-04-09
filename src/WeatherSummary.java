import java.util.Scanner;
public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scanner = new Scanner(System.in); //adding scanner
        /** step 2 
        while(scanner.hasNextDouble()) { //makes sure code has hasNextDouble
            double temps = scanner.nextDouble(); //makes sure code has nextDouble
            System.out.println(temps);
        }
            **/
            double min = Double.POSITIVE_INFINITY;
            double max = Double.NEGATIVE_INFINITY;
            while(scanner.hasNextDouble()) {
                double temps = scanner.nextDouble();
                if (temps < min) {
                    min = temps;
                }
                if (temps > max) {
                    max = temps;
                }
                }
        scanner.close();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

