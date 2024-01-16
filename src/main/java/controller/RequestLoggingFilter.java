package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        // Log the HTTP request details
        logRequestDetails(req);

        // Continue with the rest of the filter chain
        chain.doFilter(request, response);
    }

    private void logRequestDetails(HttpServletRequest request) {
        // Here, you can log whatever details you need, for example:
        System.out.println("Request Method: " + request.getMethod());
        System.out.println("Request URI: " + request.getRequestURI());
        // Add more details as needed
    }



}

