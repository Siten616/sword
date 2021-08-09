package com.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.domain.SysRoleResource;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shent
 */
@Mapper
public interface SysRoleResourceMapper extends BaseMapper<SysRoleResource> {
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
    int insert(SysRoleResource record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysRoleResource record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SysRoleResource selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysRoleResource record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysRoleResource record);
}