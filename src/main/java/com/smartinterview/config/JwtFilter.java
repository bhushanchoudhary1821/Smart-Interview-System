package com.smartinterview.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.smartinterview.util.JwtUtil;

public class JwtFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        // ✅ PUT HERE (TOP)
        if (req.getRequestURI().contains("/api/auth/login")) {
            chain.doFilter(request, response);
            return;
        }

        String authHeader = req.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            res.getWriter().write("Token Missing or Invalid");
            return;
        }

        String token = authHeader.substring(7);

        try {
            String email = JwtUtil.extractEmail(token);
        } catch (Exception e) {
            HttpServletResponse res = (HttpServletResponse) response;
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            res.getWriter().write("Invalid Token");
            return;
        }

        chain.doFilter(request, response);
    }
}