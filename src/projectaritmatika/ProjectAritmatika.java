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
public class ProjectAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        aritmatika testAritmatika = new aritmatika(); 
        testAritmatika.tambah(12, 19); 
        System.out.println("Penjumlahan : " + testAritmatika.getHasil());
        testAritmatika.kurang(12, 19); 
        System.out.println("Kurang : " + testAritmatika.getHasil());
        testAritmatika.kali(12, 19); 
        System.out.println("Kali : " + testAritmatika.getHasil());
        testAritmatika.bagi(12, 19);
        System.out.println("Bagi : " + testAritmatika.getHasil());
    }
    
}
