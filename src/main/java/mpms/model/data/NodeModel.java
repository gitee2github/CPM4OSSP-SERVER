package io.jpom.model.data;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.alibaba.fastjson.JSONArray;
import io.jpom.common.forward.NodeUrl;
import io.jpom.model.BaseModel;
import io.jpom.model.Cycle;

import java.util.Objects;

/**
 * 节点实体
 *
 */
public class NodeModel extends BaseModel {

	private String url;
	private String loginName;
	private String loginPwd;
	/**
	 * 代理端口号
	 */
	private String proxyPort;
	/**
	 * 节点协议
	 */
	private String protocol = "http";

	private String authorize;
	/**
	 * 项目信息  临时信息
	 */
	private JSONArray projects;
	/**
	 * 开启状态，如果关闭状态就暂停使用节点
	 */
	private boolean openStatus;
	/**
	 * 节点超时时间
	 */
	private int timeOut;
	/**
	 * 绑定的sshId
	 */
	private String sshId;

	/**
	 * 节点分组
	 */
	private String group;


}
