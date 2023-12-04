import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAltura
{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int alumnos = numeroAlumnos(sc);
        ArrayList<Integer> alturas = new ArrayList<>();
        leerAltura(alumnos, alturas);
        System.out.println(mostrarResultado(alturas));

    }

        public static int numeroAlumnos(Scanner scanner)
        {
            int alumnos= scanner.nextInt();
            return alumnos;
        }

        public static ArrayList leerAltura(int alu, ArrayList alumnos)
        {
            System.out.println("Introduce alturas en centímetros: ");
            Scanner sc=new Scanner(System.in);
            for (int i = 0; i < alu; i++)
            {
                alumnos.add(sc.nextInt());
            }

            return alumnos;
        }

        public static double calcularMedia (ArrayList alturas)
        {
            double media =0;

            for (int i = 0; i < alturas.size() ; i++)
            {
                media += (int) alturas.get(i);
            }
            media= media/alturas.size();

            return media;
        }

    public static int calcularAlturaSuperior (ArrayList alumnos)
    {
        int altos=0;

        for (int i = 0; i < alumnos.size(); i++)
        {
            if ((int) alumnos.get(i)>calcularMedia(alumnos))
            {
                altos++;
            }
        }
        return altos;
    }

    public static int calcularAlturaInferior (ArrayList alumnos)
    {
        int bajos=0;

        for (int i = 0; i < alumnos.size(); i++)
        {
            if ((int) alumnos.get(i)<calcularMedia(alumnos))
            {
                bajos++;
            }
        }
        return bajos;
    }

    public static String mostrarResultado (ArrayList alumnos)
    {

        String res="Las alturas de los alumnos son: "+alumnos.toString()+" "+"la media de altura es: "+calcularMedia(alumnos)+" "+"hay "+calcularAlturaSuperior(alumnos)+" por encima de la media y "+calcularAlturaInferior(alumnos)+" por debajo de la media";
        return res;
    }


}
