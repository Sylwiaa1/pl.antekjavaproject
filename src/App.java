import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /* 
        to jest wpisywanie imienia i wyswietlanie go
        System.out.println("Podaj swoje imię");
         Scanner scanner = new Scanner(System.in);
         String firstName = scanner.nextLine();
         System.out.println("Twoje imię to "+firstName);
         scanner.close();
        */ 
        
      /* 
       kalkulator 2 liczb
       System.out.println("podaj pierwsza liczbę");
        int a = scanner.nextInt();
        System.out.println("podaj druga liczbę");
        int b = scanner.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
        scanner.close();
        */

       int nr = 2;
       
       if(nr == 2){
       System.out.println("Liczby są równe");
       }else if(nr == 3){
        System.out.println("Liczby to 3");
       }else{
        System.out.println("Liczby nie są równe ");
       }

        scanner.close();
    }
}
