package assign2;

/**
 * Sub class of Property.java for residential properties.
 *
 * @author Aiden Osipenko
 */
public class ResidentialProperty extends Property {

    boolean sewer;
    boolean water;
    boolean garage;
    boolean pool;

    /**
     * Constructor for a residential property.
     *
     * @param tax Annual property tax.
     * @param price List price.
     * @param lotSize Lot size.
     * @param city City that the property is located in.
     * @param building The building on the property.
     * @param sewer Is the property on city sewers?
     * @param water Is the property on city water?
     * @param garage Does the property have a garage?
     * @param pool Does the property have a pool?
     */
    public ResidentialProperty(int tax, int price, int lotSize, String city,
            House building, boolean sewer, boolean water, boolean garage,
            boolean pool) {
        super("residential", tax, price, lotSize, city, building);
        this.sewer = sewer;
        this.water = water;
        this.garage = garage;
        this.pool = pool;
    }

}
