package io.jpom.monitor;

import cn.hutool.core.util.IdUtil;
import cn.hutool.cron.CronUtil;
import cn.hutool.cron.pattern.CronPattern;
import cn.hutool.cron.task.Task;
import cn.jiangzeyin.common.JsonMessage;
import cn.jiangzeyin.common.spring.SpringUtil;
import com.alibaba.fastjson.JSONObject;
import io.jpom.common.forward.NodeForward;
import io.jpom.common.forward.NodeUrl;
import io.jpom.model.Cycle;
import io.jpom.model.data.NodeModel;
import io.jpom.model.log.SystemMonitorLog;
import io.jpom.service.dblog.DbSystemMonitorLogService;
import io.jpom.service.node.NodeService;
import io.jpom.util.CronUtils;

import java.util.List;

/**
 * 节点监控
 *
 * 
 
 */
public class NodeMonitor implements Task {

	private static final String CRON_ID = "NodeMonitor";

	private static DbSystemMonitorLogService dbSystemMonitorLogService;

}
