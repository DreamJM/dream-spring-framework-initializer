package @init.package@.domain.dao;

import com.dream.springframework.actionlog.repository.ActionLogReqEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Action log DAO
 *
 * @author @init.author@
 */
@Mapper
public interface ActionLogMapper {

    @Insert("INSERT INTO @init.dbPrefix@action_log(optr_id,client_ip,module_id,func_type,hints,detail,action_time) "
        + "VALUES(#{optrId},#{clientIp},#{moduleId},#{funcType},#{hints},#{detail},#{actionTime})")
    void insert(ActionLogReqEntity entity);
}
