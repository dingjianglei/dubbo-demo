package com.alei.user.enums;

public enum UserExceptionEnum {
	LOGIN_WRONG("user_info_wrong","用户名或密码错误"),
	UNKNOW("system_error","程序异常");
	private String code;
	private String errorMsg;
	
	public String getCode() {
		return code;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
	
	UserExceptionEnum(String code,String errorMsg){
		this.code = code;
		this.errorMsg = errorMsg;
	}
	
}
