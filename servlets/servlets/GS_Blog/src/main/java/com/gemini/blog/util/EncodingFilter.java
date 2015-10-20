package com.gemini.blog.util;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;


public class EncodingFilter implements Filter {

    private static final String ENCODING = "UTF-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding(ENCODING);
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
