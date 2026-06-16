package model;

public class SuratKeluar {

    private String nomorSurat;
    private String tujuan;
    private String perihal;
    private String tanggal;

    public SuratKeluar(String nomorSurat, String tujuan,
                       String perihal, String tanggal) {

        this.nomorSurat = nomorSurat;
        this.tujuan = tujuan;
        this.perihal = perihal;
        this.tanggal = tanggal;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getPerihal() {
        return perihal;
    }

    public String getTanggal() {
        return tanggal;
    }
}