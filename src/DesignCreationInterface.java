import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesignCreationInterface extends JFrame {
    private JTextField txtRoomName;
    private JButton btnSave, btnCancel;
    private JPanel designPanel; // Panel to draw or layout the design

    public DesignCreationInterface() {
        setTitle("Design Creation");
        setSize(500, 400); // Adjust size as needed
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Top panel for room name input
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.add(new JLabel("Room Name:"));
        txtRoomName = new JTextField(20);
        topPanel.add(txtRoomName);
        add(topPanel, BorderLayout.NORTH);

        // Design panel where the room layout will be created or displayed
        designPanel = new JPanel();
        designPanel.setBackground(Color.WHITE); // Set background to distinguish area
        add(designPanel, BorderLayout.CENTER); // Add this to your frame

        // Bottom panel for buttons
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnSave = new JButton("Save");
        btnCancel = new JButton("Cancel");
        bottomPanel.add(btnSave);
        bottomPanel.add(btnCancel);
        add(bottomPanel, BorderLayout.SOUTH);

        // Action listeners for buttons
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDesign();
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DesignCreationInterface.this.dispose(); // Close the window
            }
        });
    }

    private void saveDesign() {
        // Placeholder for save logic
        String roomName = txtRoomName.getText();
        // Here, implement the logic to save the room design
        System.out.println("Design for '" + roomName + "' saved.");
        // Close the window or clear the fields for new design
    }
}
