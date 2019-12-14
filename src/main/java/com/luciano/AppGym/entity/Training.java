package com.luciano.AppGym.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Training implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 884167240836823729L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	
	@Column
	@NotBlank
	private String nombre;
	
	@Column
	private String numSeries;
	
	@Column
	private String numRepeticiones;
	
	@Column
	private String descanso;
	
	@Column
	private String pesoMin;
	
	@Column
	private String pesoMax;
	
	@Size(min=1)
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_trainings",
			joinColumns=@JoinColumn(name="training_id"),
			inverseJoinColumns=@JoinColumn(name="user_id"))
	private Set<User> trainings;
	
	public Training() {
		super();
	}

	public Training(Long id) {
		super();
		this.id = id;
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

	public String getNumSeries() {
		return numSeries;
	}

	public void setNumSeries(String numSeries) {
		this.numSeries = numSeries;
	}

	public String getNumRepeticiones() {
		return numRepeticiones;
	}

	public void setNumRepeticiones(String numRepeticiones) {
		this.numRepeticiones = numRepeticiones;
	}

	public String getDescanso() {
		return descanso;
	}

	public void setDescanso(String descanso) {
		this.descanso = descanso;
	}

	public String getPesoMin() {
		return pesoMin;
	}

	public void setPesoMin(String pesoMin) {
		this.pesoMin = pesoMin;
	}

	public String getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(String pesoMax) {
		this.pesoMax = pesoMax;
	}

	public Set<User> getTrainings() {
		return trainings;
	}

	public void setTrainings(Set<User> trainings) {
		this.trainings = trainings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descanso == null) ? 0 : descanso.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numRepeticiones == null) ? 0 : numRepeticiones.hashCode());
		result = prime * result + ((numSeries == null) ? 0 : numSeries.hashCode());
		result = prime * result + ((pesoMax == null) ? 0 : pesoMax.hashCode());
		result = prime * result + ((pesoMin == null) ? 0 : pesoMin.hashCode());
		result = prime * result + ((trainings == null) ? 0 : trainings.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Training other = (Training) obj;
		if (descanso == null) {
			if (other.descanso != null)
				return false;
		} else if (!descanso.equals(other.descanso))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numRepeticiones == null) {
			if (other.numRepeticiones != null)
				return false;
		} else if (!numRepeticiones.equals(other.numRepeticiones))
			return false;
		if (numSeries == null) {
			if (other.numSeries != null)
				return false;
		} else if (!numSeries.equals(other.numSeries))
			return false;
		if (pesoMax == null) {
			if (other.pesoMax != null)
				return false;
		} else if (!pesoMax.equals(other.pesoMax))
			return false;
		if (pesoMin == null) {
			if (other.pesoMin != null)
				return false;
		} else if (!pesoMin.equals(other.pesoMin))
			return false;
		if (trainings == null) {
			if (other.trainings != null)
				return false;
		} else if (!trainings.equals(other.trainings))
			return false;
		return true;
	}
	
	
	
}
