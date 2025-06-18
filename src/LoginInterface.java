import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginInterface extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel mainPanel;

    public LoginInterface() {
        setTitle("Designer Login");
        setSize(400, 250); // Adjusted for better layout
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adds margin

        // Styling components
        JLabel titleLabel = new JLabel("Designer Portal Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Sets title font
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centers the title

        // Username components
        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameField = new JTextField(20);
        userPanel.add(userLabel);
        userPanel.add(usernameField);

        // Password components
        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField = new JPasswordField(20);
        passPanel.add(passLabel);
        passPanel.add(passwordField);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(new Color(0, 120, 215)); // Sets the background color
        loginButton.setForeground(Color.WHITE); // Sets the text color
        loginButton.setFocusPainted(false); // Removes border around text when clicked
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centers the button

        // Adding components to main panel
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 15))); // Adds space between elements
        mainPanel.add(userPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(passPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        mainPanel.add(loginButton);

        // Adding action listener to the button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });

        add(mainPanel);
    }

    private void performLogin() {
        // Get the username and password from the text fields
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Placeholder for actual authentication logic
        // Here, you should validate the credentials. This is just a basic example.
        if ("admin".equals(username) && "admin".equals(password)) {
            // Correct credentials; hide the login window
            this.setVisible(false); // 'this' refers to the current LoginInterface frame

            // Open the dashboard window
            DashboardInterface dashboard = new DashboardInterface();
            dashboard.setVisible(true);
        } else {
            // Incorrect credentials; show an error message
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new LoginInterface().setVisible(true);
        });
    }
}
