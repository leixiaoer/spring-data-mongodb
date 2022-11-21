package cn.leo.mongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

@SpringBootTest
class SpringDataMongodbApplicationTests {

    @Resource
    MongoTemplate mongoTemplate;

    //测试创建集合
    @Test
    public void testCollection() {
        boolean exists = mongoTemplate.collectionExists("emp");
        if (exists) {
            // 删除集合
            mongoTemplate.dropCollection("emp");
        }
        //创建集合
        mongoTemplate.createCollection("emp");
    }

    @Test
    public void createDocument() {
        boolean exists = mongoTemplate.collectionExists("emp");
        if (exists) {
            // 删除集合
            mongoTemplate.dropCollection("emp");
        }
        //创建集合
        mongoTemplate.createCollection("emp");
    }

}
