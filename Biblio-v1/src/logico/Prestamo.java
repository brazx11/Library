package logico;

import java.util.Date;

public class Prestamo {
  private Date inic;
  private Date fin;
  private Publicacion prestamo;
  private boolean status;
  private int prorroga;
  private String cedula;
  
public Prestamo(Date fin, Publicacion prestamo, String cedula) {
	super();
	this.inic = new Date();
	this.fin = fin;
	this.prestamo = prestamo;
	this.status = true;
	this.prorroga = 0;
	this.cedula = cedula;
}

public Date getInic() {
	return inic;
}

public void setInic(Date inic) {
	this.inic = inic;
}

public Date getFin() {
	return fin;
}

public void setFin(Date fin) {
	this.fin = fin;
}

public Publicacion getPrestamo() {
	return prestamo;
}

public void setPrestamo(Publicacion prestamo) {
	this.prestamo = prestamo;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public int getProrroga() {
	return prorroga;
}

public void setProrroga(int prorroga) {
	this.prorroga = prorroga;
}

public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}
}
