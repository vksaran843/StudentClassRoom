package com.xyz.ekart.controllers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.xyz.ekart.dto.AddStudentRequestDto;
import com.xyz.ekart.dto.GenericResponseDto;
import com.xyz.ekart.service.StudentService;

import play.db.ebean.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

public class StudentController extends Controller{

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Inject
	private StudentService studentService;
	
	@Transactional
	public CompletionStage<Result> addStudent(){
		try {
			JsonNode request = request().body().asJson();
			
			AddStudentRequestDto addStudentRequestDto = Json.fromJson(request, AddStudentRequestDto.class);
			
			return studentService.addStudent(addStudentRequestDto).thenApplyAsync(responseObj ->{
				return Results.ok(Json.toJson(responseObj));
			});
			
		}catch(Exception ex) {
			logger.error("Exception occured in addStudent::",ex);
			
			GenericResponseDto genericResponseDto = new GenericResponseDto();
			genericResponseDto.setResponseCode("400");
			genericResponseDto.setStatus("Failure");
			genericResponseDto.setErrorCode("ADD_STUDENT");
			genericResponseDto.setErrorMessage("unable to process your request");
			
			return CompletableFuture.completedFuture(Results.ok(Json.toJson(genericResponseDto)));

		}
	}
	
	@Transactional
	public CompletionStage<Result> getAllStudent(){
		try {
			JsonNode request = request().body().asJson();
			
			AddStudentRequestDto addStudentRequestDto = Json.fromJson(request, AddStudentRequestDto.class);
			
			return studentService.getAllStudent(addStudentRequestDto).thenApplyAsync(responseObj ->{
				return Results.ok(Json.toJson(responseObj));
			});
			
		}catch(Exception ex) {
			logger.error("Exception occured in getAllStudent::",ex);
			
			GenericResponseDto genericResponseDto = new GenericResponseDto();
			genericResponseDto.setResponseCode("400");
			genericResponseDto.setStatus("Failure");
			genericResponseDto.setErrorCode("GET_ALL_STUDENT");
			genericResponseDto.setErrorMessage("unable to process your request");
			
			return CompletableFuture.completedFuture(Results.ok(Json.toJson(genericResponseDto)));

		}
	}
}
