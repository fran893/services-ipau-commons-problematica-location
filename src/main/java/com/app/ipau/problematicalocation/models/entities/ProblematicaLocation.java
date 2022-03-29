package com.app.ipau.problematicalocation.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.app.ipau.commons.problematicas.models.entities.Problematica2;
import com.app.ipau.commons.problematicas.models.entities.Problematica3;

@Entity
public class ProblematicaLocation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idProblematicaLocation;
	private String descripcion;
	private double latitud;
	private double longitud;
	@OneToOne
	private Problematica2 problematica2;
	@OneToOne
	private Problematica3 problematica3;
	private Date fechaSistema;
	private int cantVecesMarcada;
	@Column(columnDefinition = "bit default 0")
	private boolean esDudosa;
	private String observacionUser;
	
	public ProblematicaLocation() {}
	
	

	public ProblematicaLocation(int idProblematicaLocation, String descripcion, double latitud, double longitud,
			Problematica2 problematica2, Problematica3 problematica3, Date fechaSistema, int cantVecesMarcada,
			boolean esDudosa, String observacionUser) {
		super();
		this.idProblematicaLocation = idProblematicaLocation;
		this.descripcion = descripcion;
		this.latitud = latitud;
		this.longitud = longitud;
		this.problematica2 = problematica2;
		this.problematica3 = problematica3;
		this.fechaSistema = fechaSistema;
		this.cantVecesMarcada = cantVecesMarcada;
		this.esDudosa = esDudosa;
		this.observacionUser = observacionUser;
	}

	public int getIdProblematicaLocation() {
		return idProblematicaLocation;
	}

	public void setIdProblematicaLocation(int idProblematicaLocation) {
		this.idProblematicaLocation = idProblematicaLocation;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public Problematica2 getProblematica2() {
		return problematica2;
	}

	public void setProblematica2(Problematica2 problematica2) {
		this.problematica2 = problematica2;
	}

	public Problematica3 getProblematica3() {
		return problematica3;
	}

	public void setProblematica3(Problematica3 problematica3) {
		this.problematica3 = problematica3;
	}

	public Date getFechaSistema() {
		return fechaSistema;
	}

	public void setFechaSistema(Date fechaSistema) {
		this.fechaSistema = fechaSistema;
	}

	public int getCantVecesMarcada() {
		return cantVecesMarcada;
	}

	public void setCantVecesMarcada(int cantVecesMarcada) {
		this.cantVecesMarcada = cantVecesMarcada;
	}

	public boolean isEsDudosa() {
		return esDudosa;
	}

	public void setEsDudosa(boolean esDudosa) {
		this.esDudosa = esDudosa;
	}

	public String getObservacionUser() {
		return observacionUser;
	}

	public void setObservacionUser(String observacionUser) {
		this.observacionUser = observacionUser;
	}

}
