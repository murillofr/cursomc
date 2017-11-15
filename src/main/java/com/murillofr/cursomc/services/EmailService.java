package com.murillofr.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.murillofr.cursomc.domain.Cliente;
import com.murillofr.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
