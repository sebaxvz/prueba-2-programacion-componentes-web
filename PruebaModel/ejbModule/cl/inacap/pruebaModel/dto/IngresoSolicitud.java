package cl.inacap.pruebaModel.dto;

import java.util.List;

public class IngresoSolicitud {
		private String rut;
		private String nombre;
		private String apellido;
		private List<Tipo> tipo;
		public String getRut() {
			return rut;
		}
		public void setRut(String rut) {
			this.rut = rut;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public List<Tipo> getTipo() {
			return tipo;
		}
		public void setTipo(List<Tipo> tipo) {
			this.tipo = tipo;
		}
		
}
