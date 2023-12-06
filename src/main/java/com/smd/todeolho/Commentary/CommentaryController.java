package com.smd.todeolho.Commentary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commentaries")
public class CommentaryController {
    @Autowired
    private CommentaryService commentaryService;

    @PostMapping
    public Commentary createCommentary(@RequestBody Commentary commentary) {
        return commentaryService.createCommentary(commentary);
    }

    @GetMapping("/public-works/{id}")
    public List<Commentary> getAllCommentaries(@PathVariable("public-works") Long publicWorksId) {
        return commentaryService.getAllCommentaries(publicWorksId);
    }

    @GetMapping("/{id}")
    public Optional<Commentary> getCommentaryById(@PathVariable Long id) {
        return commentaryService.getCommentaryById(id);
    }

    @PutMapping("/{id}")
    public Commentary updateCommentary(@PathVariable Long id, @RequestBody Commentary commentaryDetails) {
        return commentaryService.updateCommentary(id, commentaryDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCommentary(@PathVariable Long id) {
        commentaryService.deleteCommentary(id);
    }
}