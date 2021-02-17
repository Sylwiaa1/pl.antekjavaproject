import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
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
/*System.out.println("Wpisz pierwsza liczbe");
int a = scanner.nextInt();


System.out.println("Podaj operato + lub -");
scanner.nextLine();
String o = scanner.nextLine();

System.out.println("Wpisz druga liczbe");
int b = scanner.nextInt();

System.out.println("Wynik to:");

if(o.equals("+") ){
    System.out.println(a+" + "+b+" = "+(a+b));
}else if(o.equals("-") ){
    System.out.println(a+" + "+b+" = "+(a-b));
}else{
    System.out.println("zly operator");
}
*/
/*
String o = "*";
switch(o){
    case "+":
    System.out.println("PLUS");
    break;
    case "-":
    System.out.println("MINUS");
    break;
    case "*":
    System.out.println("RAZY");
    break;
    default:
    System.out.println("CO INNEGO");
}*/

Scanner scanner = new Scanner(System.in);

System.out.println("Podaj pierwsza liczbe");
int a = scanner.nextInt();

System.out.println("podaj operator + , - , * , /, %");
scanner.nextLine();
String o = scanner.nextLine();

System.out.println("Podaj druga liczbe");
int b = scanner.nextInt();

switch (o) {
   case "+":
   System.out.println(a+" + "+b+" = "+(a+b));
   break;

   case "-":
   System.out.println(a+" - "+b+" = "+(a-b));
   break;

   case "*":
   System.out.println(a+" * "+b+" = "+(a*b));
   break;

   case "/":
   System.out.println(a+" / "+b+" = "+(a/b));
   break;

   case "%":
   System.out.println(a+" % "+b+" = "+(a%b));
   break;

   default:
   System.out.println(" nie ma takiego operatora");
   break;
}


        scanner.close();
    }
}
