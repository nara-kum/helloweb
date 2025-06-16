package com.javaex.helloweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ggd")
public class Ggd extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//기본문법에 html을 추가로 표현
		System.out.println("doGet()실행");//콘솔
		int dan = Integer.parseInt(request.getParameter("dan"));
		System.out.println(dan);
		
		PrintWriter writer = response.getWriter();//응답문서에 추가
		writer.println("<table border='1'>");
		writer.println("	<tbody>");
		
		for(int i=1; i<=9; i++) {
			writer.println("		<tr>");
			writer.println("			<td>"+dan+"</td><td>"+i+"</td><td>"+i*dan+"</td>");
			writer.println("		</tr>");
		}
		writer.println("	</tbody>");
		writer.println("</table>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
