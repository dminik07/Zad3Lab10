import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Change the file paths to match your local directory structure.
        String inputFile = "/Users/dominik/Desktop/studia/input.txt";
        String outputFile = "/Users/dominik/Desktop/studia/output.txt";

        try (
                // Automatically close both reader and writer
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            // Read each line, replace spaces with dashes, and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line.replace(" ", "-"));
                writer.newLine();
            }
            System.out.println("Processing complete: spaces replaced with dashes.");
        } catch (IOException e) {
            // Handle any file I/O errors
            e.printStackTrace();
        }
    }
}
