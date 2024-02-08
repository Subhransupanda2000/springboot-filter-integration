package com.example.springbootfilterintegration;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.Collections;
public class MyCustomFilter implements Filter {

        private static final Logger logger = LoggerFactory.getLogger(MyCustomFilter.class);

        public void init(FilterConfig filterConfig) throws ServletException {
            // Initialization logic, if needed
        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {
            // Cast ServletRequest to HttpServletRequest to access URL and headers
            HttpServletRequest httpRequest = (HttpServletRequest) request;

            // Log request URL
            logger.info("Request URL: {}", httpRequest.getRequestURL());

            // Log request headers
            Collections.list(httpRequest.getHeaderNames())
                    .forEach(headerName ->
                            logger.info("Header: {} = {}", headerName, httpRequest.getHeader(headerName))
                    );

            // Continue the filter chain
            chain.doFilter(request, response);
        }

        @Override
        public void destroy() {
            // Cleanup logic, if needed
        }
    }

