package com.boot.demo.entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Builder(toBuilder = true)
public class User implements Serializable {

	private Integer id;
	private String name;
	private String password;
	private String number;

	@Tolerate
	public User() {
	}

}
