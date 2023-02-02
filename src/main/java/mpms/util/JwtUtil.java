package io.jpom.util;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTHeader;
import cn.hutool.jwt.JWTValidator;
import cn.hutool.jwt.signers.JWTSignerUtil;
import cn.jiangzeyin.common.DefaultSystemLog;
import io.jpom.model.data.UserModel;
import io.jpom.system.ServerExtConfigBean;

/**
 * jwt 工具类
 *
 * 
 
 */
public class JwtUtil {

	/**
	 * 加密算法
	 */
	private static final String ALGORITHM = "HS256";
	/**
	 * token的的加密key
	 */
	private static byte[] KEY;
	public static final String KEY_USER_ID = "userId";

	private static byte[] getKey() {
		if (KEY == null) {
			KEY = ServerExtConfigBean.getInstance().getAuthorizeKey();
		}
		return KEY;
	}

	public static JWT parseBody(String token) {
		if (StrUtil.isEmpty(token)) {
			return null;
		}
		JWT jwt = JWT.of(token);
		if (jwt.verify(JWTSignerUtil.hs256(getKey()))) {
			return jwt;
		}
		return null;
	}


	/**
	 * 读取token 信息 过期也能读取
	 *
	 * @param token token
	 * @return claims
	 */
	public static JWT readBody(String token) {
		try {
			return parseBody(token);
		} catch (Exception e) {
			DefaultSystemLog.getLog().warn("token 解析失败：" + token, e);
			return null;
		}
	}
}