package @init.package@.domain;

import @init.package@.domain.dao.SysMapper;
import @init.package@.domain.entity.SysEntity;
import @init.package@.domain.entity.query.SysQuery;
import com.dream.springframework.dao.annotation.QueryCondition;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Action log repository
 *
 * @author @init.author@
 */
@Repository
public class SysRepository {

    private SysMapper mapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public SysRepository(SysMapper mapper) {
        this.mapper = mapper;
    }

    public Optional<SysEntity> loadCurrent() {
        return Optional.ofNullable(mapper.loadCurrent());
    }

    @QueryCondition
    public Page<SysEntity> query(SysQuery query) {
        return mapper.query(query);
    }

}
