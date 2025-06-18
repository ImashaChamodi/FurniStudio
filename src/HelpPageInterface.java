import javax.swing.*;
import java.awt.*;

public class HelpPageInterface extends JFrame {
    private JTextArea helpText;
    private JScrollPane scrollPane;

    public HelpPageInterface() {
        setTitle("Help Page");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Creating the help text area
        helpText = new JTextArea();
        helpText.setEditable(false); // Make the text area non-editable
        helpText.setFont(new Font("Arial", Font.PLAIN, 14));

        // Populate helpText with guidelines
        populateHelpText();

        // Adding the text area to a scroll pane
        scrollPane = new JScrollPane(helpText);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        mainPanel.add(scrollPane, BorderLayout.CENTER);
        add(mainPanel);
    }

    private void populateHelpText() {
        String guidelines = "Welcome to the Help Page\n\n" +
                "Here are some guidelines to help you navigate and use the system effectively:\n\n" +
                "1. Dashboard - Your central hub for accessing all features.\n" +
                "2. Room Configuration - Guide on how to set up your room designs.\n" +
                "3. Design Creation - Tips on creating engaging and aesthetically pleasing designs.\n" +
                "4. View Designs - How to view and manage your existing designs.\n" +
                "5. Furniture Catalog - Information on how to browse and select furniture for your designs.\n" +
                "6. Account Settings - Instructions on managing your account details and preferences.\n" +
                "7. Logout - Steps to securely logout of the system.\n\n" +
                "For further assistance, please contact our support team.";

        helpText.setText(guidelines);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            HelpPageInterface helpPage = new HelpPageInterface();
            helpPage.setVisible(true);
        });
    }
}
