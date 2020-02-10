package @init.package@.model;

import @init.package@.domain.entity.SysEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * System version model
 *
 * @author @init.author@
 */
@ApiModel("System version Information")
public class SystemVersion {

    @ApiModelProperty("version code")
    private String versionCode;

    @ApiModelProperty("version id")
    private int versionId;

    @ApiModelProperty("update time")
    private Date updateTime;

    @ApiModelProperty("version description")
    private String description;

    public SystemVersion(SysEntity entity) {
        this.versionCode = entity.getVersionCode();
        this.versionId = entity.getVersionId();
        this.updateTime = entity.getUpdateTime();
        this.description = entity.getDescription();
    }

    public String getVersionCode() {
        return versionCode;
    }

    public int getVersionId() {
        return versionId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getDescription() {
        return description;
    }
}
