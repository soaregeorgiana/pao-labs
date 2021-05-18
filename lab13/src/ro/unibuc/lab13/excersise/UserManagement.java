package ro.unibuc.lab13.excersise;

import ro.unibuc.lab13.excersise.services.UserService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

import static java.awt.Color.RED;
import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

public class UserManagement {

    public static void main(String[] args) {

        UserService userService = UserService.getInstance();
        Vector<Vector<String>> users = userService.getAll();

        JFrame body = new JFrame("User management");

        Vector<String> tableHeader = new Vector<>();
        tableHeader.add("Name");
        tableHeader.add("Email");
        tableHeader.add("Active");

        JTable userTable = new JTable(users, tableHeader);
        userTable.setSelectionMode(SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(userTable);
        JPanel mainPanel = new JPanel();
        mainPanel.add(scrollPane);

        JButton addButton = new JButton("Add a new user");
        addButton.addActionListener(e -> new AddUserFrame(body, userTable));

        JButton deleteButton = new JButton("Delete button");
        deleteButton.addActionListener(e -> {
            int selectedIndex = userTable.getSelectedRow();
            userService.delete(selectedIndex);
            ((DefaultTableModel) userTable.getModel()).removeRow(selectedIndex);
        });

        deleteButton.setBackground(RED);

        mainPanel.add(addButton);
        mainPanel.add(deleteButton);

        body.add(mainPanel);
        body.pack();
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        body.setVisible(true);

    }
}
