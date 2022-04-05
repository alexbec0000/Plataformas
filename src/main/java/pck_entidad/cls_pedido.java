/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck_entidad;

/**
 *
 * @author abecerra
 */
public class cls_pedido {
    
    private String str_tipo;
    private String str_medicamento;
    private int cantidad;
    private String str_distribuidor;
    private String str_lugar;

    public cls_pedido() {
        str_tipo="";
        str_medicamento="";
        cantidad=0;
        str_distribuidor="";
        str_lugar="";
        
    }

    public String getStr_tipo() {
        return str_tipo;
    }

    public void setStr_tipo(String str_tipo) {
        this.str_tipo = str_tipo;
    }

    public String getStr_medicamento() {
        return str_medicamento;
    }

    public void setStr_medicamento(String str_medicamento) {
        this.str_medicamento = str_medicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getStr_distribuidor() {
        return str_distribuidor;
    }

    public void setStr_distribuidor(String str_distribuidor) {
        this.str_distribuidor = str_distribuidor;
    }

    public String getStr_lugar() {
        return str_lugar;
    }

    public void setStr_lugar(String str_lugar) {
        this.str_lugar = str_lugar;
    }
    
    
    
    
    
}
