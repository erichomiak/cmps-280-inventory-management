package CMPS280;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test extends Game{

    static Test testGame = new Test();


        public static void readFile1() throws IOException {
            File fileName = new File("INPUT_TEST/Regular_Input.csv");
            File outputFileName = new File("OUTPUT_TEST/Regular_Output.csv");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            ArrayList<String> lines = new ArrayList<>();
            String newLine;
            PrintWriter printWriter = new PrintWriter(outputFileName);
            int i = 0;
            while ((newLine = br.readLine()) != null) {
                testGame.addTest1(newLine);
                printWriter.println(testGame.getTest1(i));
                lines.add(newLine);
                i++;
            }
            br.close();
            printWriter.close();


        }

    public static void readFile2() throws IOException {
        File fileName = new File("INPUT_TEST/Extreme_Input.csv");
        File outputFileName = new File("OUTPUT_TEST/Extreme_Output.csv");
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        ArrayList<String> lines = new ArrayList<>();
        String newLine;
        PrintWriter printWriter = new PrintWriter(outputFileName);
        int j = 0;
        while ((newLine = br.readLine()) != null) {
            testGame.addTest2(newLine);
            printWriter.println(testGame.getTest2(j));
            lines.add(newLine);
            j++;
        }
        br.close();
        printWriter.close();


    }

    public static void readFile3() throws IOException {
        File fileName = new File("INPUT_TEST/Invalid_Input.csv");
        File outputFileName = new File("OUTPUT_TEST/Invalid_Output.csv");
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        ArrayList<String> lines = new ArrayList<>();
        String newLine;
        PrintWriter printWriter = new PrintWriter(outputFileName);
        int k = 0;
        while ((newLine = br.readLine()) != null) {
            testGame.addTest3(newLine);
            printWriter.println(testGame.getTest3(k));
            lines.add(newLine);
            k++;
        }
        br.close();
        printWriter.close();


    }
}
