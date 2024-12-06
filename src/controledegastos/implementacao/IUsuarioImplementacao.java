/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controledegastos.implementacao;

import controeldegastos.domain.Gasto;
import controeldegastos.domain.Usuario;
import controledegastos.interfac.IUsuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nahtanm
 */
public class IUsuarioImplementacao implements IUsuario {

    private Map<Long, Usuario> usuarioMap;

    public IUsuarioImplementacao() {
        this.usuarioMap = new HashMap<>();
    }

    @Override
    public Collection<Gasto> buscarTodosGastos(Usuario usuario) {
        List<Gasto> lista = usuario.getGastos();
        return lista;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        if (!this.usuarioMap.containsKey(usuario.getCpf())) {
            this.usuarioMap.put(usuario.getCpf(), usuario);
            return usuario;
        }
        return null;
    }

    @Override
    public Usuario buscarPorCpf(Long cpf) {
        if (this.usuarioMap.containsKey(cpf)) {
            return this.usuarioMap.get(cpf);
        }
        return null;
    }

    @Override
    public void addGasto(Usuario usuario, Gasto gasto) {
        usuario.addGasto(gasto);
    }

}
