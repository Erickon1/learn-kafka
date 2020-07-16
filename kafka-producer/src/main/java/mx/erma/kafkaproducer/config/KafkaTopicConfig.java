package mx.erma.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	
  @Value(value = "${message.topic.name}")
  private String topic;	
	
  @Bean
  public NewTopic topicExample() {
    return TopicBuilder.name(topic)
      .partitions(6)
      .replicas(3)
      .build();
  }
}