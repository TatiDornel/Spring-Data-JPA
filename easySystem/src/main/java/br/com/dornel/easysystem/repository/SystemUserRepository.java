package br.com.dornel.easysystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dornel.easysystem.entity.SystemUser;

public interface SystemUserRepository extends JpaRepository<SystemUser, Long>{

	
}
