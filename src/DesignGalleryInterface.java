import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList; //

public class DesignGalleryInterface extends JFrame {
    private JList<String> designList;
    private DefaultListModel<String> designModel;
    private JButton btnViewDesign, btnDeleteDesign, btnCancel;

    public DesignGalleryInterface() {
        setTitle("Design Gallery");
        setSize(400, 300); // Adjust size as needed
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Model for saved designs
        designModel = new DefaultListModel<>();
        loadDesigns(); // Placeholder method to load design names into the model

        // List to display designs
        designList = new JList<>(designModel);
        designList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(designList);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnViewDesign = new JButton("View");
        btnDeleteDesign = new JButton("Delete");
        btnCancel = new JButton("Cancel");
        buttonPanel.add(btnViewDesign);
        buttonPanel.add(btnDeleteDesign);
        buttonPanel.add(btnCancel);
        add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners for buttons
        btnViewDesign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSelectedDesign();
            }
        });

        btnDeleteDesign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedDesign();
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DesignGalleryInterface.this.dispose(); // Close the window
            }
        });
    }

    private void loadDesigns() {
        // This method should load the design names into the designModel
        // Example: designModel.addElement("Living Room Design");
        // Populate this list based on saved designs from your application's data
    }

    private void viewSelectedDesign() {
        // Logic to open and view the selected design
        String selectedDesign = designList.getSelectedValue();
        System.out.println("Viewing design: " + selectedDesign);
        // Implement the logic to open the selected design for viewing or editing
    }

    private void deleteSelectedDesign() {
        // Logic to delete the selected design
        String selectedDesign = designList.getSelectedValue();
        designModel.removeElement(selectedDesign);
        // Implement additional logic here to actually delete the design from your storage
        System.out.println("Deleted design: " + selectedDesign);
    }
}
