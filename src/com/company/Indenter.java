package com.company;

import java.util.*;

class Indenter {
    private ArrayList<JavaLine> stored = new ArrayList<>();

    public void addLine(String line) {
        if (stored.size() == 0) {
            stored.add(new JavaLine(line, 0));
            return;
        }
        JavaLine previous = stored.get(stored.size() - 1);
        int indentation = previous.getIndentation();

        if (previous.isBlockStart()) {
            indentation++;
        }

        stored.add(new JavaLine(line, indentation));
    }

    public String indentProgram() {
        int ssCommentStart = findMaxJavaLineLength() + 1;
        String code = "";
        for ( JavaLine line: stored ) {
            String currentLine = line.returnLineWithCommentAt(ssCommentStart);
            code += currentLine + "\n";
            System.out.println(currentLine);
        }
        return code;
    }

    public int findMaxJavaLineLength() {
        int max = 0;
        for ( JavaLine line: stored ) {
            int lineLength = line.getJavaLineLength();
            if ( lineLength > max ) max = lineLength;
        }
        return max + 10;
    }
}
