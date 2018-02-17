package assign2;

/**
 * Parent building class.
 *
 * @author Aiden Osipenko
 */
public abstract class Building {

    String consMaterial;
    double size;

    /**
     * Constructor for a building.
     *
     * @param size
     * @param consMaterial
     */
    public Building(double size, String consMaterial) {
        this.consMaterial = consMaterial;
        this.size = size;
    }

}
