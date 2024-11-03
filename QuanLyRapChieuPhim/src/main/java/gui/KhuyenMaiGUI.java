package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Calendar;

public class KhuyenMaiGUI extends JPanel {
    // Khai báo các thành phần
    private JPanel boxtren;
    private JLabel titlelb;
    private JPanel box1, box2, box3, box4, box5, box6;
    private JPanel boxtrai, boxphai, boxtraiphai;
    private JLabel makmlb, tenkmlb, tgbatdaulb, tgketthuclb, phantramlb, motalb;
    private JTextField makmfi, tenkmfi, phantramfi, motafi;
    private JSpinner startDateSpinner;
    private JSpinner endDateSpinner;
    private JPanel boxduoi;
    private JPanel boxnut;
    private JButton thembt, xoabt, suabt, xoatrangbt, timbt;
    private JTextField timfi;
    private DefaultTableModel tablemodel;
    private JTable table;

    public KhuyenMaiGUI() {
        setLayout(new BorderLayout());
        

        // Khởi tạo các panel và layout
        boxtren = new JPanel();
        boxtren.setLayout(new BoxLayout(boxtren, BoxLayout.Y_AXIS));
        boxtren.setBorder(new LineBorder(Color.BLACK, 2, true));

        boxduoi = new JPanel();
        boxduoi.setLayout(new BorderLayout());
        boxduoi.setBorder(new LineBorder(Color.BLACK, 2, true));

        titlelb = new JLabel("THÔNG TIN KHUYẾN MÃI");
        titlelb.setFont(new Font("Roboto", Font.BOLD, 30));
        titlelb.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Khởi tạo JSpinner cho thời gian bắt đầu
        startDateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor startDateEditor = new JSpinner.DateEditor(startDateSpinner, "dd/MM/yyyy HH:mm");
        startDateSpinner.setEditor(startDateEditor);
        startDateSpinner.setValue(Calendar.getInstance().getTime()); // Thiết lập thời gian hiện tại
        // Khởi tạo JSpinner cho thời gian kết thúc
        endDateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor endDateEditor = new JSpinner.DateEditor(endDateSpinner, "dd/MM/yyyy HH:mm");
        endDateSpinner.setEditor(endDateEditor);
        endDateSpinner.setValue(Calendar.getInstance().getTime()); // Thiết lập thời gian hiện tại
         
        // Khởi tạo các box con
        box1 = createInputBox("Mã khuyến mãi:", makmfi = new JTextField(15));
        box2 = createInputBox("Tên Khuyến Mãi:", tenkmfi = new JTextField(10));
        box3 = createInputBox("Thời gian bắt đầu:", startDateSpinner);
        box4 = createInputBox("Thời gian kết thúc:", endDateSpinner);
        box5 = createInputBox("Phần trăm giảm:", phantramfi = new JTextField(15));
        box6 = createInputBox("Mô tả:", motafi = new JTextField(15));

        // Tạo box trái và box phải
        boxtrai = new JPanel();
        boxtrai.setLayout(new BoxLayout(boxtrai, BoxLayout.Y_AXIS));
        boxphai = new JPanel();
        boxphai.setLayout(new BoxLayout(boxphai, BoxLayout.Y_AXIS));

        // Thêm các box vào boxtrai và boxphai
        boxtrai.add(box1);
        boxtrai.add(Box.createVerticalStrut(10));
        boxtrai.add(box3);
        boxtrai.add(Box.createVerticalStrut(10));
        boxtrai.add(box5);

        boxphai.add(box2);
        boxphai.add(Box.createVerticalStrut(10));
        boxphai.add(box4);
        boxphai.add(Box.createVerticalStrut(10));
        boxphai.add(box6);

        // Khởi tạo boxtraiphai
        boxtraiphai = new JPanel();
        boxtraiphai.setLayout(new BoxLayout(boxtraiphai, BoxLayout.X_AXIS));
        boxtraiphai.add(Box.createHorizontalStrut(10));
        boxtraiphai.add(boxtrai);
        boxtraiphai.add(Box.createHorizontalStrut(10));
        boxtraiphai.add(boxphai);
        boxtraiphai.add(Box.createHorizontalStrut(10));

        // Thêm thành phần vào boxtren
        boxtren.add(titlelb);
        boxtren.add(Box.createVerticalStrut(10));
        boxtren.add(boxtraiphai);
        boxtren.add(Box.createVerticalStrut(20));

        // Khởi tạo bảng
        String[] colname = {"Mã khuyến mãi", "Tên khuyến mãi", "Thời gian bắt đầu", "Thời gian kết thúc", "Phần trăm giảm", "Mô tả"};
        tablemodel = new DefaultTableModel(colname, 0) {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        table = new JTable(tablemodel);

        // Khởi tạo panel chứa các nút
        boxnut = new JPanel();
        boxnut.setLayout(new BoxLayout(boxnut, BoxLayout.X_AXIS));
        boxnut.setBorder(new LineBorder(Color.BLACK, 2, true));

        // Thêm các nút vào boxnut
        thembt = createButton("Thêm", 80, 30);
        xoabt = createButton("Xóa", 80, 30);
        suabt = createButton("Sửa", 80, 30);
        xoatrangbt = createButton("Xóa Trắng", 100, 30);
        timfi = new JTextField(10);
        timfi.setPreferredSize(new Dimension(80, 30));
        timfi.setMaximumSize(new Dimension(500, 25));
        timfi.setMinimumSize(new Dimension(500, 25));
        timbt = createButton("Tìm", 80, 30);

        boxnut.add(Box.createHorizontalStrut(40));
        boxnut.add(thembt);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(xoabt);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(suabt);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(xoatrangbt);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(timfi);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(timbt);
        boxnut.add(Box.createHorizontalStrut(70));

        // Thêm boxnut vào boxduoi và bảng vào vị trí CENTER
        boxduoi.add(boxnut, BorderLayout.NORTH);
        boxduoi.add(new JScrollPane(table), BorderLayout.CENTER);

        // Thêm các panel vào layout chính
        add(boxtren, BorderLayout.NORTH);
        add(boxduoi, BorderLayout.CENTER);

        // Thiết lập kích thước cho bảng
        table.setPreferredScrollableViewportSize(new Dimension(800, 300));
    }

    // Hàm tạo một box với nhãn và ô nhập
    private JPanel createInputBox(String labelText, JComponent component) {
        JPanel box = new JPanel();
        box.setLayout(new BoxLayout(box, BoxLayout.X_AXIS));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(150, 30)); // Kích thước cố định cho nhãn
        box.add(label);
        box.add(Box.createHorizontalStrut(10)); // Khoảng cách
        box.add(component);
        return box;
    }

    // Hàm tạo JSpinner cho ngày tháng
    private JSpinner createDateSpinner() {
        Calendar calendar = Calendar.getInstance();
        JSpinner spinner = new JSpinner(new SpinnerDateModel(calendar.getTime(), null, null, Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
        spinner.setEditor(editor);
        return spinner;
    }

    // Hàm tạo button
    private JButton createButton(String text, int width, int height) {
        JButton button = new JButton(text);
        button.setBackground(Color.decode("#35a06c"));
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(width, height));
        button.setMaximumSize(new Dimension(width, height));
        button.setMinimumSize(new Dimension(width, height));
        return button;
    }
}
