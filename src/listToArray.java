import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class listToArray
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String algo="";
        ArrayList<String> cosas = new ArrayList<>();

        do
        {
            algo=sc.nextLine();
            if (!algo.isEmpty())
            {
                cosas.add(algo);
            }

        }while (!algo.isEmpty());

        String[] transfor= new String[cosas.size()];
        for (int i = 0; i < cosas.size(); i++)
        {
            transfor[i] = cosas.get(i);
        }

        System.out.println(Arrays.toString(transfor));
    }
}
