package com.example.a1_prak6_130220043;

import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class Mahasiswa {
    private String stb;
    private String nama;
    private int angkatan;
     private JSONObject jsonObject;
     private Mahasiswa mhs;

    public Mahasiswa(String stb, String nama, int angkatan) {
        this.stb = stb;
        this.nama = nama;
        this.angkatan = angkatan;
    }

    public String getStb() {
        return stb;
    }

    public void setStb(String stb) {
        this.stb = stb;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }
    public JSONObject toJSON() throws JSONException {
        jsonObject = new JSONObject();
        jsonObject.put("stb", stb);
        jsonObject.put("nama", nama);
        jsonObject.put("angkatan", angkatan);
        return jsonObject;
    }
}
