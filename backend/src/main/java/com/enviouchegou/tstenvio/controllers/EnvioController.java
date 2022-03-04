package com.enviouchegou.tstenvio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviouchegou.tstenvio.entities.StatusEnvio;
import com.enviouchegou.tstenvio.repositories.EnvioRepository;

@RestController
@RequestMapping(value = "/envios")
public class EnvioController {

	@Autowired
	private EnvioRepository repository;

	@GetMapping
	public List<StatusEnvio> findAll() {
		List<StatusEnvio> result = repository.findAll();
		return result;
	}

	@GetMapping(value = "/page")
	public Page<StatusEnvio> findAll(Pageable pageable) {
		Page<StatusEnvio> result = repository.findAll(pageable);
		return result;
	}

	@GetMapping(value = "/{id}")
	public StatusEnvio findByCodigo_produto(@PathVariable Long id) {
		StatusEnvio result = repository.findById(id).get();
		return result;
	}
}
