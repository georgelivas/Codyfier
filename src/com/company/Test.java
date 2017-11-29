//package com.company;
//
//public class Test {
//    public static void test(int spacesNum) {
//        testSpaces(spacesNum);
//        testGetJavaLineLength();
//        testReturnLineWithCommentAt("int a; // Declaration");
//        testReturnLineWithCommentAt("while ( countdown > 0 )// While greater than 0 {");
//        testReturnLineWithCommentAt("System.out.println(countdown);// Write contents of countdown");
//        testReturnLineWithCommentAt("if ( countdown == 3 )// If equal to 3");
//    }
//
//    public static void testSpaces(int num) {
//        String test = JavaLine.spaces(num);
//        if (test.length() == num) {
//            System.out.println("Spaces Passed");
//        } else {
//            System.out.println("Spaces Failed\t num= " + num + "spaces= " + test.length());
//        }
//    }
//
////    public static void testGetJavaLineLength() {
////        String string = "int a; // Declaration";
////        JavaLine j = new JavaLine(string);
////        int jp = j.getJavaLineLength();
////        if (jp == 7) {
////            System.out.println("JavaLineLength Passed");
////        } else {
////            System.out.println("JavaLineLength Failed\t String= " + string + "  length= " + string.length() + "function returns " + jp);
////        }
////        System.out.println("\n\n");
////    }
//
////    public static void testReturnLineWithCommentAt (String string) {
////
////        JavaLine j = new JavaLine(string);
////        System.out.println(j.returnLineWithCommentAt(32));
////    }
//}
