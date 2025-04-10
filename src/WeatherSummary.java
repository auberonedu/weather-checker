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

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's start the weather summary");

        double sum = 0.0;
        int count = 0;
        Double max = null;
        Double min = null;

        

        while (scan.hasNextDouble()) {
            double temp = scan.nextDouble();
            //System.out.println(temp);

            if (max == null || temp > max) {
                max = temp;
            }
            

            if (min == null || temp < min) {
                min = temp;
            }

            sum = sum + temp;
            count++;
            

        } // end of while loop

        if (count > 0) {
            double avg = sum / count;
            
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + avg);
        }
        
        

    }// end of main
} // end of class
