package uz.anvar.thepast.info.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("info"))
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String body;

    private String author;

    private String image;

    private LocalDateTime postedAt;

    private String part;

    private String hashtag;



}
