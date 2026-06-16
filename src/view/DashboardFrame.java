package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        setTitle("Sistem Manajemen Surat");
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] kolom = {
            "ID",
            "Nomor Surat",
            "Pengirim",
            "Perihal",
            "Tanggal"
        };

        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        model.addRow(new Object[]{
    1,
    "SM001",
    "BEM Universitas",
    "Undangan Rapat",
    "2026-06-10"
});

model.addRow(new Object[]{
    2,
    "SM002",
    "HIMA Informatika",
    "Proposal Kegiatan",
    "2026-06-12"
});
        JTable tabel = new JTable(model);
        

        JButton btnTambah = new JButton("Tambah");
        btnTambah.addActionListener(e -> {

    String nomor = JOptionPane.showInputDialog("Nomor Surat");
    String pengirim = JOptionPane.showInputDialog("Pengirim");
    String perihal = JOptionPane.showInputDialog("Perihal");
    String tanggal = JOptionPane.showInputDialog("Tanggal (YYYY-MM-DD)");

    model.addRow(new Object[]{
        model.getRowCount() + 1,
        nomor,
        pengirim,
        perihal,
        tanggal
    });

});
        JButton btnCari = new JButton("Cari");
        btnCari.addActionListener(e -> {

    String cari = JOptionPane.showInputDialog("Cari Pengirim");

    for (int i = 0; i < model.getRowCount(); i++) {

        String pengirim =
            model.getValueAt(i, 2).toString();

        if (pengirim.equalsIgnoreCase(cari)) {

            tabel.setRowSelectionInterval(i, i);

            JOptionPane.showMessageDialog(
                this,
                "Data ditemukan"
            );

            return;
        }
    }

    JOptionPane.showMessageDialog(
        this,
        "Data tidak ditemukan"
    );

});
        JButton btnSorting = new JButton("Sorting");
        JButton btnPDF = new JButton("Export PDF");

        JPanel panelAtas = new JPanel();

        panelAtas.add(btnTambah);
        panelAtas.add(btnCari);
        panelAtas.add(btnSorting);
        panelAtas.add(btnPDF);

        add(panelAtas, BorderLayout.NORTH);
        add(new JScrollPane(tabel), BorderLayout.CENTER);
    }
}