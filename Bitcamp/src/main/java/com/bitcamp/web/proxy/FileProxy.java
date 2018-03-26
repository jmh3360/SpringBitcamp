package com.bitcamp.web.proxy;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileProxy extends Proxy{
	private MultipartFile file;
	private List<MultipartFile> files;
	
	@Override
	public void execute(Model model, Object o) {
		// TODO Auto-generated method stub
		
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public List<MultipartFile> getFiles() {
		return files;
	}

	public void setFiles(List<MultipartFile> files) {
		this.files = files;
	}
	
	

}
