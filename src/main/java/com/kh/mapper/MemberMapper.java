package com.kh.mapper;

import com.kh.model.MemberVO;

public interface MemberMapper {

	// 회원가입
	public void memberJoin(MemberVO member);
	
	public int idCheck(String memberId);
}
