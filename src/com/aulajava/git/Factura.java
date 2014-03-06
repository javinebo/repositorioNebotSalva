package com.aulajava.git;
import java.util.Arrays;
/**
* Clase <code>Factura</code> para crear cada una de las facturas
* @author <u>Javier Nebot Salva</u>
* @version <u>04-03-14</u>
* @see LineaFactura
*/
public class Factura {
	
	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/**
	* <h1>Constructor de la clase Factura</h1>
	* 
	*/
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de cada linea
	 * @return Devuelve el precio total de la factura.
	 * <h1> metodo getTotal()</h1>	 
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	/**
	 * Metodo toString que devuelve la composicion de id_cliente+nombre+total+lineas factura.
	 * <h1>Metodo toString</h1>
	 */	
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}

	/**
	 * <h1>Programa principal para crear las lineas de factura.</h1>
	 * 
	 */
	public static void main(String[] args){
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		System.out.println("esto es una prueba para el repositorio github");
		
	}	
	
}
