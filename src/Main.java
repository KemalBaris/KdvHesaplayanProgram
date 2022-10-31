import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        double tutar,kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : " );
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("Kdv'li Tutar : " + kdvliTutar);


    }
}