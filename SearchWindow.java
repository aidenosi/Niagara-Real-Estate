package assign2;

import java.awt.GridLayout;

/**
 * Class for search window GUI which allows users to enter their search
 * parameters.
 *
 * @author Aiden Osipenko
 */
public class SearchWindow extends javax.swing.JFrame {

    //Declaring fields and labels for search parameters
    private javax.swing.JTextField cityField;
    private java.awt.Label cityLabel;
    private javax.swing.JTextField priceField;
    private java.awt.Label priceLabel;
    private javax.swing.JTextField propTypeField;
    private java.awt.Label propTypeLabel;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton searchButton;

    /**
     * Constructor. Calls initComponents to build GUI.
     */
    public SearchWindow() {
        initComponents();
    }

    /**
     * Builds GUI.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        setTitle("Search Parameters");
        setLayout(new GridLayout(0, 2, 20, 30));

        //Init and adding labels and text fields to JFrame
        cityLabel = new java.awt.Label("City");
        add(cityLabel);
        cityField = new javax.swing.JTextField(20);
        add(cityField);

        priceLabel = new java.awt.Label("Max Price");
        add(priceLabel);
        priceField = new javax.swing.JTextField(20);
        add(priceField);

        propTypeLabel = new java.awt.Label("Property Type");
        add(propTypeLabel);
        propTypeField = new javax.swing.JTextField(20);
        add(propTypeField);

        //Init and adding search and quit buttons
        searchButton = new javax.swing.JButton("Search");
        add(searchButton);
        quitButton = new javax.swing.JButton("Quit");
        add(quitButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Adding action listener to search and quit buttons
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        pack();
        this.setVisible(true); //Set JFrame to be visible
    }

    /**
     * Exit program when Quit button is clicked.
     *
     * @param evt
     */
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String city, maxPrice, propType; //Strings to store text entered
        city = cityField.getText();
        maxPrice = priceField.getText();
        propType = propTypeField.getText();
        this.dispose(); //Dispose of the JFrame
        //Pass text to PropertySearch class
        PropertySearch.searchFor(city, maxPrice, propType);
    }
}
