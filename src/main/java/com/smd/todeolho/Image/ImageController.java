package com.smd.todeolho.Image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping
    public Image createImage(@RequestBody Image image) {
        return imageService.createImage(image);
    }

    @GetMapping("/{id}")
    public Optional<Image> getImageById(@PathVariable Long id) {
        return imageService.getImageById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable Long id) {
        imageService.deleteImage(id);
    }
}