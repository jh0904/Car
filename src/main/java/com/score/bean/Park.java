package com.score.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * com.score.bean
 *
 * @author jh
 * @date 2019/5/26 17:42
 * description:
 */
@Data
@Component
public class Park {
	private int id;
	private int num;
	private int odd;
}
