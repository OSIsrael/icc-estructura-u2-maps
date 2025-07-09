package dao;

import models.Empleado;

public interface EmpleadoDAO {
    void add(Empleado empleado);
    void eliminar(int codigo);
    void listar();
    
}
