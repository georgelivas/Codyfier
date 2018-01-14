package com.company;

/**
 * Stores a line of a Java program for later analysis
 */
class JavaLineD
{
    private String java = "";       // Java code on line
    private String comment = "";    // The single line comment
    private int lenJava = 0;        // The line length of just the java code
    private String lineWithoutComment = "";
    private boolean containsComment = false;

    /**
     * Constructor
     * @param line of a java program
     */
    public JavaLineD( String line )
    {
//        String[] parts = line.split("//", 2);
//        lineWithoutComment = parts[0];
//        java = parts[0].trim();
//        if (parts.length > 1) {
//            comment = parts[1];
//        }

        if (findComment(line)) {
            String[] parts = line.split("//", 2);
            java = parts[0];
            comment = parts[parts.length-1];
            lenJava = getJavaLineLength();
            containsComment = true;
        } else {
            lineWithoutComment = line;
        }

        // Split line into the Java code part 'variable java' and the // comment
        // into 'variable comment'.
        // Trailing spaces are removed from the variable 'java'
        // Record the length of the java code part of the line
        //   into the variable 'lenJava'

        // For example the line:     String s = "// comment";  // Initialise s
        // column position char: 123456789012345678901234567890123456789012345

        // would set the instance variables to be:
        //  java    ->      String s = "// comment";
        //  column:     1234567890123456789012345678 position of chars
        //  comment ->  // Initialise s
        //  lenJava ->  28
    }

    public boolean findComment(String line) {

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == '/' && line.charAt(i + 1) == '/') {
                return true;
            }
        }
        return false;
    }

    /**
     * Return the length of the Java part of the stored line.<PRE>
     * JavaLine j = new JavaLine("int a; // Declaration");
     * int jp = j.getJavaLineLength();
     * Would set jp the be 6</PRE>
     * @return The length of the Java code in the line
     */
    public int getJavaLineLength() {
        return java.length();
    }

    /**
     * Return as an 'indented' line with the // comment
     * starting at column pos<PRE>
     * JavaLine j = new JavaLine("int a; // Declaration");
     * String res = j.returnLineWithCommentAt(10);
     * Would set res to be the following string:
     * int a;   // Declaration</PRE>
     * @param pos Start // comment at pos
     * @return A new version of the line with any // comment
     * starting at column pos.
     */
    public String returnLineWithCommentAt(int pos ) {

        return java.length() == 0 && comment.length() > 0
                ? "// " + comment.trim()
                : !containsComment
                ? lineWithoutComment
                : java + spaces(pos-lenJava) + "// " + comment;
    }

    /**
     * Return a string of 'number' spaces.
     * @param number of spaces required
     * @return A string of 'number' spaces
     */
    public static String spaces( int number ) {
        String spaces = "";

        for (int i = 0; i < number; i++) {
            spaces += " ";
        }
        return  spaces;
    }
}
