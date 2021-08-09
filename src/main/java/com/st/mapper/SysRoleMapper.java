package com.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.st.domain.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shent
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
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
    int insert(SysRole record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(SysRole record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    SysRole selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SysRole record);
}