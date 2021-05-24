package cl.inacap.pruebaApp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.pruebaModel.dao.DatoDAOLocal;
import cl.inacap.pruebaModel.dto.Datos;

/**
 * Servlet implementation class IngresarController
 */
@WebServlet("/IngresarController.do")
public class IngresarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IngresarController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/vistas/ingresoSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> errores = new ArrayList<String>();
		String rut = request.getParameter("rut-txt").trim();
		if (rut.length() > 10) {
			errores.add("su rut no es valido");
		}
		String nombre = request.getParameter("nombre-txt").trim();
		if (nombre.isEmpty()) {
			errores.add("Ingresar nombre y apellido");
		}
		String solicitud = request.getParameter("solicitud-select").trim();
		if (solicitud.isEmpty()) {
			errores.add("seleccione la solicitud");
		}
		if (errores.isEmpty()) {
			Datos datos = new Datos();
			datos.setRut(rut);
			datos.setNombre(nombre);
			datos.setSolicitud(solicitud);
			DatosDAO.save(datos);
			request.setAttribute("mensaje", "Solicitud ingresada");
		} else {
			request.setAttribute("se encontro un problema", errores);

		}
		doGet(request, response);
	}

}
