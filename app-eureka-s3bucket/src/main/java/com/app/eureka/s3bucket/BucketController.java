package com.app.eureka.s3bucket;

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
@RequestMapping("/v1/bucket")
public class BucketController {

	public BucketController() {
		getBuckets();
	}
	
	
	List<Bucket> list = new ArrayList<>();
	private List<Bucket> getBuckets() {
		list.add(new Bucket("Faiz", 26l));
		list.add(new Bucket("Akram", 26l));
		list.add(new Bucket("Rahul", 26l));
		return list;
	}

	@GetMapping("/list")
	public Map<String, Object> getBucketList() {
		Map<String, Object> map = new HashMap<>();
		map.put("bucket", list);
		return map;
	}
	
	@PostMapping("/add")
	public Map<String, Object> getBucketList(@RequestBody Bucket bucket) {
		Map<String, Object> map = new HashMap<>();
		list.add(bucket);
		map.put("bucket", bucket);
		map.put("msg", "Added Successfully");
		return map;
	}
}
