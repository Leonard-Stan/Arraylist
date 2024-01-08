import java.util.ArrayList;
import java.util.Scanner;

public class Misutilidades {

    public static ArrayList rellenar(ArrayList lista) {
        Scanner sc = new Scanner(System.in);
        String texto;
        do {
            texto = sc.nextLine();
            if (!texto.isEmpty()) {
                lista.add(texto);
            }

        } while (!texto.isEmpty());
        return lista;
    }


    public static ArrayList<Object> agregarElemento() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> lista = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un elemento (o 'fin' para terminar): ");
            String entrada = scanner.nextLine();

            if (!entrada.equalsIgnoreCase("fin")) {
                lista.add(convertirEntrada(entrada));
            } else {
                continuar = false;
            }
        }
        return lista;
    }

    private static Object convertirEntrada(String entrada) {
        // Intenta convertir la entrada a un entero
        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e1) {
            // Si no es un entero, intenta convertir a double
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e2) {
                // Si no es un double, simplemente devuelve la cadena
                return entrada;
            }
        }
    }


    
}
