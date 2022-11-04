package praktikum4;

import java.io.DataInputStream;

public class nomor2_class_objek {

    
    public static void main(String[] args) {
        DataInputStream  input=new DataInputStream(System.in);
        
        //objek 
        mahasiswa mhs1 = new mahasiswa("Junswhandy",212033,"Teknik");
         System.out.println("Nama : "+mhs1.nama);
         System.out.println("Nim : "+mhs1.nim);
         System.out.println("Jurusan : "+mhs1.jurusan);
    }
    
}
class mahasiswa{
    String nama,jurusan;
    int nim;
    mahasiswa(String nama,int nim,String jurusan){
          this.nama = nama;
           this.nim=nim;
           this.jurusan=jurusan;
    }
    
  
    
}
