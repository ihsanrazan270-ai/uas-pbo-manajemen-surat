package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
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
                "Pengirim/Tujuan",
                "Perihal",
                "Tanggal"
        };

        DefaultTableModel model = new DefaultTableModel(kolom, 0);

        // Surat Masuk
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

        // Surat Keluar
        model.addRow(new Object[]{
                3,
                "SK001",
                "Fakultas Teknik",
                "Surat Balasan",
                "2026-06-15"
        });

        model.addRow(new Object[]{
                4,
                "SK002",
                "BEM Universitas",
                "Pemberitahuan Kegiatan",
                "2026-06-18"
        });

        JTable tabel = new JTable(model);

        JButton btnTambah = new JButton("Tambah");
        JButton btnCari = new JButton("Cari");
        JButton btnEdit = new JButton("Edit");
        JButton btnHapus = new JButton("Hapus");
        JButton btnSorting = new JButton("Sorting");
        JButton btnPDF = new JButton("Export PDF");

        // Tambah
        btnTambah.addActionListener(e -> {

            String nomor = JOptionPane.showInputDialog(
                    this,
                    "Nomor Surat");

            String pengirim = JOptionPane.showInputDialog(
                    this,
                    "Pengirim / Tujuan");

            String perihal = JOptionPane.showInputDialog(
                    this,
                    "Perihal");

            String tanggal = JOptionPane.showInputDialog(
                    this,
                    "Tanggal (YYYY-MM-DD)");

            model.addRow(new Object[]{
                    model.getRowCount() + 1,
                    nomor,
                    pengirim,
                    perihal,
                    tanggal
            });

        });

        // Cari
        btnCari.addActionListener(e -> {

            String cari = JOptionPane.showInputDialog(
                    this,
                    "Cari Pengirim / Tujuan");

            for (int i = 0; i < model.getRowCount(); i++) {

                String data =
                        model.getValueAt(i, 2).toString();

                if (data.equalsIgnoreCase(cari)) {

                    tabel.setRowSelectionInterval(i, i);

                    JOptionPane.showMessageDialog(
                            this,
                            "Data ditemukan");

                    return;
                }
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Data tidak ditemukan");

        });

        // Edit
        btnEdit.addActionListener(e -> {

            int baris = tabel.getSelectedRow();

            if (baris != -1) {

                String nomor = JOptionPane.showInputDialog(
                        this,
                        "Nomor Surat Baru",
                        model.getValueAt(baris, 1));

                String pengirim = JOptionPane.showInputDialog(
                        this,
                        "Pengirim/Tujuan Baru",
                        model.getValueAt(baris, 2));

                String perihal = JOptionPane.showInputDialog(
                        this,
                        "Perihal Baru",
                        model.getValueAt(baris, 3));

                String tanggal = JOptionPane.showInputDialog(
                        this,
                        "Tanggal Baru",
                        model.getValueAt(baris, 4));

                model.setValueAt(nomor, baris, 1);
                model.setValueAt(pengirim, baris, 2);
                model.setValueAt(perihal, baris, 3);
                model.setValueAt(tanggal, baris, 4);

                JOptionPane.showMessageDialog(
                        this,
                        "Data berhasil diubah!");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Pilih data yang ingin diedit!");

            }

        });

        // Hapus
        btnHapus.addActionListener(e -> {

            int baris = tabel.getSelectedRow();

            if (baris != -1) {

                model.removeRow(baris);

                JOptionPane.showMessageDialog(
                        this,
                        "Data berhasil dihapus!");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Pilih data yang ingin dihapus!");

            }

        });

        // Sorting
        btnSorting.addActionListener(e -> {

            TableRowSorter<DefaultTableModel> sorter =
                    new TableRowSorter<>(model);

            tabel.setRowSorter(sorter);

            sorter.toggleSortOrder(4);

        });

        // Export PDF
        btnPDF.addActionListener(e -> {

            PdfExporter.exportPDF();

            JOptionPane.showMessageDialog(
                    this,
                    "PDF berhasil dibuat!");

        });

        JPanel panelAtas = new JPanel();

        panelAtas.add(btnTambah);
        panelAtas.add(btnCari);
        panelAtas.add(btnEdit);
        panelAtas.add(btnHapus);
        panelAtas.add(btnSorting);
        panelAtas.add(btnPDF);

        add(panelAtas, BorderLayout.NORTH);
        add(new JScrollPane(tabel), BorderLayout.CENTER);

        setVisible(true);
    }
}