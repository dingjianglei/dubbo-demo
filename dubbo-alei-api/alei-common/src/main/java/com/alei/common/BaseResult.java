package com.alei.common;

import java.io.Serializable;
/**
 * 基础结果反馈
 * @author dingjianglei
 *
 * @param <T>
 */
public class BaseResult<T> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean success;	//是否成功
	private String errorMsg;	//异常信息
	private T value;			//结果值
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
}
