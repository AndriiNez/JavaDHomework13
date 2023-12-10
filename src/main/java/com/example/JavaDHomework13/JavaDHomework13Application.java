package com.example.JavaDHomework13;

import com.example.JavaDHomework13.note.Note;
import com.example.JavaDHomework13.note.NoteService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class JavaDHomework13Application {
	private final NoteService noteService;
	public static void main(String[] args) {
		SpringApplication.run(JavaDHomework13Application.class, args);
	}
}
