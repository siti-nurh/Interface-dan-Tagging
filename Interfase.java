/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfase;

/**
 *
 * @author siti
 */

/*kelas abstract bebas menentukan method abstract jika ada di interface*/
public interface Interfase {
    public String nama = "Anggrek";
    public String warna = "Ungu";
    abstract void printNama();
    abstract void printWarna();  
    }
    
    /*Interface kelas tidak bisa di instansiasi*/
    public interface Tanaman {
        Tanaman tam = new Tanaman();
   
   }
    

    /*variabel static di imlementasi dalam program utama*/
    public class impl implements Interfase {
        public static void main (String[] args) {
            impl kl = new impl();
            kl.nama();
            kl.warna();
        }
        }
    /*interface dapat meng extends lebih dari satu interface*/
        public class Anggrek extends Tanaman {
            Anggrek(String nama){
            this.nama=nama;
            }
        }
        public class Melati extends Tanaman {
            Melati(String nama) {
            this.nama=nama;
            }
        }
    /* interface tidak dapat mengimplement interface lain*/
        public interface Tanaman implements Anggrek {

}


       

    
    
