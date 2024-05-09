package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 20; i++) {
            String subject = String.format("테스트 글 %02d번", i);
            String content = String.format("%02d번째 글입니다.", i);;
            this.questionService.create(subject, content, null);
        }
    }
}