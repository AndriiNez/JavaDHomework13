package com.example.JavaDHomework13.generetId;

import org.springframework.stereotype.Service;

@Service
public class GeneretId {
    public long generet(Long size){
        return ++size;
    }
}

