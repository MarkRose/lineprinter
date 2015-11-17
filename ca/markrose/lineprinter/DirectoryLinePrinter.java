package ca.markrose.lineprinter;

import ca.markrose.lineprinter.FileLinePrinter;
import java.io.*;

public class DirectoryLinePrinter {
    private String path;
    
    public DirectoryLinePrinter(String directory) {
        this.path = directory;
    }
    
    public void run () {
        final File path = new File(this.path);
        
        if (path.isFile()) {
            new FileLinePrinter(this.path).run();
        } else {
            for (final File file : path.listFiles()) {
                new FileLinePrinter(file.getPath()).run();
            }
        }
    }
}