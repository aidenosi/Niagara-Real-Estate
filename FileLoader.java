package assign2;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * This class handles file input for the program.
 *
 * @author Aiden Osipenko
 */
public class FileLoader {

    /**
     * Prompts user to select input file, then loads data from input file one
     * line at a time into a String, and passes String to corresponding method
     * for the object to be initialized.
     *
     * @throws IOException
     */
    public static void loadFile() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        File inputFile = null;
        FileReader fReader = null;
        BufferedReader bReader = null;
        try { //Get file from user
            //Show file explorer
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                inputFile = fileChooser.getSelectedFile();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception: " + e);
        }
        fReader = new FileReader(inputFile);
        bReader = new BufferedReader(fReader);
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
        bReader.close(); //Closing file and buffered readers
        fReader.close();
    }
}
