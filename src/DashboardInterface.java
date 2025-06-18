import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardInterface extends JFrame {
    private JButton btnRoomConfig;
    private JButton btnDesignCreation;
    private JButton btnViewDesigns;
    private JButton btnAccountSettings;
    private JButton btnDesignGallery;
    private JButton btnLogout;
    private JButton btnHelp;
    private JButton btnFurnitureCatalog;


    public DashboardInterface() {
        setTitle("Designer Dashboard");
        setSize(600, 400); // Adjusted for a better layout
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        JLabel welcomeLabel = new JLabel("Welcome to the Designer Dashboard");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(welcomeLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10)); // 5 rows, 1 column, spacing 10
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100)); // Margin

        // Initialize buttons and add them to the panel
        btnRoomConfig = new JButton("Room Configuration");
        btnDesignCreation = new JButton("Design Creation");
        btnViewDesigns = new JButton("View Designs");
        btnFurnitureCatalog = new JButton("Furniture Catalog");
        btnAccountSettings = new JButton("Account Settings");
        btnLogout = new JButton("Logout");
        btnHelp = new JButton("Help");
        btnDesignGallery = new JButton("Design Gallery");


        // Styling buttons
        styleButton(btnRoomConfig);
        styleButton(btnDesignCreation);
        styleButton(btnViewDesigns);
        styleButton(btnFurnitureCatalog);
        styleButton(btnAccountSettings);
        styleButton(btnDesignGallery);
        styleButton(btnHelp);
        styleButton(btnLogout);

        // Adding buttons to the panel
        buttonPanel.add(btnRoomConfig);
        buttonPanel.add(btnDesignCreation);
        buttonPanel.add(btnViewDesigns);
        buttonPanel.add(btnFurnitureCatalog);
        buttonPanel.add(btnAccountSettings);
        buttonPanel.add(btnLogout);
        buttonPanel.add(btnHelp);
        buttonPanel.add(btnDesignGallery);

        // Adding panels to the frame
        add(headerPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Adding action listeners for buttons
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout();
            }
        });

        // Other button listeners

        btnRoomConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Room Configuration Interface
                RoomConfigurationInterface roomConfig = new RoomConfigurationInterface();
                roomConfig.setVisible(true);
            }
        });

        btnFurnitureCatalog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Furniture Catalog Interface
                FurnitureCatalogInterface furnitureCatalog = new FurnitureCatalogInterface();
                furnitureCatalog.setVisible(true);
            }
        });

        btnDesignCreation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Design Creation Interface
                DesignCreationInterface designCreation = new DesignCreationInterface();
                designCreation.setVisible(true);
            }
        });

        btnAccountSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the User Account Management Interface
                UserAccountManagementInterface accountManagement = new UserAccountManagementInterface();
                accountManagement.setVisible(true);
            }
        });

        btnViewDesigns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the Design Gallery Interface
                DesignGalleryInterface designGallery = new DesignGalleryInterface();
                designGallery.setVisible(true);
            }
        });

        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the help Interface
                HelpPageInterface helpPage = new HelpPageInterface();
                helpPage.setVisible(true);
            }
        });

    }

    private void styleButton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(new Color(235, 245, 251));
        button.setFocusPainted(false);
    }

    private void logout() {
        // Placeholder for logout logic
        System.out.println("Logging out...");
        // Close dashboard and return to login screen
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new DashboardInterface().setVisible(true);
        });
    }



}
