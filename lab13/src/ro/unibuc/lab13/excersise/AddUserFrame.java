package ro.unibuc.lab13.excersise;

import ro.unibuc.lab13.excersise.dto.User;
import ro.unibuc.lab13.excersise.services.UserService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddUserFrame extends JFrame {

    private UserService userService = UserService.getInstance();

    private String name;
    private String email;

    private JFrame parent;
    private JTable parentTable;
    private JPanel buttonsPanel = new JPanel(new GridLayout(1, 2));
    private JPanel fieldsPanel = new JPanel(new GridLayout(2, 1));
    private JPanel mainPanel = new JPanel(new GridLayout(3, 1));
    private JButton saveButton = new JButton("Save");

    public AddUserFrame(JFrame parent, JTable table) {
        this.parent = parent;
        this.parentTable = table;
        this.parent.setEnabled(false);

        this.setFields();
        this.setButtons();

        this.mainPanel.add(fieldsPanel);
        this.mainPanel.add(buttonsPanel);
        this.mainPanel.setPreferredSize(new Dimension(500, 500));

        this.add(mainPanel);
        this.pack();
        this.setVisible(true);
    }

    private void setFields() {
        JLabel nameLabel = new JLabel("Name: ");
        JLabel emailLabel = new JLabel("Email: ");

        JTextField nameInput = new JTextField();
        nameInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                name = ((JTextField) e.getSource()).getText();
                saveButton.setEnabled(true);
            }
        });

        JTextField emailInput = new JTextField();
        emailInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                email = ((JTextField) e.getSource()).getText();
                saveButton.setEnabled(true);
            }
        });

        fieldsPanel.add(nameLabel);
        fieldsPanel.add(nameInput);
        fieldsPanel.add(emailLabel);
        fieldsPanel.add(emailInput);
    }

    private void setButtons() {
        buttonsPanel.setPreferredSize(new Dimension(100, 10));
        saveButton.setPreferredSize(new Dimension(20, 10));
        saveButton.setEnabled(false);
        saveButton.addActionListener(e -> {
            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setActive(true);
            userService.add(user);

            ((DefaultTableModel) parentTable.getModel()).addRow(new Object[]{name, email, "YES"});
            enableParent();
        });

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setPreferredSize(new Dimension(20, 10));
        cancelButton.addActionListener(e -> {
            enableParent();
        });
        buttonsPanel.add(saveButton);
        buttonsPanel.add(cancelButton);
    }

    private void enableParent() {
        this.setVisible(true);
        parent.setEnabled(true);
    }

}
