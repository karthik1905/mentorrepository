package com.mentor.demand.repository;

import org.springframework.data.repository.CrudRepository;

import com.mentor.demand.pojo.UserDtls;

public interface UserDetailsRepository extends CrudRepository<UserDtls,Long>{

}
