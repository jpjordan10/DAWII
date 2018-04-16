package pe.edu.cibertec.proyemp.jpa.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROYECTO")
public class Proyecto {

	@Id
	@GeneratedValue
	@Column(name = "PROY_ID")
	private Long id;

	private String nombre;

	@ManyToMany(mappedBy="proyectos")
	private Collection<Empleado> empleados;

	public Proyecto() {
	}

	public Proyecto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

}
