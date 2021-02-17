import java.util.Scanner;

import org.graalvm.compiler.nodes.java.DynamicNewArrayNode;

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
    /* switch
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
*/
    /* tablice
 String[][] students = {
     //  0      1         2   w takiej kolejnosci idą 
     { "Jaś", "Staś", "Małgosia"},  // <-- 0
     { "Mikołaj", "Jan", "Magda"}   // <--- 1
 };
 System.out.println( students[0][1] );
*/
    /*  for petla 
     String[] licz = {"zero", "jeden", "dwa", "trzy"};
     
     for(String l : licz)
     {
     //System.out.println("0:"+1);
       
     }

     for(int i = 0; i < licz.length; i++)
     {
       System.out.println(i+": "+licz[i]);

     }*/
     
    
        String[][] dane = 
    {
        {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
        {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
    };
        int wynik = 0;
    for(int i = 0; i < dane.length; i++)
    {
        System.out.println(dane[i][0]); 
        String odpowiedz = scanner.nextLine(); 
        boolean isAnswerCorrect = false;
        
    for(int n = 1; n < dane[i].length; n++){
         
    if(dane[i][n].equals(odpowiedz))
    {
        isAnswerCorrect = true;
        System.out.println( "brzdek" );
         wynik += n*10;   
    }
    }
    if(!isAnswerCorrect)
    {
        System.out.println("x");
        
    }
      }      
      System.out.println("Twoj wynik to "+wynik);
      scanner.close();
    }
  }
