package assign2;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Main class. Initiates processing of input file, and holds pointers to search
 * window and search results window.
 *
 * @author Aiden Osipenko
 */
public class NiagaraRealEstate {

    static SearchWindow sWindow; //Search window
    static ResultsWindow rWindow; //Search results window

    public NiagaraRealEstate() throws IOException {
        FileLoader.loadFile(); //Load input file
        sWindow = new SearchWindow();
    }

    /**
     * Initializes search results window with list of valid properties from
     * PropertySearch.
     *
     * @param vp List of valid properties from PropertySearch.
     */
    public static void passValidProperties(ArrayList<Property> vp) {
        rWindow = new ResultsWindow(vp);
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        NiagaraRealEstate a2 = new NiagaraRealEstate();
    }

}
