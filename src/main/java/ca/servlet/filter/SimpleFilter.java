package ca.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter("/SimpleFilter")
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("Simple Filter1");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Simple Filter2");
    }

    @Override
    public void destroy() {

    }
}
