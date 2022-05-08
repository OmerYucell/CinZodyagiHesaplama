import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogumTarihi,kalan;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum Tarihinizi Giriniz :");
        dogumTarihi =inp.nextInt();

        kalan = dogumTarihi%12;



        if (kalan == 0){
            System.out.print("Maymun");
        }if (kalan == 1){
            System.out.print("Horoz");
        }if (kalan == 2){
            System.out.print("Köpek");
        }if (kalan == 3){
            System.out.print("Domuz");
        }if (kalan == 4){
            System.out.print("Fare");
        }if (kalan == 5){
            System.out.print("Öküz");
        }if (kalan == 6){
            System.out.print("Kaplan");
        }if (kalan == 7){
            System.out.print("Tavşan");
        }if (kalan == 8){
            System.out.print("Ejderha");
        }if (kalan == 9){
            System.out.print("Yılan");
        }if (kalan == 10){
            System.out.print("At");
        }if (kalan == 11){
            System.out.print("Koyun");
        }
    }
}
