package com.everis.bootcamp.clientemicro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
		
		@Value("${some.value}")
		private String myvalue;
		
		@GetMapping(path="/myValue")
		private String myvalue() {
			return this.myvalue;
				
	}


}
