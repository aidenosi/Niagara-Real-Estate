package assign2;

import java.util.ArrayList;

/**
 *
 * @author Aiden
 */
public class PropertySearch {

    //ArrayList containing all properties from input file
    static ArrayList<Property> allProperties = new ArrayList<>();
    //ArrayList containing all valid properties returned by a search
    static ArrayList<Property> validProperties;

    public static void searchFor(String city, String maxPrice, String propType) {
        System.out.println("here");
        int price = Integer.parseInt(maxPrice);
        validProperties = new ArrayList<>();
        for (Property p : allProperties) {
            if (p.getCity().equals(city)) {
                if (p.getPrice() <= price) {
                    if (p.getType().equals(propType)) {
                        validProperties.add(p);
                    }
                }
            }
        }
        Assign2.setValidProperties(validProperties);
    }

}
