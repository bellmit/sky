package com.sky.dao.privilege;

import com.sky.pojo.Privilege;
import com.sky.pojo.PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegeMapper {
    int countByExample(PrivilegeExample example);

    int deleteByExample(PrivilegeExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    List<Privilege> selectByExample(PrivilegeExample example);

    Privilege selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByExample(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}