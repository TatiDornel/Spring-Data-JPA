package br.com.dornel.easysystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import br.com.dornel.easysystem.entity.SystemUser;
import br.com.dornel.easysystem.repository.SystemUserRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class SystemUserService {

	@Autowired
	private SystemUserRepository repositorySystemUser;
	
	@Transactional(readOnly = false)
	public void save(SystemUser entity){
		
		repositorySystemUser.save(entity);
	}
}
