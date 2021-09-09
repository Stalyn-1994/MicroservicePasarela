package com.Trainee;

import java.nio.charset.StandardCharsets;

import javax.xml.bind.DatatypeConverter;

public class Base64 {

	public String decodificador64(String codificado) {
		
		byte[] encodedHelloBytes= DatatypeConverter.parseBase64Binary(codificado);
		String texto= new String(encodedHelloBytes,StandardCharsets.UTF_8);
		return texto;
	}
}
