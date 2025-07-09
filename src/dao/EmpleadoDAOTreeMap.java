package dao;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Empleado, Empleado> empleados;
    
    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
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
