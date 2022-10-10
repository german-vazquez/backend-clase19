package mesas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //preparar nuestra colección de caninos
        List<Canino> canes = new ArrayList<>();
        canes.add(new Canino("carmela", 2));
        canes.add(new Canino("juanito", 6));
        canes.add(new Canino("ayudante de santa", 8));
        canes.add(new Canino("coda", 3));
        canes.add(new Canino("pachala", 12));

        // guardar la colección de un archivo

        //instanciamos un objeto ObjectOutputStream cuyo parametro es un FileOutputStream con el nombre del archivo de salido. Luego indicamos que escriba el objeto canes.
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OutFile.txt"));
            oos.writeObject(canes);
            oos.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        // vamos a recuperar la coleccion del archivo en una nueva colección.

        //para distinguir de la lista original creamos una nueva lista. instanciamos un objeto ObjectInputStream cuyo parametro es un FileInputStream con el nombre del archivo de entrada. Luego indicamos que lea el objeto canes2 casteandolo como una ArrayList para que tenga la configuración original.

        List<Canino> canes2=null;
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("OutFile.txt"));
            canes2=(ArrayList)ois.readObject();
            ois.close();

        }catch (Exception exception){
            exception.printStackTrace();
        }

        //mostrando la información recuperada
        for (Canino canino: canes2) {
            System.out.println(canino.toString());
        }
    }
}
