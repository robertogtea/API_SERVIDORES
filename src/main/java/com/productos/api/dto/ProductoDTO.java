package com.productos.api.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProductoDTO {

    private Long id;
    
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    
    private String descripcion;
    
    @NotNull(message = "La cantidad disponible es obligatoria")
    @Min(value = 0, message = "La cantidad disponible debe ser mayor o igual a 0")
    private Integer cantidadDisponible;
    
    @NotNull(message = "El precio de compra es obligatorio")
    @Min(value = 0, message = "El precio de compra debe ser mayor o igual a 0")
    private BigDecimal precioCompra;
    
    @NotNull(message = "El precio de venta es obligatorio")
    @Min(value = 0, message = "El precio de venta debe ser mayor o igual a 0")
    private BigDecimal precioVenta;
    
    public ProductoDTO() {
    }
    
    public ProductoDTO(Long id, String nombre, String descripcion, Integer cantidadDisponible, BigDecimal precioCompra, BigDecimal precioVenta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
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
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }
    
    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }
    
    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }
    
    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }
    
    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
}
