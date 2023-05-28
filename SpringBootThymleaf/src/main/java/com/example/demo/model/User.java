package com.example.demo.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
	private String name;
	private String email;
	private String password;
	private String gender;
	private String profession;
	private String note;
	private Date birthday;
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", profession=" + profession + ", note=" + note + ", birthday=" + birthday + "]";
	}

	
	
}
