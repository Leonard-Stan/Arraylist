import java.util.ArrayList;
import java.util.Scanner;

public class existe
{
    static Scanner sc = new Scanner(System.in);
    public static boolean existe(ArrayList cosas) {
        System.out.println("contiene?");
        for (int i = 0; i < cosas.size(); i++) {
            if (cosas.get(i).equals(sc.next())) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args   ) {
       ArrayList<String> unArray = new ArrayList<>();
       Misutilidades.rellenar(unArray);
        System.out.println(existe(unArray));
    }
}
