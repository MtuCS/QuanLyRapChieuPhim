package gui;

import javax.swing.*;
import java.awt.*;

public class DatVeGUI extends JPanel {
    public DatVeGUI() {
        // Khởi tạo các thành phần ở đây
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Chào mừng đến với chức năng Đặt Vé");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
    }
}
