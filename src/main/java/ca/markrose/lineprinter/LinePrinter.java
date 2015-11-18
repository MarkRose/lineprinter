package ca.markrose.lineprinter;


/**
 * Prints out lines.
 */
public class LinePrinter {

    public static void main(final String[] args) {
        if (args.length != 1) {
            System.err.println("An argument that is a directory or file must be passed.");
        } else {
            new DirectoryLinePrinter().run(args[0]);
        }
    }
}

