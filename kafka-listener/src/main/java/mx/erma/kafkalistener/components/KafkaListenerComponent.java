package mx.erma.kafkalistener.components;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerComponent {
	
   @KafkaListener(topics = "${message.topic.name}", groupId = "${message.group.name}")
   public void listenTopic1(String message) {	   
       System.out.println("Recieved Message of topic in  listener: " + message);
   }
	   
}