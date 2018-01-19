package usa.edu.mum.asd.labs.lab4.factorymethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileTrace implements ITrace {

    private boolean debug = false;
    private String fileName = "/home/eegii/filetrace.txt";

    @Override
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    @Override
    public void debug(String message) {
        if (debug) {
            write("DEBUG: " + message);
        }
    }

    @Override
    public void error(String message) {
        write("ERROR: " + message);
    }

    private void write(String msg) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(msg);
            bw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
