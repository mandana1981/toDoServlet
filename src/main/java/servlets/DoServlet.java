package servlets;

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
    List<DoItem> toDoItemList;
    @Override
    public void init() throws ServletException {
        toDoItemList = new ArrayList<>();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("viewList", toDoItemList);
        req.getRequestDispatcher("/jsp/toDoList.jsp").forward(req, resp);

        System.out.println("doGet print");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date = req.getParameter("date");
        String description = req.getParameter("description");
        DoItem doItem1 = new DoItem(description,date);
        toDoItemList.add(doItem1);

        req.setAttribute("viewList", toDoItemList);
        req.getRequestDispatcher("/jsp/toDoList.jsp").forward(req, resp);


        System.out.println("doPost print");
    }
}
