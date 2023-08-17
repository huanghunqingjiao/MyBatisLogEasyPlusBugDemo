package com.example.demo2714;

import com.example.demo2714.entity.Demo;
import com.example.demo2714.mapper.DemoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2714ApplicationTests {
    @Autowired
    private DemoMapper demoMapper;

    @Test
    void testInsertDemo() {
        Demo demo = new Demo();
        demo.setTextStr("[httpServerRequest[ org.springframework.security.web.header.HeaderWriterFilter$HeaderWriterRequest@67b80766]]");
        demoMapper.insert(demo);
    }

}
