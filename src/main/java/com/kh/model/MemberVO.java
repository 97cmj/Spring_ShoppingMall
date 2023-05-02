package com.kh.model;

import lombok.Data;

@Data
public class MemberVO {

	// 회원 id
	private String memberId;

	// 회원 비밀번호
	private String memberPw;

	// 회원 이름
	private String memberName;

	// 회원 이메일
	private String memberMail;

	// 회원 우편번호
	private String memberAddr1;

	// 회원 주소
	private String memberAddr2;

	// 회원 상세주소
	private String memberAddr3;

	// 관리자 구분(0:일반사용자, 1:관리자)
	private int adminCk;

	// 등록일자
	private int regDate;

	// 회원 돈
	private int money;

	// 회원 포인트
	private int point;

	public MemberVO() {
	}

	public MemberVO(String memberId, String memberPw, String memberName, String memberMail, String memberAddr1,
			String memberAddr2, String memberAddr3, int adminCk, int regDate, int money, int point) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberMail = memberMail;
		this.memberAddr1 = memberAddr1;
		this.memberAddr2 = memberAddr2;
		this.memberAddr3 = memberAddr3;
		this.adminCk = adminCk;
		this.regDate = regDate;
		this.money = money;
		this.point = point;
	}

}
