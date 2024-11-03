package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class NhanVienGUI extends JPanel {
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JLabel titleLabel;
    private JTextField maNV, tenNV, sdt, cccd, email, ngaySinh;
    private JComboBox<String> chucVuCombo;
    private JRadioButton gioiTinhNam, gioiTinhNu;
    private DefaultTableModel tableModel;
    private JButton themButton, xoaButton, suaButton, xoaTrangButton, timButton;
    private JTextField timField;
    private JTable table;
    private ButtonGroup gioiTinhGroup;

    public NhanVienGUI() {
        setLayout(new BorderLayout());

        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        titleLabel = new JLabel("THÔNG TIN NHÂN VIÊN");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        topPanel.add(titleLabel);
        topPanel.add(Box.createVerticalStrut(10));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(1, 2, 20, 0)); // Two columns, spaced out
        inputPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.add(createInputBox("Mã nhân viên:", maNV = new JTextField(15)));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Tên nhân viên:", tenNV = new JTextField(15)));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Số điện thoại:", sdt = new JTextField(15)));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("CCCD:", cccd = new JTextField(15)));

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(createInputBox("Email:", email = new JTextField(15)));
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(createInputBox("Ngày sinh:", ngaySinh = new JTextField(15)));
        
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new BoxLayout(genderPanel, BoxLayout.X_AXIS));
        JLabel genderLabel = new JLabel("Giới tính:");
        genderLabel.setPreferredSize(new Dimension(100, 30));
        gioiTinhNam = new JRadioButton("Nam");
        gioiTinhNu = new JRadioButton("Nữ");
        gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(gioiTinhNam);
        gioiTinhGroup.add(gioiTinhNu);
        genderPanel.add(genderLabel);
        genderPanel.add(Box.createHorizontalStrut(10));
        genderPanel.add(gioiTinhNam);
        genderPanel.add(gioiTinhNu);
        rightPanel.add(genderPanel);
        rightPanel.add(Box.createVerticalStrut(10));

        JPanel positionPanel = new JPanel();
        positionPanel.setLayout(new BoxLayout(positionPanel, BoxLayout.X_AXIS));
        JLabel positionLabel = new JLabel("Chức vụ:");
        positionLabel.setPreferredSize(new Dimension(100, 30));
        chucVuCombo = new JComboBox<>(new String[] {"Quản lý", "Nhân viên"});
        positionPanel.add(positionLabel);
        positionPanel.add(Box.createHorizontalStrut(10));
        positionPanel.add(chucVuCombo);
        rightPanel.add(positionPanel);

        inputPanel.add(leftPanel);
        inputPanel.add(rightPanel);

        topPanel.add(inputPanel);
        topPanel.add(Box.createVerticalStrut(20));

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        String[] columnNames = {"Mã nhân viên", "Tên nhân viên", "Số điện thoại", "CCCD", "Email", "Giới tính", "Ngày sinh", "Chức vụ"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(800, 300));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        themButton = createButton("Thêm", 80, 30);
        xoaButton = createButton("Xóa", 80, 30);
        suaButton = createButton("Sửa", 80, 30);
        xoaTrangButton = createButton("Xóa Trắng", 100, 30);
        timField = new JTextField(10);
        timButton = createButton("Tìm", 80, 30);

        buttonPanel.add(Box.createHorizontalStrut(40));
        buttonPanel.add(themButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(xoaButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(suaButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(xoaTrangButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(timField);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(timButton);
        buttonPanel.add(Box.createHorizontalStrut(70));

        bottomPanel.add(buttonPanel, BorderLayout.NORTH);
        bottomPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
    }

    private JPanel createInputBox(String labelText, JComponent inputComponent) {
        JPanel box = new JPanel();
        box.setLayout(new BoxLayout(box, BoxLayout.X_AXIS));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(100, 30));
        box.add(label);
        box.add(Box.createHorizontalStrut(10));
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
