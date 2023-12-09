package com.smd.todeolho.Commentary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentaryService {
    @Autowired
    private CommentaryRepository commentaryRepository;

    public Commentary createCommentary(Commentary commentary) {
        return commentaryRepository.save(commentary);
    }

    public List<Commentary> getAllCommentaries() {
        return commentaryRepository.findAll();
    }

    // public List<Commentary> getAllCommentaries(Long publicWorksId) {
    //     return commentaryRepository.findByPublicWorksId(publicWorksId);
    // }

    public Optional<Commentary> getCommentaryById(Long id) {
        return commentaryRepository.findById(id);
    }

    public Commentary updateCommentary(Long id, Commentary commentaryDetails) {
        Optional<Commentary> commentary = commentaryRepository.findById(id);
        if (commentary.isPresent()) {
            Commentary existingCommentary = commentary.get();
            existingCommentary.setText(commentaryDetails.getText());
            return commentaryRepository.save(existingCommentary);
        }
        return null;
    }

    public void deleteCommentary(Long id) {
        commentaryRepository.deleteById(id);
    }
}