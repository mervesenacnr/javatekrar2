
import java.util.Scanner;

public class Tekrar2 {

    public static void main(String[] args) {
        
        
        System.out.println("Java ile sayıların ortalamasını alıyorum.");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İlk sayıyı giriniz: ");
        double a = scanner.nextDouble();
        System.out.println("Sonraki sayıyı giriniz: ");
        double b = scanner.nextDouble();
        
        double ortalama = (a + b) / 2;
        System.out.println("Sayıların ortalaması: " + ortalama);
         
        //bu projeyi geliştirme fikri: ortalaması alınacak sayıların sınırsız 
        //olduğunu var sayalım.
       
    }
    
}
