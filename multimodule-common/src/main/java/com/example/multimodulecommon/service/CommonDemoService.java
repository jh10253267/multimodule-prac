package com.example.multimodulecommon.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommonDemoService {
	public String commonService() {
		return "commonService";
	}
}
