package com.alissonyoussf.fileserver.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Disco {

	@Value("${arquivo.disco.raiz}")
	private String raiz;
	
	@Value("${arquivo.disco.diretorio-arquivos}")
	private String diretorioArquivos;
	
	public void salvar(String diretorio, MultipartFile arquivoUpload) {
		Path diretorioPath = Paths.get(this.raiz, diretorio);
		Path arquivoPath = diretorioPath.resolve(arquivoUpload.getOriginalFilename());
		
		try {
			Files.createDirectories(diretorioPath);
			arquivoUpload.transferTo(arquivoPath.toFile());
		} catch (IOException e) {
			throw new RuntimeException("Não foi possível salvar o arquivo");
		}
	}
}
