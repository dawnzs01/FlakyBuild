package io.riskscanner.dto;

import io.riskscanner.base.domain.Role;
import io.riskscanner.base.domain.UserRole;

import java.util.List;

public class UserRoleDTO {

    private String userId;
    private List<Role> roles;
    private List<UserRole> userRoles;
    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
