package com.arun.h2demo.actual;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


	
	@ApiModel(description="All details about the user.")
	@Entity
	public class NUser {

		@Id
		@GeneratedValue
		private Integer id;

		@Size(min=2, message="Name should have atleast 2 characters")
		@ApiModelProperty(notes="Name should have atleast 2 characters")
		private String name;

		

		protected NUser() {

		}

		public NUser(Integer id, String name) {
			super();
			this.id = id;
			this.name = name;
			//this.birthDate = birthDate;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		@Override
		public String toString() {
			return String.format("User [id=%s, name=%s]", id, name);
		}

	}


