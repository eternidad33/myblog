package com.hbu.myblog.mapper;

import com.hbu.myblog.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author vigilr
 * @since 2021/02/25
 */
public interface AdminUserMapper {
    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Integer adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}