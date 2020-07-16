package mx.erma.kafkaproducer.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.erma.kafkaproducer.components.KafkaMessageProducer;
import mx.erma.kafkaproducer.services.IMessageService;

@Service
public class MessageService implements IMessageService {

	@Autowired
	KafkaMessageProducer kafkaMessageProducer;
	
	@Override
	public void send(String message) {
		kafkaMessageProducer.sendMessage(message);

	}

}
