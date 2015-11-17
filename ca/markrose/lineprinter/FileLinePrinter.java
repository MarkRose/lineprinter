package ca.markrose.lineprinter;

import java.io.*;

public class FileLinePrinter {
    private String filename;
    
    public FileLinePrinter(String filename) {
        this.filename = filename;
    }
    
    public void run() {
        try {
            final BufferedReader reader = new BufferedReader(new FileReader(this.filename));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + this.filename + " not found.");
        } catch (IOException e) {
            System.err.println("Error reading file " + this.filename);
        }
    }
}