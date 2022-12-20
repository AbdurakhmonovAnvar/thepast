package uz.anvar.thepast.info.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class InfoDto {

    private String title;

    private String body;

    private String author;

    private String image;

    private LocalDateTime postedAt;

    private String part;

    private String hashtag;


}
