package com.SpringdataJpa.SpringdataJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data  //it automatically generates getters and setters ,toString(),equals() and hashcode() for all fields
@AllArgsConstructor
@NoArgsConstructor //creates zero parameterized constructor
@Builder //create entity or DTO objects in a clean and readable way,but entities must have no-args constructor to
//satisfy jpa requirements
@Table(uniqueConstraints = @UniqueConstraint(
        name="name_constraint",
        columnNames = "studentName"

  )
)

public class Student {

    @Id
    //to increase the id and some other column for that instead of auto_increment we can use this sequence generator
    //and generatedvalue annotation ,first we can create a generator by using sequencegenerator annotation and
    //generate value using generate value annotation
    @SequenceGenerator(
            name = "sequence_name", //generator_name
            sequenceName = "sequence_name",
            allocationSize = 1


    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_name")
    Long studentId;
    @Column(name="studentName",
            nullable = false)
    String studentName;
    String studentCity;

  @Embedded
    private Marks marks;


}
