package uz.anvar.thepast.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.anvar.thepast.info.dto.InfoDto;
import uz.anvar.thepast.info.model.Info;
import uz.anvar.thepast.info.service.InfoService;

@RestController
@RequestMapping("/api/v1/info")
public class InfoController {

    @Autowired
    private InfoService service;


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Integer id){
        InfoDto result = service.get(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<?> postInfo(@RequestBody InfoDto dto){
        InfoDto result = service.postInfo(dto);
        return ResponseEntity.ok(result);
    }

}
