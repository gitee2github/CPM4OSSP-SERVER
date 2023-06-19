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
    /**
     * 监控开启状态
     */
    private boolean status;
    /**
     * 报警状态
     */
    private boolean alarm;

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public List<NodeProject> getProjects() {
        return projects;
    }

    public void setProjects(List<NodeProject> projects) {
        this.projects = projects;
    }

    public List<String> getNotifyUser() {
        return notifyUser;
    }

    public void setNotifyUser(List<String> notifyUser) {
        this.notifyUser = notifyUser;
    }


    public boolean isAutoRestart() {
        return autoRestart;
    }

    public void setAutoRestart(boolean autoRestart) {
        this.autoRestart = autoRestart;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public long getModifyTime() {
        return modifyTime;
    }

 }
