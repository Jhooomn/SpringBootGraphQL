package com.ochiengolanga.tuts.bootgraphql.domain;

//import com.ochiengolanga.tuts.bootgraphql.domain.dto.Joke;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Feed {
    @Id
    @Column(name="feed_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="feed_title", nullable = true)
    private String title;

    @Column(length = 30000, name="feed_description", nullable = true)
    private String description;

    @Column(name="feed_itemCount", nullable = true)
    private int itemCount;

    @Column(name="feed_pubdate", nullable = true)
    private String pubdate;

    @Column(name="feed_image", nullable = true)
    private String image;

    public Feed(String title, String description, int itemCount, String pubdate, String image) {
        this.title = title;
        this.description = description;
        this.itemCount = itemCount;
        this.pubdate = pubdate;
        this.image = image;
    }
}
