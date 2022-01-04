import java.io.FileReader;
import java.io.IOException;

public class NewClass {
    public static void main(String[] args) {
        try (FileReader hieudoc = new FileReader("C:/Users/HieuPham/Desktop/hieungu.txt")) {
            int hiu = hieudoc.read();
            while (hiu != -1){
                System.out.println((char)hiu);
                hiu = hieudoc.read();
            }
            hieudoc.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
        
    }