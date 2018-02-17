package assign2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Aiden
 */
public class Assign2 {
    
    static ArrayList<Property> validProperties;

    public Assign2() throws IOException {
        FileLoader.loadFile(); //Load input file
        SearchWindow sw = new SearchWindow();
        //ResultsWindow rw = new ResultsWindow();
    }
    
    public static void setValidProperties(ArrayList<Property> vp){
        validProperties = new ArrayList<>();
        for(Property p : vp){
            validProperties.add(p);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Assign2 a2 = new Assign2();
    }

}
