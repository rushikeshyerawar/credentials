package com.mindscape.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mindscape.DAO.InternsDAO;
import com.mindscape.entity.imagedata;
import com.mindscape.entity.interns;

@RestController
@CrossOrigin("http://localhost:4200")

public class InternController {

	@Autowired
	InternsDAO dao;
	
	@GetMapping("getAllInterns")
	public ResponseEntity<List<interns>>getAllInterns()
	{
		List<interns> list=dao.getAllInterns();
		return new ResponseEntity<List<interns>>(list,HttpStatus.OK);
	}
	
	@RequestMapping("updateIntern")
	public interns updateIntern(@RequestBody interns intern)
	{
		return dao.updateIntern(intern);
	}
	
	@RequestMapping("saveIntern")
	public ResponseEntity<interns> saveIntern(@RequestBody interns intern)
	{
		dao.saveIntern(intern);
		return new ResponseEntity<interns>(intern,HttpStatus.OK);
	}
	
	@DeleteMapping("deleteIntern/{internid}")
	public ResponseEntity<interns> deleteIntern(@PathVariable int internid)
	{
		interns intern1=dao.deleteIntern(internid);
		return new ResponseEntity<interns>(intern1,HttpStatus.OK);
	}
	
	@RequestMapping("validate/{certino}")
	public ResponseEntity<interns> validate(@PathVariable String certino)
	{
		interns intern=dao.getInternByCertificate(certino);
		
		return new ResponseEntity<interns>(intern,HttpStatus.OK);
	}
	
	
	
	@GetMapping("getPdf/{id}")
	public ResponseEntity<String> getPdf(@PathVariable String id) {
	    List<String> filePaths = new ArrayList<>();

	    String directoryPath = "C:\\Users\\HP\\CertificateCredentials\\src\\assets\\pdf";
	    File directory = new File(directoryPath);
	    if (directory.exists() && directory.isDirectory()) {
	        File[] files = directory.listFiles();
	        if (files != null) {
	            Arrays.stream(files)
	                    .filter(File::isFile)
	                    .filter(file -> file.getName().toLowerCase().endsWith(".pdf") && file.getName().equals(id + ".pdf"))
	                    .map(File::getPath)
	                    .map(filePath -> filePath.replace("\\", "/")) // Replace backslashes with forward slashes
	                    .forEach(filePaths::add);
	        }
	    }
	    return new ResponseEntity<>(filePaths.get(0).toString(), HttpStatus.OK);
	}
	
	
	

	   
	}

