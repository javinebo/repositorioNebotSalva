package com.aulajava.git;
/**
 * Clase <code>Linea Factura</code> crea las lineas de cada factura.
*@author <u>Javier Nebot Salva</u>
* @version <u>04-03-14</u>
*@see Factura
*/
public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	
	/**
	* <h1>Constructor de la clase LineaFactura<h1>
	*/
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	/**
	 * creamos un metodo para devolver la linea de factura con el id de producto
	 * el nombre, el precio la cantidad y el descuento.
	 *<h1>Metodo toString() </h1>
	 */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
		
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad 
	 * <h1>Metodo getTotal()</h1>
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}
}
