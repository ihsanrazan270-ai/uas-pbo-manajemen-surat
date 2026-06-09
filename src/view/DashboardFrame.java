package view;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Sistem Manajemen Surat");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JButton btnMasuk = new JButton("Surat Masuk");
        JButton btnKeluar = new JButton("Surat Keluar");
        JButton btnFilter = new JButton("Filter");
        JButton btnSorting = new JButton("Sorting Tanggal");
        JButton btnPdf = new JButton("Export PDF");

        panel.add(btnMasuk);
        panel.add(btnKeluar);
        panel.add(btnFilter);
        panel.add(btnSorting);
        panel.add(btnPdf);

        add(panel);
    }
}