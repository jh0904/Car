package com.score.dao;

import com.score.bean.Park;
import com.score.bean.User;
import com.score.bean.UserVo;
import java.util.List;

/**
 * 用户登录数据层
 * @author hmg
 *
 */
public interface UserDao {
	/**
	 *全量查询用户
	 * @param user
	 * @return
	 */
	List<User> getUser(User user);

	List<UserVo> selectAll();

	List<Park> selectPark();

	Integer update(int id, int odd);
}
