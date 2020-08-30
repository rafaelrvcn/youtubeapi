package com.videos.youtubeapi.resources;

import com.videos.youtubeapi.models.Comments;
import com.videos.youtubeapi.models.Video;
import com.videos.youtubeapi.repository.CommentsRepository;
import com.videos.youtubeapi.repository.VideoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Youtube")
@CrossOrigin(origins = "*")
public class VideoResource {

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    CommentsRepository commentsRepository;

    @GetMapping("/videos")
    @ApiOperation("Return a video list")
    public List<Video> listVideos(){
        return videoRepository.findAll();
    }

    @GetMapping("/video/{name}")
    @ApiOperation("Return a single video when search by name")
    public Video listVideoSearch(@PathVariable(value = "name") String name){
        return videoRepository.findByName(name);
    }

    @PostMapping("/video")
    @ApiOperation("Save a new video")
    public Video saveVideo(@RequestBody Video video) {
        return videoRepository.save(video);
    }

    @DeleteMapping("/video")
    @ApiOperation("Delete a video")
    public void deleteVideo(@RequestBody Video video) {
        videoRepository.delete(video);
    }

    @PutMapping("/video")
    @ApiOperation("Update a video")
    public Video updateVideo(@RequestBody Video video) {
        return videoRepository.save(video);
    }

    @PostMapping("/video/comment")
    @ApiOperation("Save a new comment")
    public Comments saveComment(@RequestBody Comments comments) {
        return commentsRepository.save(comments);
    }

    @DeleteMapping("/video/comment")
    @ApiOperation("Delete a comment")
    public void deleteComment(@RequestBody Comments comments) {
        commentsRepository.delete(comments);
    }
}
