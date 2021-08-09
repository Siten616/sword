package com.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.domain.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shent
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    @Override
    int insert(SysUserRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysUserRole record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SysUserRole selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysUserRole record);
}