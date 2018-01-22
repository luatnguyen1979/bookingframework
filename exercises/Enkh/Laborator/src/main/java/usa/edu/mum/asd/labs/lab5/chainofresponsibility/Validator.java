package usa.edu.mum.asd.labs.lab5.chainofresponsibility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Validator extends AbstractProcessor {

    private final String FILENAME;

    public Validator(AbstractProcessor nextProcessor, String fileName) {
        this.nextProcessor = nextProcessor;
        this.FILENAME = fileName;
    }

    @Override
    public void handleRequest(CallRecord callRecord) {
        if (canHandleRequest(callRecord)) {
            Customer customer = callRecord.getCustomer();
            if (customer.getAddress() != null
                    && customer.getEmail() != null && !customer.getEmail().isEmpty()
                    && customer.getPhone() != null && !customer.getPhone().isEmpty()) {
                callRecord.setValid(true);
                if (nextProcessor != null) nextProcessor.handleRequest(callRecord);
            } else {
                callRecord.setValid(false);
                write(callRecord);
                callRecord = null;
            }
        }
    }

    @Override
    boolean canHandleRequest(CallRecord callRecord) {
        return true;
    }

    private void write(CallRecord callRecord) {
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            File file = new File(FILENAME);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);

            bw.write(callRecord.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
            }
        }
    }
}
