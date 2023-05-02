package com.kh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

//메인페이지 이동, 상품 검색 등의 요청 처리 컨트롤러

@Controller // 이 클래스가 컨트롤러 역할을 한다고 선언
@Log4j // 로그 기록을 남기기 위한 선언, log로 사용
public class BookController {

	//메인 페이지 이동 (RequestMapping value="매핑" method= 요청 정의
		@RequestMapping(value = "/main", method = RequestMethod.GET)
		public void mainPageGET() {
			
			log.info("메인 페이지 진입");
			
		}
}
