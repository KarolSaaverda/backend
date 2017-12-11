package com.youtube.demo.model;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable
{


	private static final long serialVersionUID = 9022132952590357619L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id",unique= true, nullable=false)
	
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
