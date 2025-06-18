import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoomConfigurationInterface extends JFrame {
    private JTextField lengthField;
    private JTextField widthField;
    private JTextField heightField;
    private JComboBox<String> colorSchemeDropdown;
    private JButton saveButton;

    public RoomConfigurationInterface() {
        setTitle("Room Configuration");
        setSize(350, 220); // Adjust the size as needed
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns, spacing between them

        // Add room dimension fields
        add(new JLabel("Length (m):"));
        lengthField = new JTextField();
        add(lengthField);

        add(new JLabel("Width (m):"));
        widthField = new JTextField();
        add(widthField);

        add(new JLabel("Height (m):"));
        heightField = new JTextField();
        add(heightField);

        // Add color scheme selector
        add(new JLabel("Color Scheme:"));
        String[] colorOptions = {"Select", "Bright", "Neutral", "Dark"}; // Example options
        colorSchemeDropdown = new JComboBox<>(colorOptions);
        add(colorSchemeDropdown);

        // Add save button
        saveButton = new JButton("Save Configuration");
        add(new JLabel()); // Empty label for alignment
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveRoomConfiguration();
            }
        });
        add(saveButton);
    }

    private void saveRoomConfiguration() {
        // Placeholder for saving logic
        String length = lengthField.getText();
        String width = widthField.getText();
        String height = heightField.getText();
        String colorScheme = (String) colorSchemeDropdown.getSelectedItem();

        // Here, add the code to save these configurations or use them as needed
        System.out.println("Room Configuration Saved: " + length + "x" + width + "x" + height + ", Color Scheme: " + colorScheme);
        // Close the window after saving
        dispose();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new RoomConfigurationInterface().setVisible(true);
        });
    }
}
