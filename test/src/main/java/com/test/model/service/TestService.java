package com.test.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.dto.TestDto;
import com.test.model.mapper.TestMapper;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	
	public int insert(TestDto dto) {
		return testMapper.insert(dto);
	}
	public TestDto selectOne(String name) {
		return testMapper.selectOne(name);
	}
}
