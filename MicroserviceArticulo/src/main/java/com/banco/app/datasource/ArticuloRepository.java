package com.banco.app.datasource;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.banco.app.entities.Articulo;

@Component
public class ArticuloRepository {
	private final List<Articulo> lista=new ArrayList<>();

	public boolean insert(Articulo articulo) {
		return lista.add(articulo);
	}
	
		public List<Articulo> getAll() {
		return lista;
	}

}		