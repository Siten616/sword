package com.st.handler;

import cn.hutool.core.util.StrUtil;
import com.google.common.net.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shent
 * 退出功能 ，根据客户端传入跳转
 */
public class SsoLogoutSuccessHandler implements LogoutSuccessHandler {
    private static final String REDIRECT_URL = "redirect_url";

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        String redirectUrl = httpServletRequest.getParameter(REDIRECT_URL);
        if (StrUtil.isNotBlank(redirectUrl)) {
            httpServletResponse.sendRedirect(redirectUrl);
        } else {
            String referer = httpServletRequest.getHeader(HttpHeaders.REFERER);
            httpServletResponse.sendRedirect(referer);
        }
    }
}
