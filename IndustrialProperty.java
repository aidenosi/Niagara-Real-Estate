package assign2;

/**
 * Sub class of Property.java for industrial properties. Contains constructor
 * and accessor method.
 *
 * @author Aiden Osipenko
 */
public class IndustrialProperty extends Property {

    String industryType; //Industry type

    /**
     * Constructor for an industrial property.
     *
     * @param tax Annual property tax.
     * @param price List price.
     * @param lotSize Lot size.
     * @param city City that the property is located in.
     * @param building The building on the property.
     * @param industryType Industry type.
     */
    public IndustrialProperty(int tax, int price, int lotSize, String city,
            Factory building, String industryType) {
        super("industrial", tax, price, lotSize, city, building);
        this.industryType = industryType;
    }

    /**
     * Returns the property's industry type.
     *
     * @return String Industry type.
     */
    public String getIndustryType() {
        return this.industryType;
    }
}
