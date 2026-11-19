package com.SpringdataJpa.SpringdataJpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
@AttributeOverrides(@AttributeOverride(
        name = "markOne",
        column=@Column(name="studentFirstSemMarks")
))
public class Marks {
    String markOne;
    String studentSecondSemMarks;
    String studentThirdSemMarks;
}
