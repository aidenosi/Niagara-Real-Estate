package assign2;

/**
 * Sub class of Building.java for stores. Contains constructor and accessor
 * methods.
 *
 * @author Aiden Osipenko
 */
public class Store extends Building {

    boolean shelves; //Are shelves included?
    boolean checkout; //Are cash registers included?
    boolean safe; //Is a safe included?

    /**
     * Constructor for a store.
     *
     * @param size Size of the store.
     * @param material Material used for construction of the building.
     * @param shelves Is there shelving included in the sale?
     * @param checkout Are cash registers included in the sale?
     * @param safe Is a safe included in the sale?
     */
    public Store(int size, String material, boolean shelves,
            boolean checkout, boolean safe) {
        super(size, material);
        this.shelves = shelves;
        this.checkout = checkout;
        this.safe = safe;
    }

    /**
     * Returns a boolean indicating whether shelves are included with the sale.
     *
     * @return Boolean
     */
    public boolean hasShelves() {
        return this.shelves;
    }

    /**
     * Returns a boolean indicating whether cash registers are included with the
     * sale.
     *
     * @return Boolean
     */
    public boolean hasCheckout() {
        return this.checkout;
    }

    /**
     * Returns a boolean indicating whether a safe is included with the sale.
     *
     * @return Boolean
     */
    public boolean hasSafe() {
        return this.safe;
    }
}
