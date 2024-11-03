package gui;

import javax.swing.*;
import java.awt.*;

public class PhongGUI extends JPanel {
    public PhongGUI() {
        // Khởi tạo các thành phần ở đây
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Chào mừng đến với Quản lý Phòng");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
    }
}
