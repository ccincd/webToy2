package hello;

import org.joda.time.DateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Start from Servlet
 *
 * Created by cc on 16/4/17.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        DateTime dateTime = new DateTime();
        String currentTime = dateTime.toString("yyyy-MM-dd");
        req.setAttribute("currentTime", currentTime);
        req.getRequestDispatcher("/WEB-INF/view/hello.jsp").forward(req, resp);
    }
}
