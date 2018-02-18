package assign2;

/**
 * Sub class of Building.java for factories. Contains constructor and accessor
 * methods.
 *
 * @author Aiden Osipenko
 */
public class Factory extends Building {

    boolean crane; //Is a crane included?
    boolean equipment; //Is other equipment included?
    boolean railAccess; //Is there railway access?

    /**
     * Constructor for a factory.
     *
     * @param size Size of the factory.
     * @param material Material used for construction of the building.
     * @param crane Is an overhead crane included?
     * @param equipment Is other equipment included?
     * @param railAccess Is there railway access?
     */
    public Factory(int size, String material, boolean crane,
            boolean equipment, boolean railAccess) {
        super(size, material);
        this.crane = crane;
        this.equipment = equipment;
        this.railAccess = railAccess;
    }

    /**
     * Returns a boolean indicating whether a crane is included with the sale.
     *
     * @return Boolean
     */
    public boolean hasCrane() {
        return this.crane;
    }

    /**
     * Returns a boolean indicating whether other equipment is included with the
     * sale.
     *
     * @return Boolean
     */
    public boolean hasEquipment() {
        return this.equipment;
    }

    /**
     * Returns a boolean indicating whether the factory has railway access.
     *
     * @return Boolean
     */
    public boolean hasRailAccess() {
        return this.railAccess;
    }

}
