package com.jupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jupiter.model.JUser;

public interface UserDao extends JpaRepository<JUser, Long> {

	/**
	 * @param name
	 * @param passwd
	 * @return
	 */
	@Query(" from JUser j where j.name=?1 and j.passwd=?2")
	JUser findByNameNPass(String name, String passwd);

}
