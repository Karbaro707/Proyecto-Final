package com.banco.app.service;

import java.util.List;
import com.banco.app.entities.Articulo;

public interface ISrvArticulo {
	boolean insert(Articulo articulo);
	List<Articulo> getAll ();
}