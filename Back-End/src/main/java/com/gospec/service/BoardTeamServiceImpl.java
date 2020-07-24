package com.gospec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gospec.domain.BoardTeamDto;
import com.gospec.mapper.BoardTeamMapper;

@Service
public class BoardTeamServiceImpl implements BoardTeamService {

	@Autowired
	private BoardTeamMapper boardTeamMapper;

	@Override
	public List<BoardTeamDto> findByContestNo(int contestNo, int startIndex, int perPageNum) {
		return boardTeamMapper.findByContestNo(contestNo, startIndex, perPageNum);
	}

	@Override
	public BoardTeamDto viewDetails(int contestNo) {
		return boardTeamMapper.viewDetails(contestNo);
	}

	@Override
	public int save(BoardTeamDto dto) {
		return boardTeamMapper.save(dto);
	}

	@Override
	public int update(BoardTeamDto dto) {
		return boardTeamMapper.update(dto);
	}

	@Override
	public int delte(BoardTeamDto dto) {
		return boardTeamMapper.delte(dto);
	}

	@Override
	public int getCountByContestNo(int contestNo) {
		return boardTeamMapper.getCountByContestNo(contestNo);
	}

}
