import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FurnitureCatalogInterface extends JFrame {
    private JList<String> furnitureList;
    private DefaultListModel<String> furnitureModel;
    private JButton btnSelect, btnCancel;

    public FurnitureCatalogInterface() {
        setTitle("Furniture Catalog");
        setSize(400, 300); // Adjust size as needed
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window on close

        // Model for furniture items
        furnitureModel = new DefaultListModel<>();
        furnitureModel.addElement("Chair");
        furnitureModel.addElement("Table");
        furnitureModel.addElement("Sofa");
        furnitureModel.addElement("Bed"); // Add more items as needed

        // Furniture list
        furnitureList = new JList<>(furnitureModel);
        furnitureList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(furnitureList);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSelect = new JButton("Select");
        btnCancel = new JButton("Cancel");
        buttonPanel.add(btnSelect);
        buttonPanel.add(btnCancel);
        add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners for buttons
        btnSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectFurniture();
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FurnitureCatalogInterface.this.dispose(); // Close the window
            }
        });
    }

    private void selectFurniture() {
        String selectedFurniture = furnitureList.getSelectedValue();
        // Placeholder for selection logic
        System.out.println("Selected furniture: " + selectedFurniture);
        // Here, you can add logic to handle the selected furniture item
        // For example, adding it to the room design or displaying more details
    }
}
