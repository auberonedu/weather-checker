import java.util.ArrayList;
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
        Scanner scanner = new Scanner(System.in);

        // create the list to put the temp values in
        ArrayList<Double> tempList = new ArrayList<>();
        while (scanner.hasNextDouble()) {
            double temp = scanner.nextDouble();
            tempList.add(temp);
            // System.out.println(scanner.nextDouble());
        }
        //Creating a bubble sort so I can sort the list
        for (int i = 0; i < tempList.size() - 1; i++) {
            for (int j = 0; j < tempList.size() - i - 1; j++) {
                if (tempList.get(j) < tempList.get(j+1)) {
                    double temp = tempList.get(j);
                    tempList.set(j, tempList.get(j + 1));
                    tempList.set(j + 1, temp);
                }
            }
        }
        
        System.out.println("Max: " + tempList.get(0));

        // Source: StackOverflow - "How to get the last value of an ArrayList"
        // https://stackoverflow.com/questions/687833/how-to-get-the-last-value-of-an-arraylist
        System.out.println("Min: " + tempList.get(tempList.size()-1));
    }
    //javac src/WeatherSummary.java && java -cp src WeatherSummary < temps
}
