package com.example.si_nau;

public class Kelas {
    private String nama;
    private String detail;
    private int photo;

    public Kelas(String nama, String detail, int photo) {
        this.nama = nama;
        this.detail = detail;
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public String getDetail() {
        return detail;
    }

    public int getPhoto() {
        return photo;
    }
}
