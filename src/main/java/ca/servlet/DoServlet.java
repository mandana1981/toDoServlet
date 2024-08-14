package ca.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns ={"/DoServlet"}
)
public class DoServlet extends HttpServlet {
    List<Do> dos;
    @Override
    public void init() throws ServletException {
        dos = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("dos", dos);
//
//
//        req.getRequestDispatcher("/jsp/third.jsp").forward(req, resp);
        System.out.println("doGet print");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        String dueDate = req.getParameter("dueDate");
        Do do1 = new Do(description,dueDate);
        dos.add(do1);
        req.setAttribute("dos", dos);
        req.getRequestDispatcher("/jsp/second.jsp").forward(req, resp);

        System.out.println("doPost print");
    }
}
