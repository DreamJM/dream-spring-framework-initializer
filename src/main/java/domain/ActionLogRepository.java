package @init.package@.domain;

import @init.package@.domain.dao.ActionLogMapper;
import com.dream.springframework.actionlog.repository.ActionLogCreationRepo;
import com.dream.springframework.actionlog.repository.ActionLogReqEntity;
import org.springframework.stereotype.Repository;

/**
 * Action log repository
 *
 * @author @init.author@
 */
@Repository
public class ActionLogRepository implements ActionLogCreationRepo {

    private ActionLogMapper mapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public ActionLogRepository(ActionLogMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void insert(ActionLogReqEntity entity) {
        mapper.insert(entity);
    }

}
