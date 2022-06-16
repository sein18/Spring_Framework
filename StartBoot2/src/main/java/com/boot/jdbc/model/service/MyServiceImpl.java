package com.boot.jdbc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jdbc.model.dto.MyDto;
import com.boot.jdbc.model.mapper.MyBoardMapper;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	private MyBoardMapper myBoardMapper;
	@Override
	public List<MyDto> selectList() {
		return myBoardMapper.selectList();
	}

	@Override
	public MyDto selectOne(int myno) {
		return myBoardMapper.selectOne(myno);
	}

	@Override
	public int insert(MyDto dto) {
		return myBoardMapper.insert(dto);
	}

	@Override
	public int upgrade(MyDto dto) {
		return myBoardMapper.update(dto);
	}

	@Override
	public int delete(int myno) {
		return 0;
	}

}
