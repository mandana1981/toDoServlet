package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.Location;
import java.io.IOException;
@WebFilter("/SimpleFilter")
public class SimpleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse rep, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse response=(HttpServletResponse) rep;
        //String inputDate = req.getParameter("date");
        int enteredYear = Integer.parseInt(req.getParameter("date"));
        int currentYear=java.time.LocalDate.now().getYear();
        if (enteredYear > currentYear) {
            response.setHeader("Location","ErrorServlet.java");
        }
        filterChain.doFilter(req,rep);

    }

    @Override
    public void destroy() {

    }
}
