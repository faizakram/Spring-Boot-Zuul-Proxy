package com.app.eureka.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/client")
public class ClientController {

	public ClientController() {
		getBuckets();
	}
	
	
	List<Client> list = new ArrayList<>();
	private List<Client> getBuckets() {
		list.add(new Client("Faiz", 26l));
		list.add(new Client("Akram", 26l));
		list.add(new Client("Rahul", 26l));
		return list;
	}

	@GetMapping("/list")
	public Map<String, Object> getBucketList() {
		Map<String, Object> map = new HashMap<>();
		map.put("bucket", list);
		return map;
	}
	
	@PostMapping("/add")
	public Map<String, Object> getBucketList(@RequestBody Client client) {
		Map<String, Object> map = new HashMap<>();
		list.add(client);
		map.put("bucket", client);
		map.put("msg", "Added Successfully");
		return map;
	}
}
