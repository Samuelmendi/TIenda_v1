
package com.tienda.dao;


import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CateogriaDao extends JpaRepository<Categoria, Long> {
    
}
