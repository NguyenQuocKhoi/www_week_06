package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private long id;

  @ManyToOne
  @JoinColumn(name = "authorId", nullable = false)
  private User author;

  @ManyToOne
  @JoinColumn(name = "parentId")
  private Post parent;

  @Column(length = 75, nullable = false)
  private String title;

  @Column(length = 100)
  private String metaTitle;

  @Lob
  @Column(columnDefinition = "text")
  private String summary;

  @Column(name = "published", nullable = false)
  private boolean published;

  @Column(name = "createdAt", nullable = false)
  private Instant createdAt;

  @Column(name = "updatedAt")
  private Instant updatedAt;
  @Column(name = "publishedAt")
  private Instant publishedAt;
  @Lob
  @Column(name = "content", columnDefinition = "text")
  private String content;

  @OneToMany(mappedBy = "parent")
  private Set<Post> posts = new LinkedHashSet<>();

  @OneToMany(mappedBy = "post")
  private Set<PostComment> postComments = new LinkedHashSet<>();

  public Post(User author, Post parent, String title, String metaTitle, String summary, Boolean published, Instant createdAt, Instant updatedAt, Instant publishedAt, String content) {
    this.author = author;
    this.parent = parent;
    this.title = title;
    this.metaTitle = metaTitle;
    this.summary = summary;
    this.published = published;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.publishedAt = publishedAt;
    this.content = content;
  }
}
