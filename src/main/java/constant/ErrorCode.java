package @init.package@.constant;

import com.dream.springframework.base.exception.BaseErrorCode;

/**
 * Error Code that will result in {@link com.dream.springframework.base.model.Result#getCode()}.
 * <ul>Codes are between 0 and 5999
 * <li>0-999 are designed for Success or partial Success (1-899 are remained for user, others are reserved for framework)</li>
 * <li>1000-1999 are designed for Parameter error (1001-1899 are remained for user, others are reserved for framework)</li>
 * <li>2000-2999 are designed for Authentication error (2001-2899 are remained for user, others are reserved for framework)</li>
 * <li>3000-3999 are designed for Access or Authority Error (3001-3899 are remained for user, others are reserved for framework)</li>
 * <li>4000-4999 are designed for Service Error (4001-4899 are remained for user, others are reserved for framework)</li>
 * <li>5000-5999 are designed for System Error (5001-5899 are remained for user, others are reserved for framework)</li>
 * </ul>
 *
 * @author @init.author@
 */
public class ErrorCode extends BaseErrorCode {

}
