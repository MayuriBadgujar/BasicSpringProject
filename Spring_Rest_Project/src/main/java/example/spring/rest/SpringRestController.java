package example.spring.rest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import book_library.entity.Book;

@RestController       //combines@Controller and @ResponseBody
public class SpringRestController {
@GetMapping("/doGreet")
public String getGreetingData() {
	return "Helllllo All !! Welcome to Spring REST";
}


@GetMapping("/showGreeting")
public Greeting getOneGreeting() {
	Greeting greetingObject=new Greeting("Happy New Year!!!",LocalDate.of(2025, 1,1));
	return greetingObject;
}

//http://localhost:9095/showAllGreetings
@GetMapping("/showAllGreetings")
public Collection<Greeting> getAllGreeting(){
	Greeting greetingObject1=new Greeting("Happy New Year!!!",LocalDate.of(2025, 1,1));
	Greeting greetingObject2=new Greeting("Bye Bye 2024!!!",LocalDate.of(2025, 12,31));
	Greeting greetingObject3=new Greeting("Mery Christmas!!!",LocalDate.of(2025, 12,25));
	Collection<Greeting> allGreetings=Arrays.asList(greetingObject1,greetingObject2,greetingObject3);
	return allGreetings;
}


}
