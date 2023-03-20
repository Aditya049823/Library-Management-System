package com.Springproject.LibraryManagementSystem.Entity;

import com.Springproject.LibraryManagementSystem.Enum.Cardstatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CardId;

    private String validity;

    @Enumerated(EnumType.STRING)
    private Cardstatus cardstatus;

    @CreationTimestamp
    private Date creationDate;

    @UpdateTimestamp
    private Date updationDate;

    @OneToOne
    @JoinColumn
    Student student;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Transaction>transactions=new ArrayList<>();

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Book>books=new ArrayList<>();

}
