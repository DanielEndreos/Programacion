package ejercicios.Extra.EjercicioBrunoPublica;

public class Main {

    public static void main(String[] args) {
        /*
        Crea un programa que lea 4 IPv4s, y muestre por la salida una nueva IPv4,
        que sea así: octeto1_ip1.octeto1_ip2.octeto1_ip3.octeto1_ip4Ejemplo. Para la siguiente entrada:
        127.0.0.1
        155.54.0.2
        172.16.32.32
        80.0.0.0
        La salida debe ser:127.155.172.80
         */

        String[] listaIPS ={"127.0.0.1","155.54.0.2", "172.16.32.32", "80.0.0.0"};
        String newIP = "";

        for (int i = 0; i < 4; i++) {
            String[] nova = listaIPS[i].split("\\.");
            newIP+=nova[0];
            if (i < 3) {
                newIP+=".";
            }
        }
        System.out.println(newIP);
    }
}
