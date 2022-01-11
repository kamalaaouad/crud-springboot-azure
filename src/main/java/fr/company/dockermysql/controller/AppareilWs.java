package fr.company.dockermysql.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import fr.company.dockermysql.entities.Appareil;
import fr.company.dockermysql.service.AppareilService;

import java.util.List;

@RestController
@RequestMapping("/api/appareils")
public class AppareilWs  {

    @Autowired
    private AppareilService appareilService;
    @GetMapping("")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }
    @GetMapping("{id}")
    public Appareil findById(@PathVariable Long id) {
        return appareilService.findById(id);
    }
    @PostMapping("")
    public Appareil save(@RequestBody Appareil appareil) {
         return appareilService.save(appareil);
    }
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id) {
        appareilService.deleteById(id);
    }
    @PutMapping("{id}")
    public Appareil update(@PathVariable long id, @RequestBody Appareil appareil){
        return appareilService.update(id, appareil);
    }

}
