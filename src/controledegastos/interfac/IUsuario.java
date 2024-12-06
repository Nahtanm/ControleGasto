/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controledegastos.interfac;

import controeldegastos.domain.Gasto;
import controeldegastos.domain.Usuario;
import java.util.Collection;

/**
 *
 * @author Nahtanm
 */
public interface IUsuario {
    public Usuario cadastrarUsuario(Usuario usuario);
    public void addGasto(Usuario usuario, Gasto gasto);
    public Collection buscarTodosGastos(Usuario usuario);
    public Usuario buscarPorCpf(Long cpf);
}
