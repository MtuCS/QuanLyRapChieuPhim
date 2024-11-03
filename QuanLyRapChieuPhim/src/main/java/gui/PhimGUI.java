package gui;

import java.awt.BorderLayout;

import javax.swing.*;

public class PhimGUI extends JPanel {
    public PhimGUI() {
        // Khởi tạo các thành phần ở đây
        setLayout(new BorderLayout());
        // Ví dụ về một thành phần
        JLabel label = new JLabel("Chào mừng đến với Quản lý Phim");
        add(label);
    }
}
