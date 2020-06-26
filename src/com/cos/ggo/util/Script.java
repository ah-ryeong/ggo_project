package com.cos.ggo.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	public static void outText(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			out.print(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of outText
	
	public static void getMessage(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			out.println("<h1>"+msg+"</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of getMessage
	
	public static void back(String msg, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert(' " + msg + " ');");
			out.println("history.back();");
			out.println("</script>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of back
	
	public static void href(String msg, String uri, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert(' " + msg + " ');");
			out.println("location.href=' "+ uri +" ';");
			out.println("</script>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of href(msg, uri, response)
	
	public static void href(String uri, HttpServletResponse response) {
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			out.println("<script>");
			out.println("location.href=' "+ uri +" ';");
			out.println("</script>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of href(uri, response)
	
}
