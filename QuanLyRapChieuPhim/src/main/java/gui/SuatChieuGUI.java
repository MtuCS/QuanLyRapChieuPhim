package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Calendar;

public class SuatChieuGUI extends JPanel {
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JLabel titleLabel;
    private JSpinner startDateSpinner, endDateSpinner;
    private JTextField maXuatChieu, searchField;
    private JComboBox<String> tenPhong, trangThaiPhong, phim, trangThaiXuatChieu;
    private DefaultTableModel tableModel;
    private JButton addButton, deleteButton, editButton, clearButton, searchButton;
    private JTable table;

    public SuatChieuGUI() {
        setLayout(new BorderLayout());

        // Panel tiêu đề
        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        titleLabel = new JLabel("THÔNG TIN SUẤT CHIẾU");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(titleLabel);
        topPanel.add(Box.createVerticalStrut(10));

        // Khởi tạo JSpinner cho thời gian bắt đầu và kết thúc
        startDateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor startDateEditor = new JSpinner.DateEditor(startDateSpinner, "dd/MM/yyyy HH:mm");
        startDateSpinner.setEditor(startDateEditor);
        startDateSpinner.setValue(Calendar.getInstance().getTime());

        endDateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor endDateEditor = new JSpinner.DateEditor(endDateSpinner, "dd/MM/yyyy HH:mm");
        endDateSpinner.setEditor(endDateEditor);
        endDateSpinner.setValue(Calendar.getInstance().getTime());

        // Panel thông tin nhập liệu với BoxLayout
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
        inputPanel.setLayout(new GridLayout(1, 2, 20, 0)); // 1 hàng, 2 cột, khoảng cách ngang 20px
        inputPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        
        leftPanel.add(createInputBox("Mã suất chiếu:", maXuatChieu = new JTextField(15)));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Tên Phòng:", tenPhong = new JComboBox<>(new String[]{"Phòng 1", "Phòng 2", "Phòng 3"})));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Trạng thái phòng:", trangThaiPhong = new JComboBox<>(new String[]{"Đang sử dụng", "Trống"})));
        leftPanel.add(Box.createVerticalStrut(10));
        leftPanel.add(createInputBox("Phim:", phim = new JComboBox<>(new String[]{"Phim 1", "Phim 2", "Phim 3"})));
        
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.add(createInputBox("Trạng thái suất chiếu:", trangThaiXuatChieu = new JComboBox<>(new String[]{"Sẵn sàng", "Hết chỗ"})));
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(createInputBox("Thời gian bắt đầu:", startDateSpinner));
        rightPanel.add(Box.createVerticalStrut(10));
        rightPanel.add(createInputBox("Thời gian kết thúc:", endDateSpinner));

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

        // Panel nút chức năng và tìm kiếm
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        addButton = createButton("Thêm", 80, 30);
        deleteButton = createButton("Xóa", 80, 30);
        editButton = createButton("Sửa", 80, 30);
        clearButton = createButton("Xóa trắng", 100, 30);
        searchField = new JTextField(10);
        searchButton = createButton("Tìm", 80, 30);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBorder(new LineBorder(Color.BLACK, 2, true));

        buttonPanel.add(Box.createHorizontalStrut(40));
        buttonPanel.add(addButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(deleteButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(editButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(clearButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(searchField);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(searchButton);
        buttonPanel.add(Box.createHorizontalStrut(70));

        bottomPanel.add(buttonPanel, BorderLayout.NORTH);

        // Bảng thông tin xuất chiếu
        String[] colNames = {"Mã xuất chiếu", "Tên Phòng", "Trạng thái phòng", "Phim", "Trạng thái xuất chiếu", "Thời gian bắt đầu", "Thời gian kết thúc"};
        tableModel = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        table = new JTable(tableModel);
        table.setPreferredScrollableViewportSize(new Dimension(800, 300));
        bottomPanel.add(new JScrollPane(table), BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.CENTER);
    }

    private JPanel createInputBox(String labelText, JComponent inputComponent) {
        JPanel box = new JPanel();
        box.setLayout(new BoxLayout(box, BoxLayout.X_AXIS));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(150, 30)); // Đặt kích thước cố định cho nhãn để căn chỉnh đều
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
