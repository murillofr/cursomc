package com.murillofr.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murillofr.cursomc.domain.Estado;
import com.murillofr.cursomc.repositories.EstadoRepository;
import com.murillofr.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado find(Integer id) {
		Estado obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Estado.class.getName());
		}
		return obj;
	}
	
	public void insert(Estado obj) {
		obj.setId(null);
		repo.save(obj);
	}
	
}