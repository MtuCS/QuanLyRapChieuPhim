package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ThanhVienGUI extends JPanel {
	private JPanel topPanel;
    private JPanel bottomPanel;
    private JLabel titleLabel;
    private JTextField maKH, tenKH, sdt, email, diemTichLuy, searchFi;
    private DefaultTableModel tablemodel;
    private JButton addButton, searchButton, dAllButton, editButton,delButton;
    private JTable table;
	private Container boxInput;
	private JPanel boxButton;

    public ThanhVienGUI() {
        setLayout(new BorderLayout());
        
        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        titleLabel = new JLabel("THÔNG TIN THÀNH VIÊN");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        topPanel.add(titleLabel);
        topPanel.add(Box.createVerticalStrut(10));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(1, 2, 20, 0)); // Two columns, spaced out
        inputPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.add(createInputBox("Mã Khách hàng:", maKH = new JTextField(15)));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Tên Khách hàng:", tenKH = new JTextField(15)));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Điểm tích lũy:", diemTichLuy = new JTextField(15)));

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(createInputBox("Email:", email = new JTextField(15)));
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(createInputBox("Số điện thoại:", sdt = new JTextField(15)));

        // Add an "invisible" placeholder panel to balance the right panel
        JPanel invisibleBox = new JPanel();
        invisibleBox.setPreferredSize(new Dimension(0, 30)); // Set the height to match leftPanel spacing
        invisibleBox.setMaximumSize(new Dimension(0, 30)); // Keep it invisible
        rightPanel.add(Box.createVerticalStrut(10)); // Add vertical space before the invisible box
        rightPanel.add(invisibleBox);

        inputPanel.add(leftPanel);
        inputPanel.add(rightPanel);

        topPanel.add(inputPanel);
        topPanel.add(Box.createVerticalStrut(20));
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        String[] colname = {"Mã Khách hàng","Tên Khách hàng","Số điện thoại","Email","Điểm tích lũy"};
        tablemodel = new DefaultTableModel(colname, 0) {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        table = new JTable(tablemodel);
        table.setPreferredScrollableViewportSize(new Dimension(800, 300));

        boxButton = new JPanel();
        boxButton.setLayout(new BoxLayout(boxButton, BoxLayout.X_AXIS));
        boxButton.setBorder(new LineBorder(Color.BLACK, 2, true));

        addButton = createButton("Thêm", 80, 30);
        delButton = createButton("Xóa", 80, 30);
        editButton = createButton("Sửa", 80, 30);
        dAllButton = createButton("Xóa Trắng", 100, 30);
        searchFi = new JTextField(10);
        searchButton = createButton("Tìm", 80, 30);

        boxButton.add(Box.createHorizontalStrut(40));
        boxButton.add(addButton);
        boxButton.add(Box.createHorizontalStrut(10));
        boxButton.add(delButton);
        boxButton.add(Box.createHorizontalStrut(10));
        boxButton.add(editButton);
        boxButton.add(Box.createHorizontalStrut(10));
        boxButton.add(dAllButton);
        boxButton.add(Box.createHorizontalStrut(10));
        boxButton.add(searchFi);
        boxButton.add(Box.createHorizontalStrut(10));
        boxButton.add(searchButton);
        boxButton.add(Box.createHorizontalStrut(70));

        bottomPanel.add(boxButton, BorderLayout.NORTH);
        bottomPanel.add(new JScrollPane(table), BorderLayout.CENTER); // Bảng trong JScrollPane

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
    }

    private JPanel createInputBox(String labelText, JComponent inputComponent) {
        JPanel box = new JPanel();
        box.setLayout(new BoxLayout(box, BoxLayout.X_AXIS));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(100, 30)); // Đặt kích thước cố định cho nhãn
        box.add(label);
        box.add(Box.createHorizontalStrut(10)); // Khoảng cách
        box.add(inputComponent);
        return box;
    }
    

    private JButton createButton(String text, int width, int height) {
        JButton button = new JButton(text);
        button.setBackground(Color.decode("#35a06c"));
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(width, height));
        return button;
    }
}
