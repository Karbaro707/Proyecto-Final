package com.banco.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.datasource.ArticuloRepository;
import com.banco.app.entities.Articulo;

@Service
public class SrvImpArticulo implements ISrvArticulo{
	
	@Autowired
	private ArticuloRepository repositorio;

	@Override
	public boolean insert(Articulo articulo) {
		return repositorio.insert(articulo);
	}

	@Override
	public List<Articulo> getAll() {
		return repositorio.getAll();
	
	}
}
