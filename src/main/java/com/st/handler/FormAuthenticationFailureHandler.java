package com.st.handler;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.http.HttpUtil;
import com.st.common.util.WebUtils;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shent
 * 表单登录失败处理逻辑
 */
@Slf4j
public class FormAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    @SneakyThrows
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) {
        log.debug("表单登录失败:{}", e.getLocalizedMessage());
        String url = HttpUtil.encodeParams(String.format("/token/login?error=%s", e.getMessage()), CharsetUtil.CHARSET_UTF_8);
        WebUtils.getResponse().sendRedirect(url);
    }
}
