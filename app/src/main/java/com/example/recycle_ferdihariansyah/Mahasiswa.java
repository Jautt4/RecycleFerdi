package com.example.recycle_ferdihariansyah;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String email;
    private String tanggalLahir;

    public Mahasiswa(String nim, String nama, String email, String tanggalLahir) {
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }
}