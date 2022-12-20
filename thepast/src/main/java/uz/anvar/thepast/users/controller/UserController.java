package uz.anvar.thepast.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.anvar.thepast.users.dto.UserDto;
import uz.anvar.thepast.users.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getId(@PathVariable("id") Integer id){
        UserDto result = service.getId(id);
        return ResponseEntity.ok(result);

    }
    @PostMapping
    public ResponseEntity<?> postUser(@RequestBody UserDto dto){
        UserDto result = service.postUser(dto);
        return ResponseEntity.ok(result);
    }
}
