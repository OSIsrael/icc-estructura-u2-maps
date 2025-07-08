package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap() {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru", "Lima");
        capitales.put("Colombia", "Bogota");
        System.out.println(capitales.keySet());
        System.out.println("MAPA DE CAPITALES");
        for (String pais : capitales.keySet()) {
            System.out.println("PAIS: " + pais + " CAPITAL: " + capitales.get(pais));
        }

        // Ejemplo acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("Capital de Ecuador: " + capital);

        Map<Integer,Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Disenador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));
        
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
        }

        Map<Empleado,Integer> empleados2 = new HashMap<>();
        Empleado emp1=new Empleado(1, "Ana", "Dev");
        Empleado emp2=new Empleado(2, "Pedro", "Dev");
        Empleado emp3=new Empleado(3, "Ana", "Dev");
        Empleado emp4=new Empleado(3, "Ana", "Dev");

        empleados2.put(emp1, 1000);
        empleados2.put(emp2, 1200);
        empleados2.put(emp3, 1500);
        empleados2.put(emp4, 2000);


        for (Map.Entry<Empleado, Integer> entry:empleados2.entrySet()) {
            System.out.println(entry.getKey()+" ==> "+entry.getValue());
        }





    }

    public void ejemploConLinkedHashMap() {
        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Carro", 20000);
        productos.put("Moto", 1200);
        productos.put("LLantas", 40);
        productos.put("Rines", 200);
        productos.put("Gasolina", 10);
        productos.put("Aceite", 20);
        System.out.println();
        System.out.println("-------------------");
        System.out.println(productos.keySet());
        System.out.println("MAPA DE PRODUCTOS");
        for (String producto : productos.keySet()) {
            System.out.println("PRODUCTO: " + producto + " PRECIO: " + productos.get(producto));
        }

        // Ejemplo acceso directo
        int precio = productos.get("Carro");
        System.out.println("Precio del carro: " + precio);

    }

    public void ejemploConTreeMap() {
        Map<Integer, String> personas = new TreeMap<>();
        personas.put(1, "Mateo");
        personas.put(2, "Israel");
        personas.put(3, "Einar");
        personas.put(4, "Fernando");
        System.out.println(personas.keySet());
        System.out.println("MAPA DE PERSONAS");
        for (Integer persona : personas.keySet()) {
            System.out.println("PERSONA: " + persona + " NOMBRE: " + personas.get(persona));
        }

        // Ejemplo acceso directo
        String nombre = personas.get(1);
        System.out.println("Nombre de la persona 1: " + nombre);

        Map<Empleado,Integer> empleados2 = new TreeMap<>();
        Empleado emp1=new Empleado(1, "Ana", "Dev");
        Empleado emp2=new Empleado(2, "Pedro", "Dev");
        Empleado emp3=new Empleado(3, "Ana", "Dev");
        Empleado emp4=new Empleado(3, "Ana", "Dev");

        empleados2.put(emp1, 1000);
        empleados2.put(emp2, 1200);
        empleados2.put(emp3, 1500);
        empleados2.put(emp4, 2000);


        for (Map.Entry<Empleado, Integer> entry:empleados2.entrySet()) {
            System.out.println(entry.getKey()+" ==> "+entry.getValue());
        }
    }
}
