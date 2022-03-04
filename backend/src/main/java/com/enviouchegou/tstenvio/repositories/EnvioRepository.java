package com.enviouchegou.tstenvio.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.enviouchegou.tstenvio.entities.StatusEnvio;

public interface EnvioRepository extends JpaRepository<StatusEnvio, Long>{
	
	
}
