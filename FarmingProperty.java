package assign2;

/**
 * Sub class of Property.java for farming properties. Contains constructor and
 * accessor method.
 *
 * @author Aiden Osipenko
 */
public class FarmingProperty extends ResidentialProperty {

    String cropType; //Crop type grown on the property

    /**
     * Constructor for a farm property.
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
     * @param cropType Crop type grown on the property.
     */
    public FarmingProperty(int tax, int price, int lotSize, String city,
            House building, boolean sewer, boolean water, boolean garage,
            boolean pool, String cropType) {
        super(tax, price, lotSize, city, building, sewer, water, garage, pool);
        this.sewer = sewer;
        this.water = water;
        this.garage = garage;
        this.pool = pool;
        this.cropType = cropType;
        this.type = "farm"; //Manually changing type to "farm" since
    }

    /**
     * Returns the type of crop grown on the property.
     *
     * @return String Crop Type
     */
    public String getCropType() {
        return this.cropType;
    }
}
