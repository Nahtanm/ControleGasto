/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controeldegastos.domain;


/**
 *
 * @author Nahtanm
 */
public class Gasto {

    private String gasto;
    private Integer valor;
    
    public Gasto() {
    }

    public Gasto(String gasto, Integer valor) {
        this.gasto = gasto;
        this.valor = valor;
    }
    
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }    
    
    public String getGasto() {
        return gasto;
    }

    public void setGasto(String gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "{" + "Descrição: " + gasto + ", Valor: " + valor + '}';
    }

    
}
