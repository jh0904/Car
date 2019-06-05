package com.score.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * com.score.bean
 *
 * @author jh
 * @date 2019/5/26 16:39
 * description:
 */
@Component
@Data
public class UserVo {
	/*用户名称*/
	private int id;
	/*用户登录名称*/
	private String username;
	/* 用户登录密码 */
	private int uc;

}

