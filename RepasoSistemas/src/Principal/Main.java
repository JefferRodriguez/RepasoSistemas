package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

/*
        // LISTAS

        List<Integer> listNumeros = new ArrayList<>();


        System.out.println("Cantidad de elementos en la lista " + listNumeros.size());

     //   System.out.println("EL ELEMENTOS EN LA TERCER POSICION ES: " + listNumeros.get(2));

        Random ale = new Random();

        for (int i = 0; i<=10;i++){

            listNumeros.add(ale.nextInt(50));

        }

        System.out.println("Cantidad de elementos en la lista " + listNumeros.size());

        System.out.println(listNumeros.toString());


        for (Integer num: listNumeros) {

            System.out.println(Math.sqrt(num));

        }

*/

        Profesor p1 = new Profesor(10101010, "Juan", "Torres", "Ingeniero");
        Profesor p2 = new Profesor(20202020, "Carlos", "Gil", "Enfermero");
        Profesor p3 = new Profesor(30303030, "Julian", "Jaramillo", "Arquitecto");
        Profesor p4 = new Profesor(40404040, "Robinson", "Rojas", "Abogado");

        Profesor p5  = new Profesor();

        p5.setCedula(50505050);
        p5.setNombre("Lorena");
        p5.setApellido("Martinez");
        p5.setProfesion("Medico");

        List<Profesor> lisprofe= new ArrayList<>();

        lisprofe.add(p1);
        lisprofe.add(p2);
        lisprofe.add(p3);
        lisprofe.add(p4);
        lisprofe.add(p5);

        System.out.println("EL TAMALO DE LA LISTA ES: " + lisprofe.size());

    //    System.out.println(lisprofe.toString());

        p1.setNombre("Pedro");

        for (Profesor pr: lisprofe) {
            pr.setApellido("CONTRERAS");
            System.out.println(pr);
        }



        Materia ma1 = new Materia(80808080, "Julio", "Lara", "Licenciado", 1, "Matematicas", 3 );

        System.out.println(ma1.toString());






        }






    }







