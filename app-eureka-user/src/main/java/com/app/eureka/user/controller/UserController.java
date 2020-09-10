package com.app.eureka.user.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	public UserController() {
		getUserList();
	}

	@Autowired
	private RestTemplate restTemplate;



	private List<User> list = new ArrayList<>();

	private List<User> getUserList() {
		list.add(new User("Faiz", 26l));
		list.add(new User("Akram", 26l));
		list.add(new User("Rahul", 26l));
		return list;
	}

	@GetMapping("/list")
	public Map<String, Object> getUsers() {
		Map<String, Object> map = new HashMap<>();
		map.put("users", list);
		return map;
	}

	@PostMapping("/add")
	public Map<String, Object> getBucketList(@RequestBody User user) {
		Map<String, Object> map = new HashMap<>();
		list.add(user);
		map.put("user", user);
		map.put("msg", "Added Successfully");
		return map;
	}

	@GetMapping("/userBucket")
	public Map<String, Object> getBucket() {
		ResponseEntity<Map<String, Object>> quoteResponse = restTemplate.exchange(
				"http://client-s3bucket/v1/bucket/list/", HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, Object>>() {
				});

		Map<String, Object> map = new HashMap<>();
		map.put("bucket", quoteResponse.getBody());
		return map;
	}

}
