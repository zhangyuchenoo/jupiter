package com.jupiter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.DynamicInsert;

@Entity
@DynamicInsert
@Table(name = "j_user")
public class JUser {
	@Id
	@TableGenerator(table = "id_sequence", name = "user_sequence", pkColumnName = "table_", pkColumnValue = "j_user", valueColumnName = "val")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "user_sequence")
	@Column(name = "id")
	private Long id;
	@Column(name = "username")
	private String name;
	@Column(name = "passwd")
	private String passwd;
	@Column(name = "gender")
	private Integer gender;

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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

}
