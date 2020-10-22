package com.example.baitaptuan9;

public class Music {
    private String tenbh;
    private String mota;
    private int hinh;

    public Music(String mota, String tenbh, int hinh) {
        this.mota = mota;
        this.tenbh = tenbh;
        this.hinh = hinh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getTenbh() {
        return tenbh;
    }

    public void setTenbh(String tenbh) {
        this.tenbh = tenbh;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
