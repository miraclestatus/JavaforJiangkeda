package com.neusoft.dao;

import com.neusoft.domain.Admin;

public interface AdminDao {
    public Admin getAdminByNameAndPassword(String adminName, String password);

}
