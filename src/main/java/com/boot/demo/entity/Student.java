package com.boot.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
	Integer ID;
	String StudenName;
	String email;
	Integer age;
	String sex;
}