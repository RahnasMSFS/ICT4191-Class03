package lk.ac.vau.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmaticOperations {
    
	@GetMapping("/Addition/{n1}/{n2}")
	public double add(@PathVariable("n1") double num1,@PathVariable("n2") double num2)
	{
		return num1+num2;
	}
	
	@GetMapping("/Subtraction/{n1}/{n2}")
	public double sub(@PathVariable("n1") double n1,@PathVariable("n2") double n2)
	{
		return n1-n2;
	}
	
	@GetMapping("/Multiplication/{n1}/{n2}")
	public double mul(@PathVariable("n1") double n1,@PathVariable("n2") double n2)
	{
		return n1*n2;
	}
	
	@GetMapping("/Division/{n1}/{n2}")
	public double div(@PathVariable("n1") double n1,@PathVariable("n2") double n2)
	{
		return n1/n2;
	}
}
