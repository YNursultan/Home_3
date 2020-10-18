package Item;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Category extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String category = req.getParameter("item");

        if (category.equals("Sport")){

        }
        else if (category.equals("Furniture")){

        }
        else if (category.equals("Gadgets")){

        }
        else {

        }
    }
}
