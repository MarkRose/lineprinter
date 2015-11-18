package ca.markrose.lineprinter;

import java.io.*;

/**
 * @Immutable
 */
public class FileLinePrinter {
    public void run(final String filename) {
        try {
            final BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + filename + " not found.");
        } catch (IOException e) {
            System.err.println("Error reading file " + filename);
        }
    }
}