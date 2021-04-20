package com.test.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = -394580405407547372L;

	private Integer id;// 编号
	private String name;// 姓名
	private String birthDay;// 出生年月 yyyy-MM-dd
	private String sex;// 性别 1男 2女
	private String departName;// 所属部门名称





}
