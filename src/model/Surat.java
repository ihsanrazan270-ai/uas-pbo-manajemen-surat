package model;

public class Surat {
    protected String nomor;
    protected String tanggal;
    protected String perihal;

    public Surat(String nomor, String tanggal, String perihal) {
        this.nomor = nomor;
        this.tanggal = tanggal;
        this.perihal = perihal;
    }

    public String getNomor() {
        return nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getPerihal() {
        return perihal;
    }
}