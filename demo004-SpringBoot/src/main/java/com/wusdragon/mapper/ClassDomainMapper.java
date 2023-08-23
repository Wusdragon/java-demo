package com.wusdragon.mapper;

import com.wusdragon.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: Wusdragon
 * @date: 2023/8/16 15:22
 * @desc:
 */
public interface ClassDomainMapper {

    List<User> getById(@Param("id") Long id);
}
