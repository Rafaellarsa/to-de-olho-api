package com.smd.todeolho.PublicWorks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicWorksService {
    @Autowired
    private PublicWorksRepository publicWorksRepository;

    public PublicWorks createPublicWorks(PublicWorks publicWorks) {
        return publicWorksRepository.save(publicWorks);
    }

    public List<PublicWorks> getAllPublicWorks() {
        return publicWorksRepository.findAll();
    }

    public Optional<PublicWorks> getPublicWorksById(Long id) {
        return publicWorksRepository.findById(id);
    }

    public PublicWorks updatePublicWorks(Long id, PublicWorks publicWorksDetails) {
        Optional<PublicWorks> publicWorks = publicWorksRepository.findById(id);
        if (publicWorks.isPresent()) {
            PublicWorks existingPublicWorks = publicWorks.get();
            existingPublicWorks.setName(publicWorksDetails.getName());
            // existingPublicWorks.setEmail(publicWorksDetails.getEmail());
            return publicWorksRepository.save(existingPublicWorks);
        }
        return null;
    }

    public void deletePublicWorks(Long id) {
        publicWorksRepository.deleteById(id);
    }
}