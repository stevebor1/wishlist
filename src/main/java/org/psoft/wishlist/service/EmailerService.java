package org.psoft.wishlist.service;

import java.io.OutputStream;

import org.springframework.stereotype.Component;

@Component
public class EmailerService {
	
	public void sendMail(String to, String from, String subject, String body) throws Exception{
		Process process = Runtime.getRuntime().exec(new String[] {"/usr/bin/mail",
				"-a", from,
				"-s", subject,
				to});
		
		
		OutputStream outputStream = process.getOutputStream();
		outputStream.write(body.getBytes());
		outputStream.close();
		
		process.waitFor();
		
	}

}
