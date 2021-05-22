package cl.inacap.pruebaModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.pruebaModel.dto.Datos;

/**
 * Session Bean implementation class DatoDAO
 */
@Stateless
@LocalBean
public class DatoDAO implements DatoDAOLocal {
	
	
	private static List<Datos> dato = new ArrayList<>();
    /**
     * Default constructor. 
     */

	@Override
	public void save(Datos datos) {
		dato.add(datos);
		
	}

	@Override
	public List<Datos> getAll() {
		// TODO Auto-generated method stub
		return dato;
	}

	@Override
	public void delete(Datos datos) {
	dato.remove(datos);
		
	}

	@Override
	public List<Datos> findByName(String nombre) {
		// TODO Auto-generated method stub
		return dato.stream().filter(c->c.getNombre().contains(nombre)).collect(Collectors.toList());
	}
   
	
    }


