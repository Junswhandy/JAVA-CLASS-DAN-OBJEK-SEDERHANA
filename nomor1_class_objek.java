
package praktikum4;
import java.io.*;
import java.io.IOException;

public class nomor1_class_objek {
    public static void main(String[] args) {
        try{
        DataInputStream  input=new DataInputStream(System.in);
        
        //objek
        hewan hewan1 = new hewan  ("Banteng","Merah");
        
        //menampilkan
        System.out.println("Hewan Pertama : "+ hewan1.nama);
        System.out.println("jenis Hewan : "+hewan1.jenis);
        }catch(NumberFormatException e){ 
            System.out.print("EROR BRO: "+e.toString());
        }
    }  
}
//class
class hewan{
    String nama,jenis;
    hewan(String nama, String jenis){
        this.nama=nama;
        this.jenis=jenis;
    }   
}
