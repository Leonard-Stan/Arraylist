import java.util.*;

public class AñadirCoches
{
    public static void main(String[] args)
    {
        ArrayList<String> coches = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String coche="";
        do
        {
            coche=sc.nextLine();
            if (!coche.isEmpty())
            {
                coches.add(coche);
            }

        }while (!coche.isEmpty());

        Collections.sort(coches);
     for (String p :coches)
     {
         System.out.println(p);

     }
        System.out.println(coches.toString());
    }
}
