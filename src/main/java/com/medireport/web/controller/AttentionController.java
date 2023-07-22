package com.medireport.web.controller;

import com.medireport.domain.Attention;
import com.medireport.domain.service.AttentionService;
import com.medireport.domain.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attentions")
public class AttentionController {

    @Autowired
    AttentionService attentionService;


    @GetMapping("/all")
    public ResponseEntity<List<Attention>> getAll() {
        return new ResponseEntity<>(attentionService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attention> getAttention(@PathVariable("id") int attentionId) {
        return attentionService.getAttention(attentionId).
                map(attention -> new ResponseEntity<>(attention, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/adviser/{idAdviser}")
    public ResponseEntity<List<Attention>> getByAdviser(@PathVariable("idAdviser") String adviserId) {
        return attentionService.getByAdviser(adviserId).
                map(attentions -> new ResponseEntity<>(attentions, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Attention> save(Attention attention) {
        return new ResponseEntity<>(attentionService.save(attention), HttpStatus.CREATED);
    }


}
