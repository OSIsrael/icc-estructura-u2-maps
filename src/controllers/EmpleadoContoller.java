package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller  {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void addEmpleado(Empleado empleado) {
        empleadoDAO.add(empleado);
    }

    public void eliminarEmpleado(int codigo) {
        empleadoDAO.eliminar(codigo);
    }

    public void listarEmpleados() {
        empleadoDAO.listar();
    }

}
