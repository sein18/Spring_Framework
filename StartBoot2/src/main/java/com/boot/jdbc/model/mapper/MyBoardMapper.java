package com.boot.jdbc.model.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.boot.jdbc.model.dto.MyDto;

import java.util.List;

@Mapper
public interface MyBoardMapper {

	@Select(" SELECT * FROM MYBOARD ORDER BY MYNO DESC ")
	List<MyDto> selectList();
	
	@Select(" SELECT * From MYBOARD WHERE MYNO = #{myno} ")
	MyDto selectOne(int myno);
	
	@Insert(" INSERT INTO MYBOARD VALUES(NULL,#{myname}, #{mytitle}, #{mycontent}, NOW()) ")
	int insert(MyDto dto);
	
	@Update(" UPDATE MYBOARD SET MYTITLE = #{mytitle}, MYCONTENT = #{mycontent} WHERE MYNO = #{myno} ")  
	int update(MyDto dto);
}
