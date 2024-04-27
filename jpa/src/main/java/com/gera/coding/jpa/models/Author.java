package com.gera.coding.jpa.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {

    // @SequenceGenerator(
    //     name = "author_sequence",
    //     sequenceName = "author_sequence",
    //     allocationSize = 1
    // )
    // @TableGenerator(
    //     name = "author_id_gen",
    //     table = "id_generator",
    //     pkColumnName = "id_name",
    //     valueColumnName = "id_value",
    //     allocationSize = 1
    // )
    

    @Column(
        name = "f_name",
        length = 35
    )
    private String firstName;

    private String lastName;

    @Column(
        unique = true,
        nullable = false
    )
    private String email;
    private Integer age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;


}
