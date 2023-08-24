package mx.edu.utex.evaluacion_u3.controllers.user;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import mx.edu.utex.evaluacion_u3.models.leak.DaoLeak;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet(name = "ServletAdmin", urlPatterns = {"/admin/main", "/admin/delete", "/admin/logout", "/admin/activa", "/admin/inactiva"})
public class ServletAdmin extends HttpServlet {
    private Long id;
    private String action;
    private String redirect = "/admin/main";

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        action = req.getServletPath();
        switch (action) {
            case "/admin/main":
                redirect = "/views/admin.jsp";
                break;
        }
        resp.sendRedirect(req.getContextPath() + redirect);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        action = req.getServletPath();
        switch (action) {
            case "/admin/activa":
                try {
                    id = Long.parseLong(req.getParameter("id"));
                    System.out.println(id);
                    if (new DaoLeak().active2(id)) {
                        redirect = "/admin/main?result=" + true
                                + "&message=" + URLEncoder.encode("Usuario activado correctamente", StandardCharsets.UTF_8);
                    } else {
                        redirect = "/admin/main?result=" + false
                                + "&message=" + URLEncoder.encode("No se pudo activar el usuario", StandardCharsets.UTF_8);
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    redirect = "/admin/main?result=" + false
                            + "&message=" + URLEncoder.encode("No se pudo activar el usuario", StandardCharsets.UTF_8);
                }
                break;
            case "/admin/inactiva":
                try {
                    id = Long.parseLong(req.getParameter("id"));
                    System.out.println(id);
                    if (new DaoLeak().inactive2(id)) {
                        redirect = "/admin/main?result=" + true
                                + "&message=" + URLEncoder.encode("Usuario inactivo correctamente", StandardCharsets.UTF_8);
                    } else {
                        redirect = "/admin/main?result=" + false
                                + "&message=" + URLEncoder.encode("No se pudo activar el usuario", StandardCharsets.UTF_8);
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    redirect = "/admin/main?result=" + false
                            + "&message=" + URLEncoder.encode("No se pudo activar el usuario", StandardCharsets.UTF_8);
                }
                break;
        }
        resp.sendRedirect(req.getContextPath() + redirect);
    }

}
