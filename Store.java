package assign2;

/**
 * Sub class of Building.java for stores.
 *
 * @author Aiden Osipenko
 */
public class Store extends Building {

    boolean shelves;
    boolean checkout;
    boolean safe;

    /**
     * Constructor for a store.
     *
     * @param size Size of the store.
     * @param consMaterial Construction material used.
     * @param shelves Is there shelving included in the sale?
     * @param checkout Are cash registers included in the sale?
     * @param safe Is a safe included in the sale?
     */
    public Store(double size, String consMaterial, boolean shelves,
            boolean checkout, boolean safe) {
        super(size, consMaterial);
        this.shelves = shelves;
        this.checkout = checkout;
        this.safe = safe;
    }

}
