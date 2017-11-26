/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author daksa
 */
public class Penjualan extends Koneksi
{
    private String vno;
    private String vtanggal;
    private String vnama;
    private String vukuran;
    private int vjumlah;
    private double vharga;
    private double vdiskon;
    private double vjmlbayar;
    
    public Penjualan() throws SQLException
    {
        vno           = "";
        vtanggal      = "";
        vnama         = "";
        vukuran       = "";
        vjumlah       = 0;
        vharga        = 0;
        vdiskon       = 0;
        vjmlbayar     = 0;
        koneksi();
    }
    
    public void setNo(String no)
    {
        vno = no;
        
    }
    
    public String getNo()
    {
        return vno;
    }
    
    public void setTanggal(String tanggal)
    {
        vtanggal = tanggal;
        
    }
    
    public String getTanggal()
    {
        return vtanggal;
    }
    
    public void setNama(String nama)
    {
        vnama = nama;
        
    }
    
    public String getNama()
    {
        return vnama;
    }
    
    public String setUkuran(String ukuran)
    {
        vukuran = ukuran;
        
        return vukuran;
        
    }
    
    public String getUkuran()
    {
        return vukuran;
    }
    
    public int setJumlah(int jumlah)
    {
        vjumlah = jumlah;
        
        return vjumlah;
        
    }
    
    public int getJumlah()
    {
        return vjumlah;
    }
    
    public void setHarga(double harga)
    {
        vharga = harga;
        
    }
    
    public double getHarga()
    {
        return vharga;
    }
    
    public void setDiskon(double diskon)
    {
        vdiskon = diskon;
        
    }
    
    public double getDiskon()
    {
        return vdiskon;
    }
    
    public void setJmlBayar(double bayar)
    {
        vjmlbayar = bayar;
        
    }
    
    public double getJmlBayar()
    {
        return vjmlbayar;
    }
    
    public ResultSet ViewById()
    {
        ResultSet rs;
        String sql;
        sql = "select * from penjualan where no = '" + vno + "' ";
        try
        {
          rs = QuerySql(sql);
        } catch(SQLException ex)
        {
            rs = null;
            Logger.getLogger(Penjualan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet ViewByAll() throws SQLException
    {
        ResultSet rs;
        String sql;
        sql = "select * from penjualan ";
        rs = QuerySql(sql);
        return rs;
    }
    
    public boolean Insert() throws SQLException
    {
        boolean h = false;
        String sql;
        sql = "insert into penjualan(no, tanggal, nama, ukuran, jumlah, harga, diskon, jumlahbayar)";
        sql +=" values('" + vno +"','" + vtanggal + "','" + vnama + "','" + vukuran + "','" + vjumlah + "','" + vharga + "','" + vdiskon  + "', " + vjmlbayar + ")";
        h = Executesql(sql);
        return h;
    }
    
    public boolean Update() throws SQLException
    {
        boolean h = false;
        String sql;
        sql = "update penjualan set tanggal = '" + vtanggal + "', nama ='" + vnama + "', ukuran = '"
                + vukuran + "', jumlah = '"+ vjumlah + "', harga ='" + vharga + "', diskon = '"
                + vdiskon +  "', jumlahbayar ='" + vjmlbayar + "'";
        sql += " where no = '" + vno + "' ";
        h = Executesql(sql);
        
        return h;
        
    }
    
    public boolean Delete () throws SQLException
    {
        boolean h = false;
        String sql;
        sql = "delete from penjualan ";
        sql += " where no = '" + vno + "' ";
        h = Executesql(sql);
        return h;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
}
