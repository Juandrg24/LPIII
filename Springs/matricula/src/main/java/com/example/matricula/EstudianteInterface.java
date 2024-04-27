package com.example.matricula;

import java.util.List;

public interface EstudianteInterface {

	public void guardar(Estudiante estudiante);
	public List<Estudiante> listado();
	public Estudiante consultar(Integer id);
	public void eliminar(Integer id);

}
