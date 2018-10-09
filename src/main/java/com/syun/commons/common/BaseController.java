package com.syun.commons.common;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 所有controller的父类
 * @author wugy
 *  2016年7月11日下午5:01:40
 *
 */
public class BaseController {

	public static final int SUCCESS = 200;
	
	public static final int SAME = 209;//数据一致,数据库未修改
	
	public static final int FAIL = 400;//服务器错误
	
	public static final int WRONG_CONST = 500;//参数错误
	
	public ResultMessage checkHeaderInfo(HttpServletRequest request,
			boolean needCheckToken) {
		String appId = request.getHeader("appId");
		String appSercret = request.getHeader("appSercret");
		// 1、校验appId和appSercret是否合法
		if (StringUtils.isEmpty(appId)) {
			return new ResultMessage(401, "应用唯一标识(appId)不能为空");
		}
		if (StringUtils.isEmpty(appSercret)) {
			return new ResultMessage(402, "接口密钥(appSercret)不能为空");
		}

		if (appId.equals("android-appid")) {// 是Android客户端
			if (!appSercret.equals("android-appSercret")) {
				return new ResultMessage(403, "安卓客户端的接口密钥(appSercret)错误");
			}

		} else if (appId.equals("ios-appid")) {// 是IOS客户端
			if (!appSercret.equals("ios-appSercret")) {
				return new ResultMessage(404, "苹果客户端的接口密钥(appSercret)错误");
			}
		} else {
			return new ResultMessage(405, "应用唯一标识(appId)错误");
		}

		// 2、验证用户信息
		String token = request.getHeader("token");
		
//		if (needCheckToken) {

//		}
		return new ResultMessage(200);
	}
}
