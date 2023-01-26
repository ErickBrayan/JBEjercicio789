import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //reverse("Hola Mundo");
        
        int[][] arrayBidimencinal = {
                {12,13,14},
                {13,14,15}
        };
        //recorrerArrayBidimencinal(arrayBidimencinal);

        Vector<String> nombres = new Vector<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Pablo");
        nombres.add("Raul");
        nombres.add("Susan");
        //removerElementosVector(nombres);
        
        /*
        * El problema de ultilzar un vector por defecto de es que 
        * que al ser muchos elementos el vector tendria que crecer
        * por ende haria copia tras copia del array anterior, y sabemos
        * que la memoria no infinita traeria problemas de eficiencia del software.
        * */


        //copiaElementosArryListLinkedList();

        //llenandoArrarList();

        //dividePorCero(4,0);

        //copiar("C:/Recursos Desarrollo/comandosGit.txt","C:/Recursos Desarrollo/copia.txt");

        leeArchivoEliminaEspacios();
    }

    private static void reverse(String texto){
        StringBuilder res = new StringBuilder();
        for (int i = texto.length() -1 ; i >= 0; i--) {
            res.append(texto.charAt(i));
        }
        System.out.println(res);
    }
    private static void recorrerArrayBidimencinal(int [][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void removerElementosVector(List<String> lista) {
        lista.remove(1);
        lista.remove(1);

        for (String nombre :
                lista) {
            System.out.println("nombre = " + nombre);
        }
    }
    private static void copiaElementosArryListLinkedList(){
        ArrayList<String> elementosArrayList = new ArrayList<>();
        elementosArrayList.add("auto");
        elementosArrayList.add("Bus");
        elementosArrayList.add("Camioneta");
        elementosArrayList.add("Moto");


        LinkedList<String> elementosLinkedList = new LinkedList<>(elementosArrayList);

        for (String elemento :
                elementosLinkedList) {
            System.out.println("elemento = " + elemento);
        }
    }
    private static void llenandoArrarList(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 1; i <= 10 ; i++){
            if(i % 2 != 0){
                arrayList.add(i);
            }            
        }
        for (int elemento:
             arrayList) {
            System.out.println("elemento = " + elemento);
        }
        
    }
    private static void dividePorCero(int num1,int num2) throws ArithmeticException{
        try {
            int resultado = num1 / num2;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse " + e.getMessage());
            throw new ArithmeticException();
        }
    }
    private static void copiar(String fileIn,String fileOut){
        try {
            InputStream inicio = new FileInputStream(fileIn);
            try {
                PrintStream destino = new PrintStream(fileOut);
                byte[] file = inicio.readAllBytes();
                destino.write(file);
                destino.close();
            }catch (IOException e){
                System.out.println("e = " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("e = " + e.getMessage());
        }


    }

    private static void leeArchivoEliminaEspacios(){

        try {
            InputStream inicio = new FileInputStream("C:/Recursos Desarrollo/comandosGit.txt");
            ArrayList<Character> arrayList = new ArrayList<>();
            try {
                
                byte[] file = inicio.readAllBytes();
                for (byte f:file) {
                    arrayList.add((char) f);
                }

                for (char c:
                     arrayList) {
                    if(c != 32) {
                        System.out.print(c);
                    }
                }


            }catch (IOException e){
                System.out.println("e = " + e.getMessage());
            }
        }catch (FileNotFoundException e){
            System.out.println("e = " + e.getMessage());
        }

    }






}