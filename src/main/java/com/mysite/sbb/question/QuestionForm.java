package com.mysite.sbb.question;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	
    @NotBlank(message = "글 분류는 필수항목입니다.")
    private String posttype;
    
	@NotEmpty(message = "제목은 필수 항목입니다.")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message = "내용은 필수 항목입니다.")
	private String content;
	
}