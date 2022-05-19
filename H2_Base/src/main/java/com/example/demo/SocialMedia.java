package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@Table(name="SOCIALMEDIAS")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mediasID")
    private Long id;

    private String facebookLink;
    private String instagramLink;
    private String whatsappLink;

    public SocialMedia(String facebookLink, String instagramLink, String whatsappLink) {
        this.facebookLink = facebookLink;
        this.instagramLink = instagramLink;
        this.whatsappLink = whatsappLink;
    }

    public SocialMedia()
    {

    }
}
