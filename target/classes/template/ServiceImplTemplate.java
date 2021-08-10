package com.st.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

{baseName};
        {baseName}Mapper;
        {baseName}Service;

/**
 * @author shent
 */
@Service
@RequiredArgsConstructor
public class ${baseName}ServiceImpl extends ServiceImpl<${baseName}Mapper, ${baseName}> implements ${baseName}Service {
    private final ${baseName}Service ${baseName_u}Service;

}