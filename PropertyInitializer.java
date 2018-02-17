package assign2;

/**
 * Class that initializes properties given a line from the input file.
 *
 * @author Aiden
 */
public class PropertyInitializer {

    /**
     * Initializes a property with a store on it.
     *
     * @param s String containing the data from this property's line in the
     * input file.
     */
    public static void initStore(String s) {
        String[] data = s.split("\\s"); //Split string at whitespaces
        int count = 1; //Counter to iterate over the array
        //Parse strings into appropriate data type for building attributes
        double sqft = Double.parseDouble(data[count++]);
        String material = data[count++];
        boolean shelves = data[count++].equals("y");
        boolean checkout = data[count++].equals("y");
        boolean safe = data[count++].equals("y");
        //Init new store
        Store store = new Store(sqft, material, shelves, checkout, safe);
        count++; //Increment count again to skip property type
        //Parse strings into appropriate data type for property attributes
        int tax = Integer.parseInt(data[count++]);
        int price = Integer.parseInt(data[count++]);
        int lotSize = Integer.parseInt(data[count++]);
        String city = data[count++];
        String retailType = data[count++];
        //Init property
        RetailProperty property = new RetailProperty(tax, price, lotSize,
                city, store, retailType);
        //Add property to list of all properties
        PropertySearch.allProperties.add(property);
    }

    /**
     * Initializes a property with a factory on it.
     *
     * @param s String containing the data from this property's line in the
     * input file.
     */
    public static void initFactory(String s) {
        String[] data = s.split("\\s"); //Split string at whitespaces
        int count = 1; //Counter to iterate over the array
        int sqft = Integer.parseInt(data[count++]);
        String material = data[count++];
        boolean crane = data[count++].equals("y");
        boolean equipment = data[count++].equals("y");
        boolean railAccess = data[count++].equals("y");
        //Init new factory
        Factory factory = new Factory(sqft, material, crane, equipment,
                railAccess);
        count++; //Increment count again to skip property type
        int tax = Integer.parseInt(data[count++]);
        int price = Integer.parseInt(data[count++]);
        int lotSize = Integer.parseInt(data[count++]);
        String city = data[count++];
        String industryType = data[count++];
        //Init property
        IndustrialProperty property = new IndustrialProperty(tax, price,
                lotSize, city, factory, industryType);
        //Add property to list of all properties
        PropertySearch.allProperties.add(property);
    }

    /**
     * Initializes a property with a house/farm on it.
     *
     * @param s String containing the data from this property's line in the
     * input file.
     */
    public static void initHouse(String s) {
        String[] data = s.split("\\s"); //Split string at whitespaces
        int count = 1; //Counter to iterate over the array
        int sqft = Integer.parseInt(data[count++]);
        String material = data[count++];
        String houseType = data[count++];
        int numBed = Integer.parseInt(data[count++]);
        int numBath = Integer.parseInt(data[count++]);
        boolean basement = data[count++].equals("y");
        //Init new house
        House house = new House(sqft, material, houseType, numBed, numBath,
                basement);
        //Check if this is a farm
        boolean farm = data[count++].equals("f");
        int tax = Integer.parseInt(data[count++]);
        int price = Integer.parseInt(data[count++]);
        int lotSize = Integer.parseInt(data[count++]);
        String city = data[count++];
        boolean sewer = data[count++].equals("y");
        boolean water = data[count++].equals("y");
        boolean garage = data[count++].equals("y");
        boolean pool = data[count++].equals("y");
        if (!farm) {
            //Init property
            ResidentialProperty property = new ResidentialProperty(tax, price,
                    lotSize, city, house, sewer, water, garage, pool);
            //Add property to list of all properties
            PropertySearch.allProperties.add(property);
        } else {
            String cropType = data[count++];
            FarmingProperty property = new FarmingProperty(tax, price, lotSize,
                    city, house, sewer, water, garage, pool, cropType);
            PropertySearch.allProperties.add(property);
        }
    }

}
