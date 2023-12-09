package com.smd.todeolho.PublicWorksImages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PublicWorksImagesService {
    @Autowired
    private PublicWorksImagesRepository publicWorksImagesRepository;

    public PublicWorksImages createImage(PublicWorksImages image) {
        return publicWorksImagesRepository.save(image);
    }

    public Optional<PublicWorksImages> getImageById(Long publicWorksId, Long imageId) {
        return publicWorksImagesRepository.findById(new PublicWorksImagesId(publicWorksId, imageId));
    }

    public void deleteImage(Long publicWorksId, Long imageId) {
        publicWorksImagesRepository.deleteById(new PublicWorksImagesId(publicWorksId, imageId));
    }
}