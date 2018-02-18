package assign2;

/**
 * Parent building class. Contains constructor and accessor methods.
 *
 * @author Aiden Osipenko
 */
public abstract class Building {

    String material; //Material used for construction of the building.
    int size; //Size of the building.

    /**
     * Constructor for a building.
     *
     * @param size
     * @param material
     */
    public Building(int size, String material) {
        this.material = material;
        this.size = size;
    }

    /**
     * Returns the material used for construction of the building.
     *
     * @return String Material used for construction.
     */
    public String getMaterial() {
        return this.material;
    }

    /**
     * Returns the size of the building.
     *
     * @return Int Size of the building.
     */
    public int getSize() {
        return this.size;
    }

}
