package course.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hello")
	public String welcome() {
		return " (<h2> Hello World </h2>)";
	}

}
