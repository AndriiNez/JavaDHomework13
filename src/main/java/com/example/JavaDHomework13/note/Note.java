package com.example.JavaDHomework13.note;

import lombok.Data;
import org.springframework.stereotype.Service;
@Data
@Service
public class Note {

    private Long id;

    private String title;

    private String content;
}
