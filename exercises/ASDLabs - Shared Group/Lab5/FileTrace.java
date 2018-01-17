package com.asd.lab5.prob1;

import java.io.*;
import java.time.LocalDateTime;

/**
 * Created by Sandip on 4/28/16.
 */
public class FileTrace implements Trace {
    private boolean isActive = true;
    private final  static String DEBUGGER_FILENAME="fileDebugger.txt";
    @Override
    public void setDebug(boolean debug) {
        isActive =debug;
    }

    @Override
    public void debug(String message) {
        if (isActive)writeToFile("Debug: "+ LocalDateTime.now()+" "+message);

    }

    @Override
    public void error(String message) {
        if (isActive)writeToFile("Error: "+ LocalDateTime.now()+" "+message);

    }

    private  void writeToFile(String message){
        String content;
        try {
            File file = new File(DEBUGGER_FILENAME);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                content= message;
                System.out.println("File not exist");
                file.createNewFile();
            }else {
                String oldContent = readFromFile(DEBUGGER_FILENAME);
                content=oldContent.concat(message);
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String  readFromFile(String fileName){
        // This will reference one line at a time
        String line;
        String content="";

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                content = content+line+"\n";
            }
            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
        return content;
    }

}
