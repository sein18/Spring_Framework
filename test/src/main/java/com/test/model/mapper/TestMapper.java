package com.test.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.test.model.dto.TestDto;

@Mapper
public interface TestMapper {
	
	@Insert(" INSERT INTO TEST_DB VALUES(#{name},#{age},#{addr}) ")
	int insert(TestDto dto);
	
	@Select(" SELECT * FROM TEST_DB WHERE NAME=#{name} ")
	TestDto selectOne(String name);
	
}
