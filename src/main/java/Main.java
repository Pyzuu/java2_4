import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wybierz: ");
    System.out.print("1-suma");
    System.out.print("2-roznica ");
    System.out.print("3-iloczyn ");
    System.out.print("4-iloraz ");
    
    int wybor = scanner.nextInt();
    System.out.print("Pierwsza liczba: ");
    double a = scanner.nextDouble();
    System.out.print("Druga liczba: ");
    double b = scanner.nextInt();

    switch (wybor) {
        case 1:
            System.out.println("suma" + (a+b));
            break;

        case 2:
            System.out.println("roznica" + (a-b));
            break;

        case 3:
            System.out.println("iloczyn" + (a*b));
            break;

        case 4:
        if(b != 0){
          System.out.println("iloraz"+(a/b));
        }else{
          System.out.println("blad");
        }
        break;
      default:
            System.out.println("Nieprawidłowy wybór");
    }
    
    scanner.close();
  }
  
}
