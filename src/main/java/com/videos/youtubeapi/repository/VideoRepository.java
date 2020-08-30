package com.videos.youtubeapi.repository;

import com.videos.youtubeapi.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {

    Video findByName(String name);

}
