package assign2;

/**
 * Sub class of Building.java for factories.
 *
 * @author Aiden Osipenko
 */
public class Factory extends Building {

    boolean crane;
    boolean equipment;
    boolean railAccess;

    /**
     * Constructor for a factory.
     *
     * @param size Size of the factory.
     * @param consMaterial Construction material used.
     * @param crane Is an overhead crane included?
     * @param equipment Is other equipment included?
     * @param railAccess Is there railway access?
     */
    public Factory(double size, String consMaterial, boolean crane,
            boolean equipment, boolean railAccess) {
        super(size, consMaterial);
        this.crane = crane;
        this.equipment = equipment;
        this.railAccess = railAccess;
    }

}
