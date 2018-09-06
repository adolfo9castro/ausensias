package main;

public class Ausensias {
	private String motivoAusensia;
    private Empleado idEmpleado;
    private FechaAusensia fechaAusensia;  
    
    public Ausensias(String motivoAusensia, FechaAusensia fechaAusensia, Empleado idEmpleado) {
        this.motivoAusensia = motivoAusensia;
        this.fechaAusensia = fechaAusensia;
        this.idEmpleado = idEmpleado;
    }
    
    public String getMotivoAusensia() {
        return motivoAusensia;
    }

    public void setMotivoAusensia(String motivoAusensia) {
        this.motivoAusensia = motivoAusensia;
    }
        
    public int getIdEmpleado() {
        return idEmpleado.getIdEmpleado();
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    public void setFechaAusensia(FechaAusensia fechaAusensia) {
        this.fechaAusensia = fechaAusensia;
    }
        
	public int getDias(){
		return fechaAusensia.getDias();
	}
	
	public int getMeses(){
		return fechaAusensia.getMeses();
	}
    
    public String mostrar() {
        return "Se ha ingresado el usuario con el ID: " + idEmpleado.getIdEmpleado() + "\nMotivo de ausensia: " + motivoAusensia + "\nEn la fecha: " + fechaAusensia.setFechaAusensia();
    }
}
