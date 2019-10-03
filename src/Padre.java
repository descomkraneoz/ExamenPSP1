import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Padre {
    public static void main(String[] args) {
        try{
            String comando="java -jar ./out/artifacts/Pruebas_jar/miJar.jar";
            Process p=Runtime.getRuntime().exec(comando);
            PrintWriter escriboAlHijo=new PrintWriter(p.getOutputStream());

            Scanner sc=new Scanner(System.in);
            System.out.println("Dime algo");
            String linea=sc.nextLine();

            escriboAlHijo.println(linea);
            escriboAlHijo.flush();

            BufferedReader leoDelHijo=new BufferedReader(new InputStreamReader(p.getInputStream()));

            String padre=leoDelHijo.readLine();
            while (padre!=null){
                System.out.println("El hijo dice que has dicho: "+padre);
                padre=leoDelHijo.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
