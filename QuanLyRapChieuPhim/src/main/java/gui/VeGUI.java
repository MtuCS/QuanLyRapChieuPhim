package gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class VeGUI extends JPanel implements ActionListener{
	private JPanel boxtren;
    private JLabel titlelb;
    private JPanel box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13;
    private JPanel hang1,hang2,hang3,hang4,hang5;
    private JPanel boxduoi;
    private JPanel boxnut;
    private JButton thongKeBt, xoatrangbt, timbt;
    private JTextField timfi;
    private DefaultTableModel tablemodel;
    private JTable table;
	private JPanel boxtraiphai;
	private JPanel boxchatraiphai;
	private JTextField maVefi,ngayLapfi,loaiVefi,khachHangfi,nhanVienfi,phongChieufi,phimfi,viTriGhefi,suatChieufi,tenCTKMfi,mathuefi,giaVefi,hinhThucThanhToanfi;
	private ThongKeGUI thongKeGUI;
	private JSpinner startDateSpinner;
    public VeGUI() {
        setLayout(new BorderLayout());
        // Khởi tạo ThongKeGUI
        thongKeGUI = new ThongKeGUI();

        // Khởi tạo boxtren và đặt layout theo trục Y
        boxtren = new JPanel();
        boxtren.setLayout(new BoxLayout(boxtren, BoxLayout.Y_AXIS));
        boxtren.setBorder(new LineBorder(Color.BLACK, 2, true));

        // Khởi tạo boxduoi và đặt layout
        boxduoi = new JPanel();
        boxduoi.setLayout(new BorderLayout());
        boxduoi.setBorder(new LineBorder(Color.BLACK, 2, true));

        // Tạo tiêu đề
        titlelb = new JLabel("THÔNG TIN VÉ");
        titlelb.setFont(new Font("Roboto", Font.BOLD, 30));
        titlelb.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Khởi tạo JSpinner cho thời gian bắt đầu chỉ với ngày
        startDateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor startDateEditor = new JSpinner.DateEditor(startDateSpinner, "dd/MM/yyyy");
        startDateSpinner.setEditor(startDateEditor);
        startDateSpinner.setValue(Calendar.getInstance().getTime()); // Thiết lập thời gian hiện tại
        // Khởi tạo các box nhập liệu
        box1 = createInputBox("Mã vé:", maVefi = new JTextField(15));
        box2 = createInputBox("Thời gian lập:", startDateSpinner);
        box3 = createInputBox("Loại vé:", loaiVefi = new JTextField(15));
        box4 = createInputBox("Khách hàng:", khachHangfi = new JTextField(15));
        box5 = createInputBox("Nhân viên:", nhanVienfi = new JTextField(15));
        box6 = createInputBox("Phòng chiếu:", phongChieufi = new JTextField(15));
        box7 =(createInputBox("Phim:", phimfi = new JTextField(15)));
        box8= (createInputBox("Mã số ghế:", viTriGhefi = new JTextField(15)));
        box9=(createInputBox("Suất chiếu:", suatChieufi = new JTextField(15)));
        box10=(createInputBox("Mã khuyến mãi:", tenCTKMfi = new JTextField(15)));
        box11=(createInputBox("Thuế:", mathuefi = new JTextField(15)));
        box12=(createInputBox("Giá vé:", giaVefi = new JTextField(15)));
        box13=(createInputBox("Phương thức thanh toán:", hinhThucThanhToanfi = new JTextField(15)));

        // Khởi tạo hàng
        hang1 = new JPanel();
        hang1.setLayout(new BoxLayout(hang1, BoxLayout.X_AXIS));
        hang2 = new JPanel();
        hang2.setLayout(new BoxLayout(hang2, BoxLayout.X_AXIS));
        hang3 = new JPanel();
        hang3.setLayout(new BoxLayout(hang3, BoxLayout.X_AXIS));
        hang4 = new JPanel();
        hang4.setLayout(new BoxLayout(hang4, BoxLayout.X_AXIS));
        hang5 = new JPanel();
        hang5.setLayout(new BoxLayout(hang5, BoxLayout.X_AXIS));
        // Thêm các box vào hàng
        hang1.add(box1);
        hang1.add(box2);
        hang1.add(box3);
        
        hang2.add(box4);
        hang2.add(box5);
        
        hang3.add(box6);
        hang3.add(box6);
        
        hang4.add(box7);
        hang4.add(box8);
        hang4.add(box9);

        hang5.add(box10);
        hang5.add(box11);
        hang5.add(box12);

        hang5.add(Box.createVerticalStrut(10));


        // Khởi tạo boxtraiphai và thêm các hàng
        boxtraiphai = new JPanel();
        boxtraiphai.setLayout(new BoxLayout(boxtraiphai, BoxLayout.Y_AXIS));
        boxtraiphai.add(Box.createVerticalStrut(10));
        boxtraiphai.add(hang1);
        boxtraiphai.add(Box.createVerticalStrut(10));
        boxtraiphai.add(hang2);
        boxtraiphai.add(Box.createVerticalStrut(10));
        boxtraiphai.add(hang3);
        boxtraiphai.add(Box.createVerticalStrut(10));
        boxtraiphai.add(hang4);
        boxtraiphai.add(Box.createVerticalStrut(10));
        boxtraiphai.add(hang5);
        
        //tạo khoảng cách trại phải cho boxtraiphai
        boxchatraiphai = new JPanel();
        boxchatraiphai.setLayout(new BoxLayout(boxchatraiphai,BoxLayout.X_AXIS));
        boxchatraiphai.add(Box.createHorizontalStrut(10));
        boxchatraiphai.add(boxtraiphai);
        boxchatraiphai.add(Box.createHorizontalStrut(10));
        // Thêm thành phần vào boxtren
        boxtren.add(titlelb);
        boxtren.add(Box.createVerticalStrut(10));
        boxtren.add(boxchatraiphai);
        boxtren.add(Box.createVerticalStrut(20));

        // Khởi tạo bảng
        String[] colname = {"Mã vé","Thời gian lập","Loại vé","Khách hàng","Nhân viên","Phòng chiếu","Phim","Mã số ghế","Suất chiếu","Mã khuyến mãi","Thuế","Giá vé","Phương thức thanh toán"};
        tablemodel = new DefaultTableModel(colname, 0) {
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        table = new JTable(tablemodel);
        
        // Khởi tạo panel chứa các nút (boxnut)
        boxnut = new JPanel();
        boxnut.setLayout(new BoxLayout(boxnut, BoxLayout.X_AXIS));
        boxnut.setBorder(new LineBorder(Color.BLACK, 2, true));

        // Thêm các nút vào boxnut
        thongKeBt = createButton("Thống kê", 100, 30);
        xoatrangbt = createButton("Xóa Trắng", 100, 30);
        timfi = new JTextField(10);timfi.setPreferredSize(new Dimension(80, 30));
        timfi.setMaximumSize(new Dimension(400, 25));
        timfi.setMinimumSize(new Dimension(400, 25));
        timbt = createButton("Tìm", 80, 30);
        
        //thêm lệnh nghe sự kiện cho các nút
        thongKeBt.addActionListener(this);
        xoatrangbt.addActionListener(this);
        timbt.addActionListener(this);

        boxnut.add(Box.createHorizontalStrut(100));
        boxnut.add(thongKeBt);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(xoatrangbt);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(timfi);
        boxnut.add(Box.createHorizontalStrut(10));
        boxnut.add(timbt);
        boxnut.add(Box.createHorizontalStrut(70));

        // Thêm boxnut vào boxduoi và bảng vào vị trí CENTER
        boxduoi.add(boxnut, BorderLayout.NORTH);
        boxduoi.add(new JScrollPane(table), BorderLayout.CENTER); // Bảng trong JScrollPane

        // Thêm các panel vào layout chính
        add(boxtren, BorderLayout.NORTH);
        add(boxduoi, BorderLayout.CENTER);

        // Thiết lập kích thước cho bảng
        table.setPreferredScrollableViewportSize(new Dimension(800, 300));
    }

    // Hàm tạo một box với nhãn và ô nhập
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(thongKeBt)) {
			removeAll();
	        // Thêm panel mới vào boxcenter
			add(thongKeGUI, BorderLayout.CENTER);
	        revalidate(); 
	        repaint(); 
		}
	}
}
