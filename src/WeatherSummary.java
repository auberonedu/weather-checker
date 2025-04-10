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

        /*
          WAVE 2
        while(scanner.hasNextDouble()) { //makes sure code has hasNextDouble
            double temps = scanner.nextDouble(); //makes sure code has nextDouble
            System.out.println(temps);
        }
            */

        if (!scanner.hasNextDouble()) {
            System.out.println("N/A");
            scanner.close();
            return;
        }
            double temps = scanner.nextDouble();
            double min = temps;
            double max = temps;
            double sum = temps;
            int count = 1;

            while(scanner.hasNextDouble()) {
                temps = scanner.nextDouble();
                sum += temps;
                count++;

                if (temps < min)  min = temps;
                if (temps > max)  max = temps;
                
            }
        scanner.close();
        double average = sum/count;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
    

