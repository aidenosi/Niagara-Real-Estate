package assign2;

/**
 * Sub class of Building.java for houses.
 *
 * @author Aiden Osipenko
 */
public class House extends Building {

    int numBed;
    int numBath;
    boolean basement;
    String houseType;

    /**
     * Constructor for a house.
     *
     * @param size Size of the house.
     * @param consMaterial Construction material used.
     * @param houseType Type of house.
     * @param numBed Number of bedrooms.
     * @param numBath Number of bathrooms.
     * @param basement Is there a basement?
     */
    public House(double size, String consMaterial, String houseType, int numBed,
            int numBath, boolean basement) {
        super(size, consMaterial);
        this.numBed = numBed;
        this.numBath = numBath;
        this.basement = basement;
        this.houseType = houseType;
    }

}
