package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.MuseDevDAO;
import com.example.demo.service.MuseDevService;

@Controller
public class MuseDevController {

	private MuseDevService museDevService;

	@Autowired
	private MuseDevController(MuseDevService museDevService) {
		this.museDevService = museDevService;
	}

	@RequestMapping(value = "staticAnalysisTool", method = RequestMethod.POST)
	public ResponseEntity<?> postStaticAnalysisTool(@RequestBody String body) {

		MuseDevDAO museDevDAO = museDevService.museDevMainService(body);

		return new ResponseEntity<>(museDevDAO, HttpStatus.OK);
	}
}
