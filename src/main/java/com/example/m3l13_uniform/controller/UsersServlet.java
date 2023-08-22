package com.example.m3l13_uniform.controller;

import com.example.m3l13_uniform.entity.User;
import com.example.m3l13_uniform.service.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "usersServlet", value = "/users-servlet")
public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UserService userService = new UserService();
        userService.printAllUsersToConsole();

        List<User> allUsers = userService.getAllUsers();

        request.setAttribute("users", allUsers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/users.jsp");
        requestDispatcher.forward(request, response);

    }


}
