package com.banco.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.app.datasource.WorkerRepository;
import com.banco.app.entities.Worker;

@Service
public class SrvImpWorker implements ISrvWorker {
	
	@Autowired
	private WorkerRepository repositorio;

	@Override
	public boolean insert(Worker worker) {
		return repositorio.insert(worker);
	}

	@Override
	public List<Worker> getAll() {
		return repositorio.getAll();
	}
	
}
