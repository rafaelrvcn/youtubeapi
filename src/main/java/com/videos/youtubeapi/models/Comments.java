package com.videos.youtubeapi.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="TB_COMMENTS")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long id_video;

    @NotBlank
    private String name;

    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate date;

    @NotBlank
    @Lob
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_video() {
        return id_video;
    }

    public void setId_video(Long id_video) {
        this.id_video = id_video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
