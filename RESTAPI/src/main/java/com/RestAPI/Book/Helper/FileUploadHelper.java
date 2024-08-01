package com.RestAPI.Book.Helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

	public final String UPLOAD_DIR = "C:\\Users\\2102736\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\RESTAPI\\src\\main\\resources\\static\\images";

	public boolean uploafFile(MultipartFile file) {
		boolean f = false;
		
		try {
			//read file
		InputStream inputStream = file.getInputStream();
		byte[] data = new byte[inputStream.available()];
		inputStream.read(data);
		
		//write file
		FileOutputStream fileOutputStream = new FileOutputStream(UPLOAD_DIR+File.separator+file.getOriginalFilename());
		fileOutputStream.write(data);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}

}
