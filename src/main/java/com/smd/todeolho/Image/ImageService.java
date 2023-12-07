package com.smd.todeolho.Image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public Image createImage(Image image) {
        return imageRepository.save(image);
    }

    public Optional<Image> getImageById(Long id) {
        return imageRepository.findById(id);
    }

    public void deleteImage(Long id) {
        imageRepository.deleteById(id);
    }
}