package @init.package@.domain.entity.query;

import com.dream.springframework.dao.model.BaseCondition;
import com.dream.springframework.dao.model.BaseQueryBuilder;
import com.dream.springframework.dao.model.Order;
import com.dream.springframework.dao.model.OrderColumn;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Query condition for system versions
 *
 * @author @init.author@
 */
public class SysQuery extends BaseCondition {

    private String keyword;

    private SysQuery() {
    }

    public String getKeyword() {
        return keyword;
    }

    public static Builder builder() {
        return new Builder(new SysQuery());
    }

    public static class Builder extends BaseQueryBuilder<SysQuery> {

        private static final Order DEFAULT_ORDER = new Order("updateTime", Order.ORDER_DESC);

        private static final Map<String, OrderColumn[]> ORDER_COLUMN_MAP =
                Collections.unmodifiableMap(new HashMap<String, OrderColumn[]>() {
                    {
                        put("updateTime", new OrderColumn[]{new OrderColumn("update_time")});
                        put("versionId", new OrderColumn[]{new OrderColumn("version_id")});
                    }
                });

        private Builder(SysQuery query) {
            super(query);
        }

        public Builder setKeyword(String keyword) {
            query.keyword = keyword;
            return this;
        }

        public Builder page(Integer pageNum, Integer pageSize) {
            setPage(pageNum, pageSize);
            return this;
        }

        public Builder orderBy(Order order) {
            buildOrder(order);
            return this;
        }

        @Override
        protected Map<String, OrderColumn[]> getOrderColumnMap() {
            return ORDER_COLUMN_MAP;
        }

        @Override
        protected Order getDefaultOrder() {
            return DEFAULT_ORDER;
        }
    }
}
