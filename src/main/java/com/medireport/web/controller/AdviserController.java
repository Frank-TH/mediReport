package com.medireport.web.controller;

import com.medireport.domain.Adviser;
import com.medireport.domain.service.AdviserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advisers")
public class AdviserController {

    @Autowired
    private AdviserService adviserService;

    @GetMapping("/all")
    public ResponseEntity<List<Adviser>> getAll() {
        return new ResponseEntity<>(adviserService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Adviser> getExam(@PathVariable("id") String adviserId) {
        return adviserService.getAdviser(adviserId).
                map(adviser -> new ResponseEntity<>(adviser, HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Adviser> save(@RequestBody Adviser adviser) {
        return new ResponseEntity<>(adviserService.save(adviser), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String adviserId) {
        if (adviserService.delete(adviserId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
