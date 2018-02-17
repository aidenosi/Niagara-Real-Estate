package assign2;

import java.io.*;
import java.util.Scanner;

/**
 * This class handles file input for the program.
 *
 * @author Aiden Osipenko
 */
public class FileLoader {

    /**
     * Method that loads data from input file into a String and removes
     * whitespace.
     *
     * @throws IOException
     */
    public static void loadFile() throws IOException {
        int[][] in = null; //Array to store ints from input file
        String filePath = ""; //File path/file name
        Scanner scanner = new Scanner(System.in);
        FileReader fReader = null;
        BufferedReader bReader = null;
        //Get file name from user
        try {
            System.out.print("Please enter file path (or 0 to exit): ");
            filePath = scanner.nextLine(); //Get file path/file name
        } catch (Exception e) {
            throw new IOException("Error: Invalid file name.");
        }
        if (filePath.equals("0")) {
            System.exit(0);
        }
        try { //Load file
            fReader = new FileReader(filePath); //Init file and buffered readers
            bReader = new BufferedReader(fReader);
        } catch (FileNotFoundException e) {
            throw new IOException("Error: File not found.");
        }
        //Iterate over input data until EOF
        for (;;) {
            String s = bReader.readLine(); //Read next line
            if (s == null) { //Break when EOF
                break;
            }
            //Check first char and pass data to PropertyInitializer class 
            char c = s.charAt(0);
            switch (c) {
                case 's':
                    PropertyInitializer.initStore(s);
                    break;
                case 'f':
                    PropertyInitializer.initFactory(s);
                    break;
                case 'h':
                    PropertyInitializer.initHouse(s);
                    break;
            }
        }
        bReader.close();
        fReader.close();
    }
}
