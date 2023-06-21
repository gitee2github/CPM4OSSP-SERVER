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

}
