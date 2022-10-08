
import java.util.Scanner;


public class PatikaDevHava {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Hava Sıcaklık Derecesini Giriniz :");
        int sicaklik=scan.nextInt();
        
        if(sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz.İyi Eğlenceler");
        }
        else if(sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya Gidebilirsiniz. İyi Eğlenceler.");
        }
        else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Piknik Yapabilirsiniz. İyi Eğlenceler.");
        }
        else if(sicaklik>25){
            System.out.println("Yüzmeye Gidebilirsiniz. İyi Eğlenceler ");
        }
        else {
            System.out.println("Hava Çok Sıcak Gölgeden Ayrılmayın...");
        
        }
    
    
    }   
}
