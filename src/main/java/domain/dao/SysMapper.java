package @init.package@.domain.dao;

import @init.package@.domain.entity.SysEntity;
import @init.package@.domain.entity.query.SysQuery;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * System information DAO
 *
 * @author @init.author@
 */
@Mapper
public interface SysMapper {

    String COMMON_COLUMNS = "version_code,version_id,update_time,description";

    @Select("SELECT " + COMMON_COLUMNS + " FROM @init.dbPrefix@system_info ORDER BY version_id DESC LIMIT 1")
    SysEntity loadCurrent();

    @Select("<script>SELECT " + COMMON_COLUMNS + " FROM demo_system_info WHERE 1=1 " +
            "<if test='keyword!=null'>AND (version_code LIKE CONCAT('%',#{keyword},'%') OR description LIKE CONCAT('%',#{keyword},'%'))" +
            "</if></script>")
    Page<SysEntity> query(SysQuery query);

}
