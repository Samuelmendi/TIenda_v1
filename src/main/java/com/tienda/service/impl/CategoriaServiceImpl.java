
package com.tienda.service.impl;

import com.tienda.service.CategoriaService;
import com.tienda.dao.CateogriaDao;
import com.tienda.domain.Categoria;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CateogriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
