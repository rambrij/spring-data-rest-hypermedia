package com.javacoderhint.demo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "emp", path = "emp")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findByLastName(@Param("name") String name);

}
