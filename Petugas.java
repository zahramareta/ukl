/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.laundry;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> jabatan = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Suga");
        this.alamat.add("Bogor");
        this.telepon.add("082*********");
        this.jabatan.add("Owner");
        
        this.namaPetugas.add("Namjoon");
        this.alamat.add("Bekasi");
        this.telepon.add("089*********");
        this.jabatan.add("Karyawan");
        
    }
    
    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public void setJabatan(String jabatan){
        this.jabatan.add(jabatan);
    }
    
    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    @Override
    public String getJabatan(int id){
        return this.jabatan.get(id);
    }
   
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Jabatan = "+getJabatan(i));
        }
    }
}
