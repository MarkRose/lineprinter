package ca.markrose.lineprinter;

public class LinePrinter {
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("An argument that is a directory or file must be passed.");
            
            return;
        }
        
        new DirectoryLinePrinter(args[0]).run();
    }
}

