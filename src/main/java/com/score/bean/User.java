package com.score.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * 用户实体类
 * @author jh
 *
 */
@Component
@Data
public class User {
	/*用户名称*/
	private int id;
	/*用户登录名称*/
	private String username;
	/* 用户登录密码 */
	private String password;
	

}
