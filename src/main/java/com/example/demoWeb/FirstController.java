package com.example.demoWeb;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello, World");
    }
    @GetMapping("/test/model")
    public ResponseEntity<Car> carResponseEntity(){
        return ResponseEntity.ok(new Car("wolwo", "xD5","Gigapremium"));
    }
    @GetMapping("/test/hello/{someValue}")
    public ResponseEntity<String> returnSomeValue(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);
    }
    @GetMapping("/test/hello")
    public ResponseEntity<String> returnParamValue(@RequestParam("reqParam") String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    @PostMapping("/test/model")
    public ResponseEntity<Car> createCar(@RequestBody CarRequest carRequest){
        Car car = new Car(carRequest.getBrand(),carRequest.getName(), carRequest.getSegment());
        return ResponseEntity.ok(car);
    }
}
