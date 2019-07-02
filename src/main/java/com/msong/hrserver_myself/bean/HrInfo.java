package com.msong.hrserver_myself.bean;

import java.util.List;

public class HrInfo {
    private Hr hr;
    private List<Role> roles;

    public Hr getHr() {
        return hr;
    }

    public void setHr(Hr hr) {
        this.hr = hr;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
