package com.pragati.serv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.pragati.model.User;
import com.pragati.service.UserService;
import com.pragati.service.UserServiceImpl;

@WebServlet("/UploadServlet")
//if you want  upload file then the servlet must annotate
//multipartconfig(simple approach)
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//a part or form item that was received within a multipart/form-data POST request.
		//The Part with the given name, or null if this request is of type multipart/form-data, but does notcontain the requested Part
		Part part = request.getPart("image");
		
		ServletContext sc = request.getServletContext();
		
		String filePath = sc.getRealPath("images");
		
		Path path = Paths.get(filePath);
		if(!Files.exists(path)) {
			Files.createDirectory(path);
		} 
		
		String fileName = part.getSubmittedFileName();
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		int uid = user.getUid();
		
		fileName = fileName.substring(fileName.lastIndexOf('.'));
		fileName = uid+fileName;
		
		path = path.resolve(fileName);
		System.out.println(path); 
		Files.copy(part.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		
		UserService userService = new UserServiceImpl();
		userService.upload(uid, fileName);
		
		response.sendRedirect("user_home.jsp");
	}

}
