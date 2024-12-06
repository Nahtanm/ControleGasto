/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controeldegastos.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nahtanm
 */
public class Usuario {

    private String nome;
    private Long cpf;
    private Integer salario;
    private List<Gasto> gastos;
    private Integer saldo;
    private Gasto gasto;

    public Usuario() {
        this.gastos = new ArrayList<>();
    }

    public Usuario(String nome, Integer salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = Long.valueOf(cpf);
        this.gastos = new ArrayList<>();
    }

    public Gasto getGasto() {
        return gasto;
    }

    public void setGasto(Gasto gasto) {
        this.gasto = gasto;
    }

    
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void addGasto(Gasto gastos) {
        this.gastos.add(gastos);
    }

    public Integer getSaldo() {
        if(this.gasto == null){
            return this.salario;
        }
        return this.salario - this.gasto.getValor();
    }

    @Override
    public String toString() {
        return "USUARIO{" + "Nome: " + nome + ", Salario: " + salario + ", GASTOS: " + gastos + ", Saldo: " + saldo + '}';
    }

}
