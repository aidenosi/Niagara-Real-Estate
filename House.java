package assign2;

/**
 * Sub class of Building.java for houses. Contains constructor and accessor
 * methods.
 *
 * @author Aiden Osipenko
 */
public class House extends Building {

    int numBed; //Number of bedrooms
    int numBath; //Number of bathrooms
    boolean basement; //Is there a basement?
    String houseType; //Type of house

    /**
     * Constructor for a house.
     *
     * @param size Size of the house.
     * @param material Material used for construction of the building.
     * @param houseType Type of house.
     * @param numBed Number of bedrooms.
     * @param numBath Number of bathrooms.
     * @param basement Is there a basement?
     */
    public House(int size, String material, String houseType, int numBed,
            int numBath, boolean basement) {
        super(size, material);
        this.numBed = numBed;
        this.numBath = numBath;
        this.basement = basement;
        this.houseType = houseType;
    }

    /**
     * Returns the number of bedrooms in the house.
     *
     * @return Int Number of bedrooms.
     */
    public int getNumBed() {
        return this.numBed;
    }

    /**
     * Returns the number of bathrooms in the house.
     *
     * @return Int Number of bathrooms.
     */
    public int getNumBath() {
        return this.numBath;
    }

    /**
     * Returns a boolean indicating whether the house has a basement.
     *
     * @return Boolean
     */
    public boolean hasBasement() {
        return this.basement;
    }

    /**
     * Returns the house type.
     *
     * @return String House type.
     */
    public String getHouseType() {
        return this.houseType;
    }
}
