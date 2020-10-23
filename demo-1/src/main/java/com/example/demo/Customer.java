package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {
	@Id
	//pk로 사용하겠다는뜻
	private Long no;
	@Column(name= "username", length = 100, nullable =false)
	private String name;
	//@Transient
	private String phone;
	private String addr;
}
