package com.sky.dao.userrole;

import com.sky.pojo.Userrole;
import com.sky.pojo.UserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleMapper {
    int countByExample(UserroleExample example);

    int deleteByExample(UserroleExample example);

    int deleteByPrimaryKey(Integer urid);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    List<Userrole> selectByExample(UserroleExample example);

    Userrole selectByPrimaryKey(Integer urid);

    int updateByExampleSelective(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByExample(@Param("record") Userrole record, @Param("example") UserroleExample example);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);
}