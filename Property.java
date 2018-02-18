package assign2;

/**
 * Parent property class. Includes constructor and accessor methods.
 *
 * @author Aiden Osipenko
 */
public abstract class Property {

    String type; //Property type
    int tax; //Annual tax amount
    int price; //List price
    int lotSize; //Lot size
    String city; //City
    Building building; //Building that is on the property

    /**
     * Constructor for a property.
     *
     * @param type Property type.
     * @param tax Annual property tax.
     * @param price List price.
     * @param lotSize Lot size.
     * @param city City that the property is located in.
     * @param building The building on the property.
     */
    public Property(String type, int tax, int price, int lotSize, String city,
            Building building) {
        this.type = type;
        this.tax = tax;
        this.price = price;
        this.lotSize = lotSize;
        this.city = city;
        this.building = building;
    }

    /**
     * Returns this property's type.
     *
     * @return String Property type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Returns this property's annual tax amount.
     *
     * @return Int Annual tax amount.
     */
    public int getTax() {
        return this.tax;
    }

    /**
     * Returns this property's price.
     *
     * @return Int Property price.
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Returns this property's lot size.
     *
     * @return Int Lot size.
     */
    public int getLotSize() {
        return this.lotSize;
    }

    /**
     * Returns the city that this property is in.
     *
     * @return String City that the property is in.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Returns this property's Building object.
     *
     * @return Building
     */
    public Building getBuilding() {
        return this.building;
    }

}
