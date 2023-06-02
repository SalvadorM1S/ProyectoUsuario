
package com.tendencias.m5b.proyectoprueba.service;

import com.tendencias.m5b.proyectoprueba.model.Usuario;
import com.tendencias.m5b.proyectoprueba.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
/**
 *
 * @author Shalva
 */

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Integer> implements GenericService<Usuario, Integer> {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public CrudRepository<Usuario, Integer> getDao() {
        return usuarioRepository;
    }


}