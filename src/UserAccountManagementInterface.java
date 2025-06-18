import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserAccountManagementInterface extends JFrame {
    private JTextField txtUsername, txtEmail;
    private JPasswordField txtCurrentPassword, txtNewPassword, txtConfirmPassword;
    private JButton btnSaveChanges, btnCancel;

    public UserAccountManagementInterface() {
        setTitle("Account Management");
        setSize(350, 300); // Adjust size as needed
        setLayout(new GridLayout(6, 2, 10, 10)); // Grid layout for labels and fields
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Add user detail fields
        add(new JLabel("Username:"));
        txtUsername = new JTextField();
        add(txtUsername);

        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel("Current Password:"));
        txtCurrentPassword = new JPasswordField();
        add(txtCurrentPassword);

        add(new JLabel("New Password:"));
        txtNewPassword = new JPasswordField();
        add(txtNewPassword);

        add(new JLabel("Confirm New Password:"));
        txtConfirmPassword = new JPasswordField();
        add(txtConfirmPassword);

        // Add save and cancel buttons
        btnSaveChanges = new JButton("Save Changes");
        btnCancel = new JButton("Cancel");
        add(btnSaveChanges);
        add(btnCancel);

        // Action listeners for buttons
        btnSaveChanges.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAccountChanges();
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserAccountManagementInterface.this.dispose(); // Close the window
            }
        });
    }

    private void saveAccountChanges() {
        // Placeholder for save logic
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String currentPassword = new String(txtCurrentPassword.getPassword());
        String newPassword = new String(txtNewPassword.getPassword());
        String confirmPassword = new String(txtConfirmPassword.getPassword());

        // Validate and save new user details
        // Implement your logic here to update the user's account information
        System.out.println("Account changes saved for user: " + username);
        // Close the window or show a message after saving changes
    }
}
