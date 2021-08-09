package com.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.st.domain.${baseName};
import com.st.mapper.${baseName}Mapper;
import com.st.service.${baseName}Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author shent
 */
@Service
@RequiredArgsConstructor
public class ${baseName}ServiceImpl extends ServiceImpl<${baseName}Mapper, ${baseName}> implements ${baseName}Service {
    private final ${baseName}Service ${baseName_u}Service;

}