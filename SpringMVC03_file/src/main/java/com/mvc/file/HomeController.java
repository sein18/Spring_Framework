package com.mvc.file;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.file.validate.FileValidator;
import com.mvc.file.validate.UploadFile;

 
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	 
	@Autowired
	private FileValidator fileValidator;
	
	@RequestMapping(value = "/form.do")
	public String getUploadForm() {

		return "uploadForm";
	}

	@RequestMapping("upload.do")
	public String fileUpload(HttpServletRequest request, Model model, 
								UploadFile uploadFile, BindingResult result) {
		
		//유효성 검사, 파일의 크기가 0인지
		fileValidator.validate(uploadFile, result);
		if(result.hasErrors()) {
			return "uploadForm";
		}
		return "home";
	}
}
