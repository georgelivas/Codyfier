package com.company;

class JavaLine {
    private String java = "";
    private String comment = "";
    private int indentation = 0;
    private int block = 0;

    public JavaLine(String line, int indentation) {
        line = line.trim();
        int commentPos = line.length();
        this.indentation = indentation;

        for (int i = 0; i < line.length() && commentPos == line.length(); i++) {
            switch (line.charAt(i)) {
                case '"':
                    for (i++; i < line.length(); i++) {
                        if (line.charAt(i) == '"' && line.charAt(i - 1) != '\\') {
                            break;
                        }
                    }
                    break;
                case '{':
                        block++;
                    break;
                case '}':
                    block--;
                    break;
                case '/':
                    if (i < line.length()-1 && line.charAt(i+1) == '/') {
                        commentPos = i;
                    }
                    break;
                default:
            }
        }

        if (block == -1) {
            this.indentation--;
        }
        java = line.substring(0,commentPos);
        comment = line.substring(commentPos);
    }

    public int getBlock() {
        return block;
    }
    public int getJavaLineLength() {
        return java.length();
    }
    public int getIndentation() {
        return this.indentation;
    }
    public boolean isBlockStart() {
        return block > 0 && block % 2 == 1;
    }

    public String returnLineWithCommentAt(int pos) {
        if (java.length() == 0 && comment.length() > 0) {
            return spaces(2*this.indentation) + comment.trim();
        }
        if (comment.length() == 0) {
            return spaces(2*this.indentation) + java;
        }
        return spaces(
                2*this.indentation)
                + java
                + spaces(pos-(java.length() + 2*this.indentation))
                + comment;
    }

    public static String spaces( int number ) {
        String spaces = "";
        for (int i = 0; i < number; i++) {
            spaces += " ";
        }
        return  spaces;
    }
}
