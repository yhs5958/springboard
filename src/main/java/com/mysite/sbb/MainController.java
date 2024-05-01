package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/sbb")
	public String main() {
		return "main";
	}
	
	@GetMapping("/")
	public String root() {
		return "main";
	}
	
	//미구현 메뉴 controller
	@GetMapping("/menu1")
	@ResponseBody
	public String menu1() {
		return "아직 미구현입니다..ㅠㅠ";
	}
	@GetMapping("/menu2")
	@ResponseBody
	public String menu2() {
		return "아직 미구현입니다..ㅠㅠ";
	}
	@GetMapping("/menu3")
	@ResponseBody
	public String menu3() {
		return "아직 미구현입니다..ㅠㅠ";
	}
		
}
