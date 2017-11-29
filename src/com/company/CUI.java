package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.awt.datatransfer.*;
import java.awt.Toolkit;


public class CUI {
    public static String args[];
    public static String logo = "\n" +
            "                  _            ___  _               \n" +
            "                 | |          / __)(_)              \n" +
            "  ____  ___    __| | _   _  _| |__  _  _____   ____ \n" +
            " / ___)/ _ \\  / _  || | | |(_   __)| || ___ | / ___)\n" +
            "( (___| |_| |( (_| || |_| |  | |   | || ____|| |    \n" +
            " \\____)\\___/  \\____| \\__  |  |_|   |_||_____)|_|    \n" +
            "                    (____/                          \n" +
            "</ code > by George Livas";


    public static void generateUI(String argsMain[]) throws InterruptedException, IOException {
        args = argsMain;
        printLogo();
        Thread.sleep((long) 100);
        menu(args);
    }

    public static String printLogo() {
        String logo = (
                (char)27 + "[36m" +
                "       _..._         .-'''-.                                                                                   \n" +
                "    .-'_..._''.     '   _    \\   _______                                                                       \n" +
                "  .' .'      '.\\  /   /` '.   \\  \\  ___ `'.                                .--.        __.....__               \n" +
                " / .'            .   |     \\  '   ' |--.\\  \\    .-.          .-      _.._  |__|    .-''         '.             \n" +
                ". '              |   '      |  '  | |    \\  '    \\ \\        / /    .' .._| .--.   /     .-''\"'-.  `.  .-,.--.  \n" +
                "| |              \\    \\     / /   | |     |  '    \\ \\      / /     | '     |  |  /     /________\\   \\ |  .-. | \n" +
                "| |               `.   ` ..' /    | |     |  |     \\ \\    / /    __| |__   |  |  |                  | | |  | | \n" +
                ". '                  '-...-'`     | |     ' .'      \\ \\  / /    |__   __|  |  |  \\    .-------------' | |  | | \n" +
                " \\ '.          .                  | |___.' /'        \\ `  /        | |     |  |   \\    '-.____...---. | |  '-'  \n" +
                "  '. `._____.-'/                 /_______.'/          \\  /         | |     |__|    `.             .'  | |      \n" +
                "    `-.______ /                  \\_______|/           / /          | |               `''-...... -'    | |      \n" +
                "             `                                    |`-' /           | |                                |_|      \n" +
                "          " + (char)27 + "[31m" + "</ code > by George Livas" + (char)27 + "[36m" + "                '..'            |_|                                         \n\n\n"
        );
        System.out.println(logo);
        return logo;
    }

    public static void menu(String args[]) throws IOException, InterruptedException {
        System.out.print((char)27 + "[36m+");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("|"
                        + (char)27 + "[30m"
                        + (char)27 + "[42m"
                        + "  [1] Read from file          "
                        + (char)27 + "[36m"
                        + "|\n|"
                        + (char)27 + "[30m"
                        + (char)27 + "[42m"
                        + "  [2] Read from console       "
                        + (char)27 + "[36m"
                        + "|"
        );

        System.out.print((char)27 + "[36m+");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.print((char)27 + "[35m" + "\nChoose mode and press enter:");
        System.out.println((char)27 + "[0m");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {

            String indentedCode = indentCode(args);
            Thread.sleep((long) 100);
            secondMenu(indentedCode);
        } else if (choice == 2) {
            System.err.println("NOT supported yet");
        } else {
            System.err.println("Choice does NOT exist");
            Thread.sleep((long) 100);
            menu(args);
        }
    }

    public static String indentCode(String args[]) throws IOException, InterruptedException {
        for (int i = 0; i < 50; i++) {
            System.err.print("---");
        }
        System.out.println();
        Thread.sleep((long) 500);
        String indentedCode = "";
        for ( String fileName: args ) {
            Indenter indent = new Indenter();
            Path file = Paths.get( fileName );

            InputStream in = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;

            while ((line = reader.readLine()) != null ) {
                indent.addLine(line);
            }

            indentedCode = indent.indentProgram();
        }
        Thread.sleep((long) 100);
        for (int i = 0; i < 50; i++) {
            System.err.print("---");
        }
        System.out.println();
        return indentedCode;
    }

    public static void secondMenu(String code) throws InterruptedException, IOException {
        System.out.println();
        System.out.print((char)27 + "[36m+");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("|"
                + (char)27 + "[30m"
                + (char)27 + "[42m"
                + "  [1] Copy to clipboard       "
                + (char)27 + "[36m"
                + "|\n|"
                + (char)27 + "[30m"
                + (char)27 + "[42m"
                + "  [2] Write on file           "
                + (char)27 + "[36m"
                + "|"
        );

        System.out.print((char)27 + "[36m+");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.print((char)27 + "[35m" + "\nChoose an action and press enter:");
        System.out.println((char)27 + "[0m");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            copyToClipboard(code);
        } else if (choice ==2) {
            System.out.println("Would you like to replace the existing code? [y/n]:");
            Scanner scan = new Scanner(System.in);
            String desision = scan.next();
            boolean overwrite = desision.equals("y");
            writeOnFile(code, overwrite);
        } else {
            System.err.println("NOT a valid option");
            Thread.sleep((long) 100);
            secondMenu(code);
        }
    }

    public static void copyToClipboard(String code) {
        StringSelection stringSelection = new StringSelection(code);
        Clipboard copiedCode = Toolkit.getDefaultToolkit().getSystemClipboard();
        copiedCode.setContents(stringSelection, null);
    }

    public static void writeOnFile(String code, boolean overwrite) throws IOException {
        if (overwrite) {
            deleteExistingCode();
            for (String fileName: args) {
                PrintWriter writer = new PrintWriter(fileName);
                writer.print(code);
                writer.println(logo);
                writer.close();
            }
        } else {
            PrintWriter writer = new PrintWriter("indented_code.txt", "UTF-8");
            writer.println(code);
            writer.println(logo);
            writer.close();
        }
    }

    public static void deleteExistingCode() throws FileNotFoundException {
        for (String fileName: args) {
            PrintWriter writer = new PrintWriter(fileName);
            writer.print("");
            writer.close();
        }
    }
}
