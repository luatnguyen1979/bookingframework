package usa.edu.mum.asd.labs.lab6.composite;

import java.io.*;

public class Client {

    public static void main(String[] args) {
        try {
            File file = new File("/home/eegii/labtest/composite_file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            StringBuilder str = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                str.append(line.trim());
            }
            fileReader.close();
            Component root = new Composite("root");
            addComponent(root, str.toString());
            root.print();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addComponent(Component parent, String line) {
        int len = line.length();
        if (len == 0) return;
        while (len > 0) {
            String tag = line.substring(1, line.indexOf(">"));
            String attribute = "";
            if (tag.split(" ").length > 1) {
                attribute = " " + tag.split(" ")[1];
                line = line.replace(attribute, "");
                len = line.length();
                tag = tag.split(" ")[0];
            }
            String sTag = "<" + tag + ">";
            String eTag = "</" + tag + ">";
            String content = "";
            int a = line.indexOf(sTag);
            if (line.indexOf(sTag) >= 0)
                content = line.substring(line.indexOf(sTag) + sTag.length(), line.indexOf(eTag));
            if (content.startsWith("<") && !content.startsWith("</")) {
                Component newComposite = new Composite(tag.toLowerCase());
                parent.addItem(newComposite);
                addComponent(newComposite, content);
            } else {
                Component newLeaf = new Leaf(tag.toLowerCase(), content);
                parent.addItem(newLeaf);
            }
            if (line.indexOf(eTag) + eTag.length() >= len) break;
            line = line.substring(line.indexOf(eTag) + eTag.length(), len);
            len = line.length();
        }
    }
}
