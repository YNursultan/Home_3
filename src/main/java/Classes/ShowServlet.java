package Classes;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

public class ShowServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] arr = req.getParameterValues("items");
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession();

        Cookie[] cookies = req.getCookies();
        int a = cookies[0].getMaxAge();
        int b = session.getMaxInactiveInterval() - (600 - a);

//        Map<Integer,User> map = (Map<Integer, User>) req.getAttribute("map");
//
//        printWriter.println("Thanks a lot "+ map.get(1).getUsername());
        printWriter.println("Activity interval "+ session.getMaxInactiveInterval());
        Date creation = new Date(session.getCreationTime());
        printWriter.println("creation time "+ creation +"<br>");
        printWriter.println("last access time "+ creation +"<br>");
        Integer counter = (Integer) session.getAttribute("count");
        printWriter.println("you are visiting us: "+(++counter));
        if(counter>1)
            printWriter.println("times");
        else
            printWriter.println("time");
        for (int i=0;i<arr.length;i++){
            printWriter.println(arr[i]);
        }
    }
}
