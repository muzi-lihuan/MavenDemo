package com.example.test;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.HttpRequestHandler;


public class hellWorld  implements HttpRequestHandler {
        @Override
        public void handleRequest(HttpServletRequest request, HttpServletResponse response, Context context)
                throws IOException, ServletException {
            // TODO Auto-generated method stub
            String code = (String) request.getParameter("code");
            String name = (String) request.getParameter("name");
            context.getLogger().info(code);
            context.getLogger().info(name);
            response.setStatus(200);
            response.setContentType("text/html; charset=utf-8");
            OutputStream out = response.getOutputStream();
            String body = "Name: " + name + ",Code:" + code + "\n";
            out.write((body).getBytes());
            out.flush();
            out.close();
        }
}
