package com.alissonyoussf.fileserver.storage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Disco {

	@Value("${arquivo.disco.raiz}")
	private String raiz;
	
	@Value("${arquivo.disco.diretorio-arquivos}")
	private String diretorioArquivos;
}
