package com.xyz.ekart.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.xyz.ekart.dto.AddStudentRequestDto;
import com.xyz.ekart.dto.GenericResponseDto;
import com.xyz.ekart.model.ClassRoom;
import com.xyz.ekart.model.Student;
import com.xyz.ekart.repository.ClassRoomRepository;
import com.xyz.ekart.repository.StudentRepository;

public class StudentService {

private static final Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	@Inject
	private StudentRepository studentRepository;
	
	@Inject 
	private ClassRoomRepository classRoomRepository;

	public CompletableFuture<GenericResponseDto> addStudent(AddStudentRequestDto addStudentRequestDto){
	
		
		GenericResponseDto genericResponseDto = new GenericResponseDto();
		genericResponseDto.setResponseCode("400");
		genericResponseDto.setStatus("Failure");
		genericResponseDto.setErrorCode("ADD_STUDENT");
		genericResponseDto.setErrorMessage("unable to process your request");
		
		CompletableFuture<GenericResponseDto> future = new CompletableFuture<GenericResponseDto>();
		
		try {
			
			Student student = new Student();
			
			Long classRoomSeqId = studentRepository.getSeq("class_"+addStudentRequestDto.getClassRoomId()+"_seq");
			
			ClassRoom classRoom=classRoomRepository.findById(addStudentRequestDto.getClassRoomId());
			
			BeanUtils.copyProperties(addStudentRequestDto, student);

			student.setClassRoomSeqId(classRoomSeqId);
			
			long capacity = classRoom.getCapacity();
			long divisions = classRoom.getTotalDivisions();
			
			if(classRoomSeqId>(capacity*divisions)) {
				genericResponseDto.setErrorMessage("Class Room is full . no space left");
				future.complete(genericResponseDto);
				return future;
			}else {
				
				long divisionId=0;
				
				if(classRoomSeqId%capacity!=0) {
					divisionId+=1;
				}
				divisionId+=classRoomSeqId/capacity;
				
				char division = (char) ('A'+divisionId-1);
				
				student.setDivision(String.valueOf(division));
				student.setClassRoomId(classRoom);
				studentRepository.save(student);
				
			}

			
			genericResponseDto.setResponseCode("200");
			genericResponseDto.setStatus("Success");
			genericResponseDto.setErrorCode(null);
			genericResponseDto.setErrorMessage(null);
			genericResponseDto.setResponseObj(student);
			future.complete(genericResponseDto);
			return future;
			
		}catch(Exception ex) {
			System.out.println("Exception occured in addStudent::"+ex);

			future.complete(genericResponseDto);
			return future;
		}
	}
	
	
public CompletableFuture<GenericResponseDto> getAllStudent(AddStudentRequestDto addStudentRequestDto){
	
		
		GenericResponseDto genericResponseDto = new GenericResponseDto();
		genericResponseDto.setResponseCode("400");
		genericResponseDto.setStatus("Failure");
		genericResponseDto.setErrorCode("GET_All_STUDENT");
		genericResponseDto.setErrorMessage("unable to process your request");
		
		CompletableFuture<GenericResponseDto> future = new CompletableFuture<GenericResponseDto>();
		
		try {
			
			List<Student> studentList =studentRepository.getAllStudent(addStudentRequestDto.getClassRoomId());
			

			
			
			genericResponseDto.setResponseCode("200");
			genericResponseDto.setStatus("Success");
			genericResponseDto.setErrorCode(null);
			genericResponseDto.setErrorMessage(null);
			genericResponseDto.setResponseObj(studentList);
			future.complete(genericResponseDto);
			return future;
			
		}catch(Exception ex) {
			System.out.println("Exception occured in getAllStudent::"+ex);

			future.complete(genericResponseDto);
			return future;
		}
	}
	
}
