package usa.edu.mum.asd.labs.lab12.lab12.visitor;

import java.util.HashMap;

public class DisplayNodeVisitor implements NodeVisitor {

    private HashMap<String, Integer> mapLeft = new HashMap<>();
    private HashMap<String, Integer> mapRight = new HashMap<>();
    private StringBuilder stringBuilder = new StringBuilder(100);

    @Override
    public void visit(Node node) {
        String name = node.getName().substring(0, 1);
        if (node.getSide().equals(Side.LEFT)) {
            Integer count = mapLeft.get(name);
            if (count == null) {
                mapLeft.put(name, 1);
            } else {
                count++;
                mapLeft.put(name, count);
            }
        } else {
            Integer count = mapRight.get(name);
            if (count == null) {
                mapRight.put(name, 1);
            } else {
                count++;
                mapRight.put(name, count);
            }
        }
    }

    @Override
    public void visit(Root root) {
        stringBuilder.append(root.getName());
        stringBuilder.append("\n");
    }

    public void print() {
        stringBuilder.append("Right nodes:\n");
        for (String key : mapRight.keySet()) {
            append(key, mapRight.get(key));
        }
        stringBuilder.append("Left nodes:\n");
        for (String key : mapLeft.keySet()) {
            append(key, mapLeft.get(key));
        }
        System.out.println(stringBuilder.toString());
    }

    private void append(String key, Integer count) {
        stringBuilder.append(count);
        stringBuilder.append(" ");
        stringBuilder.append(key);
        stringBuilder.append(" ");
        stringBuilder.append("nodes\n");
    }
}
