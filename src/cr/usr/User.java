package cr.usr;

import cr.algorithm.*;
import cr.closet.*;
import cr.file.*;
import cr.gui.*;
import cr.main.*;

import java.util.*;
import java.awt.*;

public class User{
	private String userId;
	private String userName;
	private String type;
	private int age;
	
	public User(){}

	public User(String[] userInfo){

		this.userId = userInfo[0];
                this.userName = userInfo[2];
                this.type = userInfo[3];
                this.age = Integer.parseInt(userInfo[4]);


	}
	
	public User(String userId, String userName, String type, int age){
		this.userId = userId;
		this.userName = userName;
		this.type = type;
		this.age = age;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getType() {
		return type;
	}

	public int getAge() {
		return age;
	}
	
	/*
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	*/

}
