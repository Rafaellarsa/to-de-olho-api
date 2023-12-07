package com.smd.todeolho.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smd.todeolho.Image.Image;
import com.smd.todeolho.Image.ImageService;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private ImageService imageService;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User userDetails) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setUsername(userDetails.getUsername());
            existingUser.setEmail(userDetails.getEmail());           existingUser.setPassword(userDetails.getPassword());    

            return userRepository.save(existingUser);
        }
        return null;
    }

    public User updatePhoto(Long id, Image image) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            Long oldPhotoId = existingUser.getPhoto();
            Image newImage = imageService.createImage(image);
            existingUser.setPhoto(newImage.getId()); 
            imageService.deleteImage(oldPhotoId);

            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}