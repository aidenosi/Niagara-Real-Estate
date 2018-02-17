package assign2;

/**
 * Parent property class.
 *
 * @author Aiden Osipenko
 */
public abstract class Property {

    String type;
    int tax;
    int price;
    int lotSize;
    String city;
    Building building;

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

    public String getType() {
        return this.type;
    }

    public int getTax() {
        return this.tax;
    }

    public int getPrice() {
        return this.price;
    }

    public int getLotSize() {
        return this.lotSize;
    }

    public String getCity() {
        return this.city;
    }

}
