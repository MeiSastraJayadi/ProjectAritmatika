/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaritmatika;

/**
 *
 * @author PC-A-30
 */
public class aritmatika {
    private double hasil; 
    
    public void tambah(double bil1, double bil2){
        this.hasil = bil1 + bil2; 
    }
    
    public void kurang(double bil1, double bil2) {
        this.hasil = bil1 - bil2; 
    }
    
    public void kali(double bil1, double bil2) {
        this.hasil = bil1 * bil2; 
    }
    
    public void bagi(double bil1, double bil2) {
        
        this.hasil = bil1 / bil2; 
    }
    
    public double getHasil() {
        return this.hasil; 
    }
    
}
