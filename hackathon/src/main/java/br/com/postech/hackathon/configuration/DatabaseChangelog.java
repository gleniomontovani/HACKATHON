package br.com.postech.hackathon.configuration;

import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;

import io.mongock.api.annotations.BeforeExecution;
import io.mongock.api.annotations.ChangeUnit;

@ChangeUnit(id = "init-customer", order = "001", author = "glenio")
public class DatabaseChangelog {

	@BeforeExecution
    public void insertDocuments(final MongoTemplate mongoTemplate) {
//        mongoTemplate.save(new Document("field1", "value1").append("field2", "value2"), "yourCollectionName");
//        mongoTemplate.save(new Document("field1", "value1").append("field2", "value2"), "yourCollectionName");
//        mongoTemplate.save(new Document("field1", "value1").append("field2", "value2"), "yourCollectionName");
//        mongoTemplate.save(new Document("field1", "value1").append("field2", "value2"), "yourCollectionName");
    }
}
