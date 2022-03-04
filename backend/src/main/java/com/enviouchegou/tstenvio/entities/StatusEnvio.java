package com.enviouchegou.tstenvio.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_envio")
public class StatusEnvio {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer codigo_produto;
	private String status_envio;
	private Date data;
	
	public StatusEnvio() {
		
	}
	
	public StatusEnvio(Long id, String name, Integer codigo_produto, String status_envio, Date data) {
		super();
		this.id = id;
		this.name = name;
		this.codigo_produto = codigo_produto;
		this.status_envio = status_envio;
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCodigo_produto() {
		return codigo_produto;
	}
	public void setCodigo_produto(Integer codigo_produto) {
		this.codigo_produto = codigo_produto;
	}
	public String getStatus_envio() {
		return status_envio;
	}
	public void setStatus_envio(String status_envio) {
		this.status_envio = status_envio;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
