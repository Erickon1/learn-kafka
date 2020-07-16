package mx.erma.kafkaproducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.erma.kafkaproducer.services.IMessageService;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	IMessageService service;
	
	@PostMapping
	public ResponseEntity<String> sendMessage(@RequestBody String message){
		service.send(message);
		return new ResponseEntity<String>("Message was send",HttpStatus.OK);
	}
}
