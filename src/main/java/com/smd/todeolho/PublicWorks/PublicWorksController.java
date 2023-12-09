package com.smd.todeolho.PublicWorks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/public-works")
public class PublicWorksController {
    @Autowired
    private PublicWorksService publicWorksService;

    @PostMapping
    public PublicWorks createPublicWorks(@RequestBody PublicWorks publicWorks) {
        return publicWorksService.createPublicWorks(publicWorks);
    }

    @GetMapping
    public List<PublicWorks> getAllPublicWorks() {
        return publicWorksService.getAllPublicWorks();
    }

    @GetMapping("/{id}")
    public Optional<PublicWorks> getPublicWorksById(@PathVariable Long id) {
        return publicWorksService.getPublicWorksById(id);
    }

    @PutMapping("/{id}")
    public PublicWorks updatePublicWorks(@PathVariable Long id, @RequestBody PublicWorks publicWorksDetails) {
        return publicWorksService.updatePublicWorks(id, publicWorksDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePublicWorks(@PathVariable Long id) {
        publicWorksService.deletePublicWorks(id);
    }
}