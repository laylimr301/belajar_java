
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author NEC
 */
public class tugasBufferReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama = "";
        String status = "";
        String alamat = "";
        int usia;
        double beratbadan;
                
        
        
        //object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        //object bufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        //mengisi variabel nama dengan bufferedReader
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("jomblo opo ora kowe?");
        status = br.readLine();
        
        System.out.println("dimana rumah anda?");
        alamat = br.readLine();
        
        System.out.println("berapa usia anda?");
        usia = Integer.parseInt(br.readLine());
        
        System.out.println("brapa berat badan anda?" );
        beratbadan = Double.parseDouble(br.readLine());
        
        
        
        //menampilkan nama
        System.out.println("Nama Anda Adalah " + nama);
        System.out.println("Anda Ternyata " + status);
        System.out.println("rumah anda berada di " + alamat );
        System.out.println("ternyata hobi anda " + usia );
        System.out.println("ternyata agama anda " + beratbadan);        
                
                
                
                
                
        
    }
    
}

        