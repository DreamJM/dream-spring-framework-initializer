package @init.package@.controller;

import @init.package@.domain.entity.query.SysQuery;
import @init.package@.model.SystemVersion;
import @init.package@.service.SysService;
import com.dream.springframework.auth.base.annotation.AuthIgnore;
import com.dream.springframework.base.exception.NotFoundException;
import com.dream.springframework.base.model.PageResult;
import com.dream.springframework.base.model.Result;
import com.dream.springframework.dao.model.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Server information controller
 *
 * @author @init.author@
 */
@Api(tags = {"Server Information management"})
@RestController
public class SysController {

    private SysService service;

    public SysController(SysService service) {
        this.service = service;
    }

    @ApiOperation(value = "Gets current server version")
    @AuthIgnore
    @GetMapping("/api/sys-version/current")
    public Result<SystemVersion> loadCurrentVersion() throws NotFoundException {
        return new Result<>(service.loadCurrent());
    }

    @ApiOperation(value = "Gets history versions")
    @GetMapping("/api/sys-versions")
    public Result<PageResult<SystemVersion>> queryVersions(
            @ApiParam("keyword for version code and description") @RequestParam(required = false) String keyword,
            @ApiParam("query page number") @RequestParam(required = false) Integer pageNum,
            @ApiParam("query page size") @RequestParam(required = false) Integer pageSize,
            @ApiParam("query order(format:’[orderBy]:[order]',order: ‘0(ASC)/1(DESC’), supported orderBy: ‘versionId, updateTime’")
            @RequestParam(required = false) String order) {
        return new Result<>(
                service.query(SysQuery.builder().setKeyword(keyword).page(pageNum, pageSize).orderBy(Order.parseOrder(order)).build()));
    }
}
