package com.zerotohero.entity;


import com.zerotohero.enums.WordArtikel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Where(clause = "is_deleted=false")
@Table(name = "names")
public class Name extends BaseEntity{

    private String word;
    private String description;
    private WordArtikel wordArtikel;
}
