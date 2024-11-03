package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrangChuNhanVienGUI extends JFrame implements ActionListener {
    private JPanel boxall;
    private JPanel boxcenter;
    private JPanel boxwest;
    private ImageIcon anhuser;
    private Font fontChu;
    private JButton datVeBt;
    private JButton khachHangBt;
    private JButton dangnhapbt;
    private JLabel userlb;
    private ImagePanel imgPanel;
    private JButton selectedButton = null;
	private JButton trangChuBt;
    
    public TrangChuNhanVienGUI() {
        // Thiết lập cửa sổ chính
        super("Trang chủ");
        setSize(1200, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Tạo bố cục chính
        boxall = new JPanel();
        boxall.setLayout(new BorderLayout());

        // Panel trung tâm chứa hình nền và nội dung
        boxcenter = new JPanel();
        boxcenter.setLayout(new BorderLayout()); // Để thêm các nội dung mới vào giữa
        imgPanel = new ImagePanel("image\\rapchieuphim.jpeg");
        boxcenter.add(imgPanel, BorderLayout.CENTER);
        boxall.add(boxcenter, BorderLayout.CENTER);

        // Panel bên trái chứa các nút điều hướng
        boxwest = new JPanel();
        boxwest.setLayout(new BoxLayout(boxwest, BoxLayout.Y_AXIS));
        boxwest.setPreferredSize(new Dimension(200, 400));
        boxwest.setBackground(Color.decode("#1b7449"));
        boxall.add(boxwest, BorderLayout.WEST);

        add(boxall);

        fontChu = new Font("Roboto", Font.BOLD, 20);

        // Thiết lập hình ảnh người dùng
        anhuser = new ImageIcon("image\\user.png");
        JPanel imguser = new ImagePanel(anhuser);
        imguser.setPreferredSize(new Dimension(70, 100));
        imguser.setMaximumSize(new Dimension(70, 100));

        // Nhãn tên người dùng
        userlb = new JLabel("Nhân viên");
        userlb.setFont(new Font("Arial", Font.BOLD, 15));

        // Các nút chức năng
        trangChuBt = createButton("Trang Chủ", 180, 30);
        datVeBt = createButton("Vé", 180, 30);
        khachHangBt = createButton("Thành viên", 180, 30);

        // Nút đăng xuất
        trangChuBt.addActionListener(this);
        dangnhapbt = new JButton("Đăng xuất");
        dangnhapbt.setBackground(Color.decode("#1b7449"));
        dangnhapbt.setBorder(new EmptyBorder(0, 0, 0, 0));
        dangnhapbt.setForeground(Color.white);
        dangnhapbt.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Đăng ký sự kiện cho các nút
        datVeBt.addActionListener(this);
        khachHangBt.addActionListener(this);
        dangnhapbt.addActionListener(this);

        // Căn chỉnh tất cả các thành phần về giữa theo chiều ngang
        imguser.setAlignmentX(Component.CENTER_ALIGNMENT);
        userlb.setAlignmentX(Component.CENTER_ALIGNMENT);
        trangChuBt.setAlignmentX(Component.CENTER_ALIGNMENT);
        datVeBt.setAlignmentX(Component.CENTER_ALIGNMENT);
        khachHangBt.setAlignmentX(Component.CENTER_ALIGNMENT);
        dangnhapbt.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Căn chỉnh thành phần và thêm vào boxwest
        boxwest.add(Box.createRigidArea(new Dimension(0, 10))); // Khoảng cách trên cùng
        boxwest.add(imguser);
        boxwest.add(userlb);
        boxwest.add(Box.createRigidArea(new Dimension(0, 12)));
        boxwest.add(trangChuBt);
        boxwest.add(Box.createRigidArea(new Dimension(0, 12)));
        boxwest.add(datVeBt);
        boxwest.add(Box.createRigidArea(new Dimension(0, 12)));
        boxwest.add(khachHangBt);
        boxwest.add(Box.createRigidArea(new Dimension(0, 320)));
        boxwest.add(dangnhapbt);

        // Hiển thị cửa sổ ở giữa màn hình
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrangChuNhanVienGUI();
    }

    private JButton createButton(String text, int width, int height) {
        JButton button = new JButton(text);
        button.setBackground(Color.decode("#35a06c"));
        button.setForeground(Color.WHITE);
        button.setPreferredSize(new Dimension(width, height));
        button.setMaximumSize(new Dimension(width, height));
        button.setMinimumSize(new Dimension(width, height));
        button.setFont(fontChu);
        return button;
    }

    // Lớp ImagePanel để vẽ hình ảnh
    private class ImagePanel extends JPanel {
        private ImageIcon imageIcon;

        public ImagePanel(String imagePath) {
            this.imageIcon = new ImageIcon(imagePath);
        }

        public ImagePanel(ImageIcon imageIcon) {
            this.imageIcon = imageIcon;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (imageIcon != null) {
                g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
 // Phương thức thay đổi nội dung trong boxcenter
    private void changeContentPanel(JPanel newPanel) {
        // Xóa tất cả các component hiện tại trong boxcenter
        boxcenter.removeAll();

        // Thêm panel mới vào boxcenter
        boxcenter.add(newPanel, BorderLayout.CENTER);

        // Cập nhật lại giao diện
        boxcenter.revalidate(); // Cập nhật lại layout
        boxcenter.repaint(); // Vẽ lại panel
    }
    public void setFrameTitle(String title) {
        setTitle(title); // This sets the JFrame's title
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	JButton clickedButton = (JButton) e.getSource();

        if (selectedButton != null) {
            selectedButton.setBackground(Color.decode("#35a06c"));
        }

        clickedButton.setBackground(Color.decode("#69d4a0"));
        selectedButton = clickedButton;
        if (clickedButton == trangChuBt) {
            setFrameTitle("Trang Chủ");
            changeContentPanel(imgPanel);
        } else if (clickedButton == datVeBt) {
            changeContentPanel(new DatVeGUI());
            setFrameTitle("Đặt vé");
        } else if (clickedButton == khachHangBt) {
            changeContentPanel(new ThanhVienGUI());
            setFrameTitle("Đăng kí thành viên");
        } else if (clickedButton == dangnhapbt) {
            setVisible(false);
            new DangNhapGUI().setVisible(true);
        }
        
    }

}
