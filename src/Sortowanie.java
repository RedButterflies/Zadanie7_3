/*Napisz program pobierający od użytkownika liczby całkowite dopóki wartość
bezwzględna z ich sumy lub iloczynu nie przekroczy odpowiednio 250 lub 3000000. Po
zakończeniu pobierania wprowadzone liczby mają zostać posortowane od największej do
najmniejszej i wyświetlone.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortowanie {
    public void sortuje()
    {
        ArrayList<Integer>lista = new ArrayList<>();
        int liczbaV;
        int suma=0;
        int iloczyn=1;

        do {
            System.out.println("Wprowadz liczbe calkowita: ");
            Scanner liczba= new Scanner(System.in);
            liczbaV= liczba.nextInt();
            lista.add(liczbaV);
            suma+=liczbaV;
            iloczyn*=liczbaV;
            if(Math.abs(suma)==250 || Math.abs(iloczyn)==3000000)break;
        }while(true);
        lista.sort(Collections.reverseOrder());
        System.out.println("Pisortowana lista: ");
        System.out.println(lista);


    }
}
