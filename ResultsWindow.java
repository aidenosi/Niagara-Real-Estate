package assign2;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class for search results window GUI which allows users to see information
 * about the properties that meet their search parameters.
 *
 * @author Aiden Osipenko
 */
public class ResultsWindow extends javax.swing.JFrame {

    //List of all valid properties
    private final ArrayList<Property> validProperties;
    //Declaring fields and labels for property attributes
    private javax.swing.JTextField taxField;
    private java.awt.Label taxLabel;
    private javax.swing.JTextField priceField;
    private java.awt.Label priceLabel;
    private javax.swing.JTextField lotSizeField;
    private java.awt.Label lotSizeLabel;
    private javax.swing.JTextField cityField;
    private java.awt.Label cityLabel;
    private javax.swing.JTextField materialField;
    private java.awt.Label materialLabel;
    private javax.swing.JTextField buildingSizeField;
    private java.awt.Label buildingSizeLabel;
    private javax.swing.JTextField sewerField;
    private java.awt.Label sewerLabel;
    private javax.swing.JTextField waterField;
    private java.awt.Label waterLabel;
    private javax.swing.JTextField garageField;
    private java.awt.Label garageLabel;
    private javax.swing.JTextField poolField;
    private java.awt.Label poolLabel;
    private javax.swing.JTextField numBedField;
    private java.awt.Label numBedLabel;
    private javax.swing.JTextField numBathField;
    private java.awt.Label numBathLabel;
    private javax.swing.JTextField basementField;
    private java.awt.Label basementLabel;
    private javax.swing.JTextField houseTypeField;
    private java.awt.Label houseTypeLabel;
    private javax.swing.JTextField cropTypeField;
    private java.awt.Label cropTypeLabel;
    private javax.swing.JTextField industryTypeField;
    private java.awt.Label industryTypeLabel;
    private javax.swing.JTextField craneField;
    private java.awt.Label craneLabel;
    private javax.swing.JTextField equipmentField;
    private java.awt.Label equipmentLabel;
    private javax.swing.JTextField railAccessField;
    private java.awt.Label railAccessLabel;
    private javax.swing.JTextField retailTypeField;
    private java.awt.Label retailTypeLabel;
    private javax.swing.JTextField shelvesField;
    private java.awt.Label shelvesLabel;
    private javax.swing.JTextField checkoutField;
    private java.awt.Label checkoutLabel;
    private javax.swing.JTextField safeField;
    private java.awt.Label safeLabel;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton nextButton;

    /**
     * Constructor. Calls initComponents() to build GUI, and sets list of valid
     * properties.
     *
     * @param validProperties List of valid properties according to search
     * parameters.
     */
    public ResultsWindow(ArrayList<Property> validProperties) {
        this.validProperties = validProperties;
        initComponents();
    }

    /**
     * Builds GUI.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Search Results"); //Set title of JFrame
        //Use grid layout with two columns
        setLayout(new GridLayout(0, 2, 20, 30));

        //Init and adding defualt labels and text fields to JFrame
        taxLabel = new java.awt.Label("Taxes");
        add(taxLabel);
        taxField = new javax.swing.JTextField(20);
        taxField.setEditable(false);
        add(taxField);

        priceLabel = new java.awt.Label("Max Price");
        add(priceLabel);
        priceField = new javax.swing.JTextField(20);
        priceField.setEditable(false);
        add(priceField);

        lotSizeLabel = new java.awt.Label("Lot Size (sqft)");
        add(lotSizeLabel);
        lotSizeField = new javax.swing.JTextField(20);
        lotSizeField.setEditable(false);
        add(lotSizeField);

        cityLabel = new java.awt.Label("City");
        add(cityLabel);
        cityField = new javax.swing.JTextField(20);
        cityField.setEditable(false);
        add(cityField);

        materialLabel = new java.awt.Label("Material");
        add(materialLabel);
        materialField = new javax.swing.JTextField(20);
        materialField.setEditable(false);
        add(materialField);

        buildingSizeLabel = new java.awt.Label("Building Size (sqft)");
        add(buildingSizeLabel);
        buildingSizeField = new javax.swing.JTextField(20);
        buildingSizeField.setEditable(false);
        add(buildingSizeField);

        //Get property type that was searched for
        String propType = "";
        if (!validProperties.isEmpty()) {
            propType = validProperties.get(0).type;
        }
        //Switch to call correct method to set up GUI according to property type
        switch (propType) {
            case "farm":
                initFarmComponents();
                break;
            case "industrial":
                initIndustrialComponents();
                break;
            case "retail":
                initRetailComponents();
                break;
            //Init GUI as residential if searching for residential or if there 
            //are no valid properties
            default:
                initResidentialComponents();
                break;
        }

        //Init and add next and quit buttons
        nextButton = new javax.swing.JButton("Next");
        add(nextButton);
        quitButton = new javax.swing.JButton("Quit");
        add(quitButton);
        //
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Adding action listener to next and quit buttons
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        pack(); //Pack components
        //Check if there are no properties that meet search parameters
        if (validProperties.isEmpty()) {
            noValidPropertiesPrompt("No properties found.");
        } else {
            //Fill text fields with information of first valid property
            fillTextFields(validProperties.remove(0));
        }
        this.setVisible(true); //Set JFrame to be visible
    }

    /**
     * Initializes GUI components for displaying residential properties.
     */
    private void initResidentialComponents() {
        //Init and adding labels and text fields
        sewerLabel = new java.awt.Label("Sewer");
        add(sewerLabel);
        sewerField = new javax.swing.JTextField(20);
        sewerField.setEditable(false);
        add(sewerField);

        waterLabel = new java.awt.Label("Water");
        add(waterLabel);
        waterField = new javax.swing.JTextField(20);
        waterField.setEditable(false);
        add(waterField);

        garageLabel = new java.awt.Label("Garage");
        add(garageLabel);
        garageField = new javax.swing.JTextField(20);
        garageField.setEditable(false);
        add(garageField);

        poolLabel = new java.awt.Label("Pool");
        add(poolLabel);
        poolField = new javax.swing.JTextField(20);
        poolField.setEditable(false);
        add(poolField);

        numBedLabel = new java.awt.Label("Bedrooms");
        add(numBedLabel);
        numBedField = new javax.swing.JTextField(20);
        numBedField.setEditable(false);
        add(numBedField);

        numBathLabel = new java.awt.Label("Bathrooms");
        add(numBathLabel);
        numBathField = new javax.swing.JTextField(20);
        numBathField.setEditable(false);
        add(numBathField);

        basementLabel = new java.awt.Label("Basement");
        add(basementLabel);
        basementField = new javax.swing.JTextField(20);
        basementField.setEditable(false);
        add(basementField);

        houseTypeLabel = new java.awt.Label("House Type");
        add(houseTypeLabel);
        houseTypeField = new javax.swing.JTextField(20);
        houseTypeField.setEditable(false);
        add(houseTypeField);
    }

    /**
     * Initializes GUI components for displaying farm properties.
     */
    public void initFarmComponents() {
        //Farms have same attributes as residential (ergo same GUI components)
        initResidentialComponents();
        //Init and adding label and text field
        cropTypeLabel = new java.awt.Label("Crop Type"); //Init and add label
        add(cropTypeLabel);
        cropTypeField = new javax.swing.JTextField(); //Init and add text field
        cropTypeField.setEditable(false);
        add(cropTypeField);
    }

    /**
     * Initializes GUI components for displaying industrial properties.
     */
    public void initIndustrialComponents() {
        //Init and adding labels and text fields
        industryTypeLabel = new java.awt.Label("Industry Type");
        add(industryTypeLabel);
        industryTypeField = new javax.swing.JTextField(20);
        industryTypeField.setEditable(false);
        add(industryTypeField);

        craneLabel = new java.awt.Label("Crane Included");
        add(craneLabel);
        craneField = new javax.swing.JTextField(20);
        craneField.setEditable(false);
        add(craneField);

        equipmentLabel = new java.awt.Label("Equipment");
        add(equipmentLabel);
        equipmentField = new javax.swing.JTextField(20);
        equipmentField.setEditable(false);
        add(equipmentField);

        railAccessLabel = new java.awt.Label("Rail Access");
        add(railAccessLabel);
        railAccessField = new javax.swing.JTextField(20);
        railAccessField.setEditable(false);
        add(railAccessField);
    }

    /**
     * Initializes GUI components for displaying retail properties.
     */
    public void initRetailComponents() {
        //Init and adding labels and text fields
        retailTypeLabel = new java.awt.Label("Retail Type");
        add(retailTypeLabel);
        retailTypeField = new javax.swing.JTextField(20);
        retailTypeField.setEditable(false);
        add(retailTypeField);

        shelvesLabel = new java.awt.Label("Shelves Included");
        add(shelvesLabel);
        shelvesField = new javax.swing.JTextField(20);
        shelvesField.setEditable(false);
        add(shelvesField);

        checkoutLabel = new java.awt.Label("Cash Registers Included");
        add(checkoutLabel);
        checkoutField = new javax.swing.JTextField(20);
        checkoutField.setEditable(false);
        add(checkoutField);

        safeLabel = new java.awt.Label("Safe Included");
        add(safeLabel);
        safeField = new javax.swing.JTextField(20);
        safeField.setEditable(false);
        add(safeField);
    }

    /**
     * Displays a message to the user (used for when there are no properties
     * remaining) and exits program.
     *
     * @param s String to write in prompt.
     */
    private void noValidPropertiesPrompt(String s) {
        Object[] quit = {"Quit"};
        JOptionPane.showOptionDialog(null, s, "Attention",
                JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE, null,
                quit, quit[0]);
        System.exit(0); //Exit program
    }

    /**
     * Fills default text fields and then calls corresponding method to fill
     * text fields specific to the different types of properties.
     *
     * @param p Property whose information is to be displayed.
     */
    private void fillTextFields(Property p) {
        //Filling text fields with property information
        taxField.setText(String.valueOf(p.getTax()));
        priceField.setText(String.valueOf(p.getPrice()));
        lotSizeField.setText(String.valueOf(p.getLotSize()));
        switch (p.getCity()) { //Switch statement to write full city name
            case "stct":
                cityField.setText("St Catharines");
                break;
            case "wlld":
                cityField.setText("Welland");
                break;
            case "ngfl":
                cityField.setText("Niagara Falls");
                break;
            case "fter":
                cityField.setText("Fort Erie");
                break;
        }
        materialField.setText(p.getBuilding().getMaterial());
        buildingSizeField.setText(String.valueOf(p.getBuilding().getSize()));
        //Check property type and call corresponding method to fill text fields
        switch (p.getType()) {
            case "residential":
                fillResidentialInfo((ResidentialProperty) p);
                break;
            case "farm":
                fillFarmInfo((FarmingProperty) p);
                break;
            case "industrial":
                fillIndustrialInfo((IndustrialProperty) p);
                break;
            case "retail":
                fillRetailInfo((RetailProperty) p);
                break;
        }
    }

    /**
     * Fills text fields for a residential property.
     *
     * @param p ResidentialProperty whose information is to be displayed.
     */
    private void fillResidentialInfo(ResidentialProperty p) {
        //Filling text fields with property information
        sewerField.setText(p.usesCitySewer() ? "Yes" : "No");
        waterField.setText(p.usesCityWater() ? "Yes" : "No");
        garageField.setText(p.hasGarage() ? "Yes" : "No");
        poolField.setText(p.hasPool() ? "Yes" : "No");
        House house = (House) p.getBuilding(); //Pointer for easier referencing
        numBedField.setText(String.valueOf(house.getNumBed()));
        numBathField.setText(String.valueOf(house.getNumBath()));
        basementField.setText(house.hasBasement() ? "Yes" : "No");
        houseTypeField.setText(house.getHouseType());
    }

    /**
     * Fills text fields for a farming property.
     *
     * @param p FarmingProperty whose information is to be displayed.
     */
    private void fillFarmInfo(FarmingProperty p) {
        //Farms have same attributes as residential property
        fillResidentialInfo((ResidentialProperty) p);
        cropTypeField.setText(p.getCropType());
    }

    /**
     * Fills text fields for an industrial property.
     *
     * @param p IndustrialProperty whose information is to be displayed.
     */
    private void fillIndustrialInfo(IndustrialProperty p) {
        //Filling text fields with property information
        industryTypeField.setText(p.getIndustryType());
        Factory factory = (Factory) p.getBuilding();
        craneField.setText((factory.hasCrane() ? "Yes" : "No"));
        equipmentField.setText((factory.hasEquipment() ? "Yes" : "No"));
        railAccessField.setText((factory.hasRailAccess() ? "Yes" : "No"));
    }

    /**
     * Fills text fields for a retail property.
     *
     * @param p RetailProperty whose information is to be displayed.
     */
    private void fillRetailInfo(RetailProperty p) {
        //Filling text fields with property information
        retailTypeField.setText(p.getRetailType());
        Store store = (Store) p.getBuilding();
        shelvesField.setText((store.hasShelves() ? "Yes" : "No"));
        checkoutField.setText((store.hasCheckout() ? "Yes" : "No"));
        safeField.setText((store.hasSafe() ? "Yes" : "No"));
    }

    /**
     * Exit program when Quit button is clicked.
     *
     * @param evt
     */
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /**
     * Calls fillTextFields.
     *
     * @param evt
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //Check that there are still valid properties to show
        if (!validProperties.isEmpty()) {
            //Fill text fields with information of next valid property, and 
            //remove that property from the list.
            fillTextFields(validProperties.remove(0));
        } else {
            noValidPropertiesPrompt("No more valid properties.");
        }
    }
}
