import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hijo {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String linea;
        try{
            linea=br.readLine();
            System.out.println("Ha dicho: "+linea);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
