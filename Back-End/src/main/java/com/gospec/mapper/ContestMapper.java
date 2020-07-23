package com.gospec.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gospec.domain.ContestDto;

@Mapper
public interface ContestMapper {

	public List<ContestDto> findByDurationAll(String startDate, String endDate);
	public List<ContestDto> findAll();
	public List<ContestDto> findByBookMarkWithDurationAndEmail(String email, String startDate, String endDate);
	public List<ContestDto> findByCategory(String type, int startPage, int perPageNum);
	public int getCountByCategory(@Param("type") String type);
}
