package io.jpom.model.data;

import io.jpom.model.BaseEnum;
import io.jpom.model.BaseJsonModel;
import io.jpom.model.BaseModel;
import io.jpom.model.Cycle;

import java.util.List;

/**
 * 监控管理实体
 *
 * 
 */
public class MonitorModel extends BaseModel {
    /**
     * 监控的项目
     */
    private List<NodeProject> projects;
    /**
     * 报警联系人
     */
    private List<String> notifyUser;
    /**
     * 异常后是否自动重启
     */
    private boolean autoRestart;
    /**
     * 监控周期
     */
    private int cycle = Cycle.thirty.getCode();
    /**
     * 创建人
     */
    private String parent;
    /**
     * 最后修改时间
     */
    private long modifyTime;
 }
