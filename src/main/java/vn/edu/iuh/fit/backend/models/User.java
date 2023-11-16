package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private long id;

  @Column(length = 50)
  private String firstName;

  @Column(length = 50)
  private String middleName;

  @Column(length = 50)
  private String lastName;

  @Column(length = 15)
  private String mobile;

  @Column(length = 50, unique = true)
  private String email;

  @Column(length = 32, nullable = false)
  private String passwordHash;

  @Column(nullable = false)
  private Instant registeredAt;

  @Column(nullable = false)
  private Instant lastLogin;

  @Lob
  @Column(columnDefinition = "text")
  private String intro;

  @Lob
  @Column(columnDefinition = "text")
  private String profile;

  @OneToMany(mappedBy = "author")
  private Set<Post> posts = new LinkedHashSet<>();

  @OneToMany(mappedBy = "user")
  private Set<PostComment> comments = new LinkedHashSet<>();

  public User(String firstName, String middleName, String lastName, String mobile, String email,
      String passwordHash, Instant registeredAt, Instant lastLogin, String intro, String profile) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.mobile = mobile;
    this.email = email;
    this.passwordHash = passwordHash;
    this.registeredAt = registeredAt;
    this.lastLogin = lastLogin;
    this.intro = intro;
    this.profile = profile;
  }
}
