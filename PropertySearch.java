package assign2;

import java.util.ArrayList;

/**
 * Class to search all properties and find those matching the search parameters.
 *
 * @author Aiden Osipenko
 */
public class PropertySearch {

    //ArrayList containing all properties from input file
    static ArrayList<Property> allProperties = new ArrayList<>();
    //ArrayList containing all valid properties returned by a search
    static ArrayList<Property> validProperties;

    /**
     * Builds a list of properties that match the search parameters.
     *
     * @param city City parameter entered by user.
     * @param maxPrice Maximum price parameter entered by user.
     * @param propType Property type parameter entered by user.
     */
    public static void searchFor(String city, String maxPrice, String propType) {
        int price = Integer.parseInt(maxPrice); //Parse price string to int
        validProperties = new ArrayList<>(); //Init array list
        for (Property p : allProperties) { //For each
            //Check that property matches all search parameters
            if (p.getCity().equals(city)) {
                if (p.getPrice() <= price) {
                    if (p.getType().equals(propType)) {
                        validProperties.add(p); //Add to valid properties list 
                    }
                }
            }
        }
        //Pass to NiagaraRealEstate class 
        NiagaraRealEstate.passValidProperties(validProperties);
    }

}
