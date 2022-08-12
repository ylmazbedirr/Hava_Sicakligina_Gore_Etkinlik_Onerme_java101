import java.util.Scanner;
    public class F_Hava_Sicakligina_Gore_Etkinlik_Onerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz:");
        heat = input.nextInt();

        if(heat < 5){
            System.out.print("Kayak Yapabilirsiniz.");
        } else if(heat <=25){

             if(heat <= 15){
                 System.out.println("Sinemaya Gidebilirsiniz.");
             }if(heat >= 10){
                 System.out.print("Piknige Gidebilirsiniz.");
             }

             }else{
            System.out.print("Yuzmeye Gidebilirsiniz.");
        }
    }
}
