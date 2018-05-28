package com.project.main.repository;

import com.project.main.entity.Navs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface Nav extends PagingAndSortingRepository<Navs, String>, JpaSpecificationExecutor<Navs> {
	@Query("select n from Navs n where n.parent=null")
	List<Navs> findNavs ();
}
