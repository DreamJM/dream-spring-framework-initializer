package @init.package@.service;

import com.dream.springframework.auth.token.component.BaseTokenAuthenticationService;
import com.dream.springframework.auth.token.exception.TokenException;
import com.dream.springframework.auth.token.exception.TokenExpiredException;
import com.dream.springframework.auth.token.model.TokenAuthUser;
import com.dream.springframework.base.exception.RequestException;
import org.springframework.stereotype.Service;

/**
 * Session service for authenticated user
 *
 * @author @init.author@
 */
@Service
public class SessionService extends BaseTokenAuthenticationService<TokenAuthUser> {
    @Override
    protected TokenAuthUser parseToken(String token) throws TokenException, TokenExpiredException, RequestException {
        // FIXME: parses token and compose authenticated user information
        return new TokenAuthUser("uid1", token);
    }
}
