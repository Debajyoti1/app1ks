package com.debu.ms.app1;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private Environment env;

	@GetMapping("/")
	public HashMap<String, String> home() {
		// return "app1 from port "+env.getProperty("local.server.port");
		HashMap<String, String> a = new HashMap<String, String>();
		a.put("type", "app1");
		a.put("app1port", env.getProperty("local.server.port"));
		a.put("app1version", "v1");
		a.put("app1hostname", env.getProperty("HOSTNAME"));
		return a;
	}

}
