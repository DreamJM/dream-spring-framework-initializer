package @init.package@.service;

import @init.package@.domain.SysRepository;
import @init.package@.constant.ErrorCode;
import @init.package@.domain.entity.query.SysQuery;
import @init.package@.model.SystemVersion;
import com.dream.springframework.base.exception.NotFoundException;
import com.dream.springframework.base.model.PageResult;
import com.dream.springframework.dao.util.PageUtil;
import org.springframework.stereotype.Service;

/**
 * System information service
 *
 * @author @init.author@
 */
@Service
public class SysService {

    private SysRepository repository;

    public SysService(SysRepository repository) {
        this.repository = repository;
    }

    public SystemVersion loadCurrent() throws NotFoundException {
        return repository.loadCurrent().map(SystemVersion::new).orElseThrow(() -> new NotFoundException(ErrorCode.DATA_NOT_FOUND));
    }

    public PageResult<SystemVersion> query(SysQuery query) {
        return PageUtil.parsePageResult(repository.query(query), SystemVersion::new);
    }

}
