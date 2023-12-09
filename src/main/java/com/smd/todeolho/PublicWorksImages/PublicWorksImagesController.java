package com.smd.todeolho.PublicWorksImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/public-works-images")
public class PublicWorksImagesController {
    @Autowired
    private PublicWorksImagesService publicWorksImagesService;

    @PostMapping
    public PublicWorksImages createImage(@RequestBody PublicWorksImages image) {
        return publicWorksImagesService.createImage(image);
    }

    @GetMapping("/public-works/{publicWorksId}/image/{imageId}")
    public Optional<PublicWorksImages> getImageById(@PathVariable Long publicWorksId, Long imageId) {
        return publicWorksImagesService.getImageById(publicWorksId, imageId);
    }

    @DeleteMapping("/public-works/{publicWorksId}/image/{imageId}")
    public void deleteImage(@PathVariable Long publicWorksId, Long imageId) {
        publicWorksImagesService.deleteImage(publicWorksId, imageId);
    }
}