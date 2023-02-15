import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
       topla();


}
public static void topla(){
    Scanner sc = new Scanner(System.in);

    try {


        System.out.print("sayi gir :");
        int x = sc.nextInt();
        System.out.print("sayi gir :");
        int y = sc.nextInt();

        double z = x / y;
        System.out.println("result = " + z);
    } catch (ArithmeticException e) {
        System.out.println("bir sayı sıfıra bolunmez kardeşş");
    } catch (InputMismatchException e) {
        System.out.println("rakam gir kardeşim");
    }catch (Exception e){
        System.out.println("Bazen hata olur");

    }
    finally {
       sc.close();
    }
}
}

