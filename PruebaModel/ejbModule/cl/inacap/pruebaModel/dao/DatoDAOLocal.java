package cl.inacap.pruebaModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.pruebaModel.dto.Datos;


@Local
public interface DatoDAOLocal {

	void save(Datos datos);
	List<Datos> getAll();
	void delete(Datos datos);
	List<Datos> findByName(String nombre);
}

