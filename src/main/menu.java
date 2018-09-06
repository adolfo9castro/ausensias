package main;
import javax.swing.JOptionPane;
public class menu {
	public static void main(String[] args) {
		Object op;
	    boolean sw = false;
	    Ausensias ar[] = new Ausensias[50];
	    
	    int dd, mm, aaaa, idEmpleado, i = 0;	    
	    Object motivoAusensia;
	    
	    while(sw == false) {
	    	 op = JOptionPane.showInputDialog(null,"¿Qué desea hacer?", "menu", JOptionPane.QUESTION_MESSAGE, null,
	    			new Object[] { 
	    	        "Registrar ausensia del trabajo",
	    	        "Porcentaje ausensia", 
	    	        "Mostrar ausensias", 
	    	        "Mes con mayor ausensias",
	    	        "Eliminar ausensia",
	    	        "Modificar fecha",
	    	        "Ver cantidad total de fechas",
	    	        "Listar las ausensias por día",
	    	        "Salir"
	    	    },"Seleccione");
	    	
	    	switch(op.toString()){
	        	case "Registrar ausensia del trabajo":
	        		if(i < 50) {
		        		idEmpleado =  Integer.parseInt(JOptionPane.showInputDialog("Escriba el id del empleado: "));
	                    dd = Integer.parseInt(JOptionPane.showInputDialog("Escriba el día: "));
	                    mm = Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes: "));
	                    aaaa = Integer.parseInt(JOptionPane.showInputDialog("Escriba el año: "));	                    	                    
	                    
	                    motivoAusensia = JOptionPane.showInputDialog(null,"Diga el motivo de su ausensia", "ausensias", JOptionPane.QUESTION_MESSAGE, null,
	                        new Object[] { "Personal","Académico", "Calamidad", "Compensatorio" },"Seleccione");
		        		
		        		ar[i]= new Ausensias(motivoAusensia.toString(), new FechaAusensia(dd, mm, aaaa), new Empleado(idEmpleado));
		        		
		        		JOptionPane.showMessageDialog(null, ar[i].mostrar());
		        		i++;
	        		}else {
	        			JOptionPane.showMessageDialog(null,"Error, ha eccedido el número de empleados");
	        		}
	        	break;
	        	
	        	case "Porcentaje ausensia":
	        		int personal = 0;
	        		int acadamico = 0;
	        		int calamidad = 0;
	        		int compensatorio = 0;
	        		for (int j = 0; j < i; j++ ) {
	        			switch(ar[j].getMotivoAusensia()){
	        				case "Personal":	        					
	        					personal++;
	        				break;
	        				case "Académico":
	        					acadamico++;
		        			break;
	        				case "Calamidad":
	        					calamidad++;
			        		break;			        		
	        				case "Compensatorio":
	        					compensatorio++;
			        		break;
	        			}
	        		}
	        		JOptionPane.showMessageDialog(null, "Porcentaje de los motivos de ausensia: \nPersonal: "+personal*100/i+"%\nAcadémico: "+acadamico*100/i+"%\nCalamidad: "+calamidad*100/i+"%\nCompensatorio: "+compensatorio*100/i+"%");
	        		
                break;
                
	        	case "Mostrar ausensias":
	        		int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del empleado a buscar: ")), diasTotal = 0;
	        		String vec = "";
	        		for (int j = 0; j < i; j++) {
        	            if(ar[j].getIdEmpleado() == idBuscar) {
        	            	vec += ar[j].getMotivoAusensia()+"\n";
        	            	diasTotal += ar[j].getDias();        	            	   	            	
        	            }        	                
        	        }
	        		JOptionPane.showMessageDialog(null, "Asensias del empleado "+ idBuscar + ":\n" + vec + "Suma total de días: "+diasTotal);	        		
	        	break;
	        	
	        	case "Mes con mayor ausensias":
	        		String[] mes = new String[12], g = new String[i];
	        		int temp = 0;
	        		int cont = 0;
	        		for (int k = 0; k < i; k++) {	        			
        				
    	            	if(temp == ar[k].getMeses()) {    	            		
    	            		temp = ar[k].getMeses();
    	            		cont++;
    	            	}else {
    	            		temp = ar[k].getMeses();
    	            	}
    	            	JOptionPane.showMessageDialog(null, "ar[k].getMeses() " + ar[k].getMeses() + " temp " +temp + " cont " + cont);        			
	        			 
    	            }
	        		for (int j = 0; j < i; j++) {
	        			JOptionPane.showMessageDialog(null, ar[j].getMeses());
        	            switch(ar[j].getMeses()){
        	            	case 1:
        	            		mes[0] = "Enero";
        	            	break;
        	            	case 2:
        	            		mes[1]= "Febrero";
        	            	break;
        	            	case 3:
        	            		mes[2]= "Marzo";
        	            	break;
        	            	case 4:
        	            		mes[3] = "Abril";
        	            	break;
        	            	case 5:
        	            		mes[4] = "Mayo";
        	            	break;
        	            	case 6:
        	            		mes[5] = "Junio";
        	            	break;
        	            	case 7:
        	            		mes[6] = "Julio";
        	            	break;
        	            	case 8:
        	            		mes[7] = "Agosto";
        	            	break;
        	            	case 9:
        	            		mes[8] = "Septiembre";
        	            	break;
        	            	case 10:
        	            		mes[9] = "Octubre";
        	            	break;
        	            	case 11:
        	            		mes[10] = "Noviembre";
        	            	break;
        	            	case 12:
        	            		mes[11] = "Diciembre";
        	            	break;        	            	
        	            } 
        	        }
	        		
	        	break;
	        	
	        	case "Eliminar ausensia":
	        	break;
	        	
	        	case "Modificar fecha":	        		
	        	break;
	        	
	        	case "Ver cantidad total de fechas":	        		
		        break;
		        
	        	case "Listar las ausensias por día":
	        		JOptionPane.showMessageDialog(null,  "TODO");
			    break;
	        	
	        	case "Salir":
                    sw = true;
                break;
	    
	    	}
	    	
	    }
	}
    	
}

