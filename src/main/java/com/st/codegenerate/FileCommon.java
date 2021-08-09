package com.st.codegenerate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shent
 */
@Data
@AllArgsConstructor
public class FileCommon {
    private String content;
    private String path;
}
