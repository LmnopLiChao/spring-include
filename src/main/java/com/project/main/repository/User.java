package com.project.main.repository;

import com.project.main.entity.Users;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface User extends PagingAndSortingRepository<Users, String>, JpaSpecificationExecutor<Users> {
	
	@Query("select u from Users u where u.loginId=?1")
	public Users getUserByLoginId(String loginId);
}
