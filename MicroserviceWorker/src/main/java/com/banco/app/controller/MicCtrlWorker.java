package com.banco.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.app.entities.Worker;
import com.banco.app.service.ISrvWorker;

@RestController
@RequestMapping("/worker")  //http://ip:port/worker
public class MicCtrlWorker {
	
	@Autowired
	private ISrvWorker servicio;
	
	@PostMapping //POST -> http://ip:port/worker
	public ResponseEntity<String> insert(@RequestBody Worker worker){
		if (servicio.insert(worker))
			return new ResponseEntity<String> ("Ok",HttpStatus.CREATED);
		
		return new ResponseEntity<String> ("NOT Ok",HttpStatus.BAD_REQUEST);
	}
	@GetMapping //GET -> http://ip:port/worker
	public ResponseEntity<List<Worker>> get(){
		return new ResponseEntity<List<Worker>>(servicio.getAll(), HttpStatus.OK);

	}
}
