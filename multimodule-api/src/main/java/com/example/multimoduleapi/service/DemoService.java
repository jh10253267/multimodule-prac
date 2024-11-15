package com.example.multimoduleapi.service;

import org.springframework.stereotype.Service;

import com.example.multimodulecommon.enums.CodeEnum;
import com.example.multimodulecommon.service.CommonDemoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoService {
	private final CommonDemoService commonDemoService;
	public String save() {
		System.out.println(CodeEnum.SUCCESS.getCode());
		System.out.println(commonDemoService.commonService());
		return "save";
	}
	public String find() {
		return "find";
	}
}
