package mpms.model.data;

import mpms.model.BaseModel;

public class NodeVersionModel extends BaseModel {
    private String version;
    /**
     * 节点分组
     */
    private String group;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
