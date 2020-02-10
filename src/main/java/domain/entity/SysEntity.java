package @init.package@.domain.entity;

import java.util.Date;

/**
 * System information entity
 *
 * @author @init.author@
 */
public class SysEntity {

    private String versionCode;

    private int versionId;

    private Date updateTime;

    private String description;

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
