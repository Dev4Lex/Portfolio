package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @classname UserPojo
 * @author alexs
 * @since 10.11.2021 01:27
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPojo {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int id;
    private String email;
}
