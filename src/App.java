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

     /*  int nr = 10;
       
       if(nr == 2){
       System.out.println("Liczby to 2");
       }else if(nr == 3){
        System.out.println("Liczby to 3");
       }else{
        System.out.println("Jakas inna liczba niz 3 i 2 ");
       }
*/

System.out.println("Wpisz pierwsza liczbe");
int a = scanner.nextInt();
System.out.println("Wpisz druga liczbe");
int b = scanner.nextInt();
System.out.println("Wynik to:");
System.out.println(a+ " + "+b+" = "+(a+b));


        scanner.close();
    }
}
