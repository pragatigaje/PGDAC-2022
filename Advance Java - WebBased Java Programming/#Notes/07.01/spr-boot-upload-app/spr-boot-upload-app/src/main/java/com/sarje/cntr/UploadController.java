package com.sarje.cntr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@PostMapping(value = {"/upload"})
	public void upload(@RequestParam MultipartFile image, HttpServletRequest request) {
		try {
			ServletContext sc = request.getServletContext();
			String filePath = sc.getRealPath("/images");
			Path path = Paths.get(filePath);
			if(!Files.exists(path)) {
				Files.createDirectory(path);
			}
			String fileName = image.getOriginalFilename();
			path = path.resolve(fileName);
			Files.copy(image.getInputStream(), path,StandardCopyOption.REPLACE_EXISTING);
			System.out.println(path);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
