package com.zerotohero.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "is_deleted=false")
@Table(name="users")
public class User extends BaseEntity{


    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private Boolean enabled;
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;
}
