package entities;

import java.util.Date;

public class Contract {

	
	private Integer hora;
	private double valorhora;
  	private Date date;
  	
    public Contract() {
    	
    }
  	

	public Contract(Date date, Double valorhora, Integer hora) {

		this.hora =  hora;
		this.valorhora = valorhora;
		this.date = date;
	}





	


	public double getHora() {
		return hora;
	}


	public void setHora(Integer hora) {
		this.hora = hora;
	}


	public double getValorhora() {
		return valorhora;
	}


	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}


	public Date getDate() {
		return date;
	}


  	
  	public double totalValueContract () {
  		
  		return valorhora * hora;
  		
  	}
  	
}
