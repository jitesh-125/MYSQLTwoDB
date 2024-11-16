package com.sumit.playjava.server;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "server-data")
public class Server {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "server-area")
	private String serverArea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServerArea() {
		return serverArea;
	}

	public void setServerArea(String serverArea) {
		this.serverArea = serverArea;
	}

	@Override
	public String toString() {
		return "Server [id=" + id + ", serverArea=" + serverArea + ", getId()=" + getId() + ", getServerArea()="
				+ getServerArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Server(Long id, String serverArea) {
		super();
		this.id = id;
		this.serverArea = serverArea;
	}

	public Server() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
