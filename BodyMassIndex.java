import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {

        double weight,height;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz : ");
        height = input.nextDouble();
        double result = weight/(height * height);

        System.out.println(result);

        if (result > 18.5) {                 //18.5 ve altı değer sonucu

            System.out.println("Zayıfsınız, sağlıklı bir şekilde kilo almalısınız.");
        }
        else if (result>18.5 && result<24.9) { //18.5 ve 24.9 arası değer sonucu

            System.out.println("Kilonuz normal, düzenli egzersiz ve doğru beslenme ile kilonuzu korumalısınız.");
        }
        else if (result>25 && result<29.9) {   //25 ve 29.9 arası değer sonucu

            System.out.println("Fazla kilolusunuz, diyetiysen eşliğinde kilo vermelisiniz");
        }
        else if (result>30) {               //30 ve üzeri değer sonucu

            System.out.println("Kilonuz Obazite seviyesinde yüksek diyetiysene danışınız.");
        }

    }

   }
