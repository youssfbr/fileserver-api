package com.alissonyoussf.fileserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alissonyoussf.fileserver.storage.Disco;

@RestController
@RequestMapping("/arquivos")
@CrossOrigin("*")
public class ArquivosController {

	@Autowired
	private Disco disco;
		
	@PostMapping
	public void upload(@RequestParam MultipartFile arquivo) {
		disco.salvarArquivo(arquivo);		
	}
}
