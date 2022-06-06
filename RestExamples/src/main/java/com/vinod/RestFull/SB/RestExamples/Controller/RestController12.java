package com.vinod.RestFull.SB.RestExamples.Controller;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController12 
{
	@GetMapping("/hai")
	public String wishes()
	{
		return "hai----------------------------------";
	}
	//http://localhost:9090/name?name1=vinod
	@GetMapping("/name")
	public String empName(@QueryParam ("name1")String name1)
	{
		return "hai----------------------------------"+name1;
	}
	//http://localhost:9090/name1?name1=vinod&name2=Dhatri
	@GetMapping("/name1")
	public String empName1(@QueryParam ("name1")String name1,@QueryParam ("name2")String name2)
	{
		return "hai----------------------------------"+name1+" ---------------------"+name2;
	}

}
