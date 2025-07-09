package dao;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;

    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }


    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void eliminar(int codigo) {
        Empleado temp= new Empleado(codigo);
        empleados.remove(temp);
    }

    @Override
    public void listar() {

        for (Map.Entry<Empleado, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " Valor: " + entry.getValue());
        }
       
    }

   
}
