import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import dao.EmpleadoDAO;
import dao.EmpleadoDAOHashMap;
import dao.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        System.out.println(" ============== EJEMPLOS DE MAPAS: ==============");
        runMapExamlpe();
        System.out.println();
        System.out.println("=============== EMPLEADO EJEMPLOS ================");
        System.out.println();
        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        System.out.println();
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash=new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoController=new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree=new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoControllerTree=new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1=new Empleado(5,"Pedro","Dev");
        Empleado emp2=new Empleado(3,"Juan","Dev");
        Empleado emp3=new Empleado(1,"Jose","Dev");
        Empleado emp4=new Empleado(2,"Pedro","Dev");
        Empleado emp5=new Empleado(4,"Pedro","Dev");

        empleadoController.addEmpleado(emp1);
        empleadoController.addEmpleado(emp2);
        empleadoController.addEmpleado(emp3);
        empleadoController.addEmpleado(emp4);
        empleadoController.addEmpleado(emp5);

        empleadoControllerTree.addEmpleado(emp1);
        empleadoControllerTree.addEmpleado(emp2);
        empleadoControllerTree.addEmpleado(emp3);
        empleadoControllerTree.addEmpleado(emp4);
        empleadoControllerTree.addEmpleado(emp5);

        empleadoController.listarEmpleados();
        System.out.println();
        System.out.println("====================================================");
        System.out.println();
        empleadoControllerTree.listarEmpleados();





    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
        System.out.println();
        System.out.println("=============================== EJERCICIOS ===============================");
        System.out.println();
        // Ejercicio 1
        System.out.println("----- Ejercicio 1: -----");
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Palabra 1: " + str1);
        System.out.println("Palabra 2: " + str2);
        System.out.println("Son anagramas: " + ejercicios.areAnagrams(str1, str2));

        // Ejercicio 2 
        System.out.println("----- Ejercicio 2: -----");
        int[] nums = { 9, 2, 3, 6 };
        int objetivo = 5;
        System.out.println("Nums: " + "[" + nums[0] + ", " + nums[1] + ", " + nums[2] + ", " + nums[3] + "]");
        System.out.println("Objetivo: " + objetivo);
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println("Resultado: " + "[" + resultado[0] + ", " + resultado[1] + "]");
        }
        // Ejercicio 3
        System.out.println("----- Ejercicio 3: -----");
        String texto = "hola";
        System.out.println("Texto: " + texto);
        ejercicios.contarCaracteres(texto);

        // Ejercicio 4
        System.out.println("----- Ejercicio 4: -----");
        String palabra1 = "roma";
        String palabra2 = "amor";
        System.out.println("Palabra 1: " + palabra1);
        System.out.println("Palabra 2: " + palabra2);
        System.out.println("Son anagramas: " + ejercicios.sonAnagramas(palabra1, palabra2));
        

    }
}
