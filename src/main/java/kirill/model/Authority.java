package kirill.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by kirill on 17/10/16.
 */
public class Authority implements GrantedAuthority{
    private String authority;

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }
}
