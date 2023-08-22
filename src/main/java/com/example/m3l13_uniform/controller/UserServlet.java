package com.example.m3l13_uniform.controller;

import com.example.m3l13_uniform.entity.User;
import com.example.m3l13_uniform.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "userServlet", value = "/user-servlet")
public class UserServlet extends HttpServlet {

    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        // ВЫВЕДЕМ И НА КОНСОЛЬ
        System.out.println(userService.getUserById(id));

        User userById = userService.getUserById(id);
        request.setAttribute("user", userById);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/user.jsp");
        requestDispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // РАЗБИРАЕМ ПОСТ-ЗАПРОС НА ДЕТАЛИ
        int id = Integer.parseInt(request.getParameter("id"));

        String newLogin = request.getParameter("newLogin");
        String newPassword = request.getParameter("newPassword");

        // ЗАПИСАЛИ НОВЫЕ ДАННЫЕ В БАЗУ ДАННЫХ
        userService.updateUserById(id, newLogin, newPassword);

        // ВЫВЕДЕМ И НА КОНСОЛЬ
        System.out.println(userService.getUserById(id));

        // ИДЕМ ОПЯТЬ НА ТУ ЖЕ СТРАНИЦУ И УВИДИМ НА СТРАНИЦЕ ИЗМЕНЕНИЯ
        User userById = userService.getUserById(id);
        request.setAttribute("user", userById);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/user.jsp");
        requestDispatcher.forward(request, response);

    }


}
