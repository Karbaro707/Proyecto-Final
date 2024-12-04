package com.banco.app.service;

import java.util.List;
import com.banco.app.entities.Worker;

public interface ISrvWorker {
	boolean insert(Worker worker);
	List<Worker> getAll ();
}
