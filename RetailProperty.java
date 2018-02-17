package assign2;

/**
 * Sub class of Property.java for retail properties.
 *
 * @author Aiden Osipenko 
 */
public class RetailProperty extends Property {

    String retailType;

    /**
     * Constructor for a retail property.
     *
     * @param tax Annual property tax.
     * @param price List price.
     * @param lotSize Lot size.
     * @param city City that the property is located in.
     * @param building The building on the property.
     * @param retailType Retail type.
     */
    public RetailProperty(int tax, int price, int lotSize, String city, Store building,
            String retailType) {
        super("retail", tax, price, lotSize, city, building);
        this.retailType = retailType;
    }

}
