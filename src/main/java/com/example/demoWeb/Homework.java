package com.example.demoWeb;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Homework {
    @GetMapping("/homework/{reqParam}")
    public ResponseEntity<String> homeworkPath(@PathVariable("reqParam") String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    @GetMapping("/homework")
    public ResponseEntity<String> homeworkMapping(@RequestParam("reqParam") String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    @DeleteMapping("/homework")
    public ResponseEntity<Void> deleteMapping(){
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping("/homework")
    public ResponseEntity<String> postMapping(@RequestBody String body){
        return ResponseEntity.ok(body);
    }
    @PutMapping("/homework/{reqParam}")

    public ResponseEntity<String> putMapping(@PathVariable("reqParam") String reqParam, @RequestBody String body){
        Map<String,String> resp = new HashMap<>();
        resp.put("params:", reqParam);
        resp.put("body", body);
        return ResponseEntity.ok(resp.toString());
    }
}
