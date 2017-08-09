package javaapplication9;
// Generated 08/08/2017 17:40:37 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private BigDecimal codigoprod;
     private String nombreprod;
     private String lineaprod;
     private boolean esneto;
     private int cantidad;
     private BigDecimal precioventapublico;

    public Producto() {
    }

	
    public Producto(BigDecimal codigoprod, String nombreprod, String lineaprod, boolean esneto, int cantidad) {
        this.codigoprod = codigoprod;
        this.nombreprod = nombreprod;
        this.lineaprod = lineaprod;
        this.esneto = esneto;
        this.cantidad = cantidad;
    }
    public Producto(BigDecimal codigoprod, String nombreprod, String lineaprod, boolean esneto, int cantidad, BigDecimal precioventapublico) {
       this.codigoprod = codigoprod;
       this.nombreprod = nombreprod;
       this.lineaprod = lineaprod;
       this.esneto = esneto;
       this.cantidad = cantidad;
       this.precioventapublico = precioventapublico;
    }
   
    public BigDecimal getCodigoprod() {
        return this.codigoprod;
    }
    
    public void setCodigoprod(BigDecimal codigoprod) {
        this.codigoprod = codigoprod;
    }
    public String getNombreprod() {
        return this.nombreprod;
    }
    
    public void setNombreprod(String nombreprod) {
        this.nombreprod = nombreprod;
    }
    public String getLineaprod() {
        return this.lineaprod;
    }
    
    public void setLineaprod(String lineaprod) {
        this.lineaprod = lineaprod;
    }
    public boolean isEsneto() {
        return this.esneto;
    }
    
    public void setEsneto(boolean esneto) {
        this.esneto = esneto;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getPrecioventapublico() {
        return this.precioventapublico;
    }
    
    public void setPrecioventapublico(BigDecimal precioventapublico) {
        this.precioventapublico = precioventapublico;
    }




}


