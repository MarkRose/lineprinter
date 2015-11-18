package ca.markrose.lineprinter;

import java.io.File;
import java.io.FileFilter;

/**
 * @Immutable
 */
public class DirectoryLinePrinter {
    public void run(String pathString) {
        final File path = new File(pathString);
        final FileFilter filter = file -> file.getName().endsWith(".java");
        final FileLinePrinter fileLinePrinter = new FileLinePrinter();
        if (path.isFile()) {
            fileLinePrinter.run(pathString);
        } else {
            for (final File file : path.listFiles(filter)) {
                fileLinePrinter.run(file.getPath());
            }
        }
    }
}