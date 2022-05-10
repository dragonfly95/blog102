package com.example.blog102;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
	
	@GetMapping("/api")
	public @ResponseBody HashMap hello() {
		
		HashMap<String, String> map = new HashMap();
		map.put("hello", "world");
		return map;
	}

}
