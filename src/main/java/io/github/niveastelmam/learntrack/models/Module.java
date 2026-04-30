package io.github.niveastelmam.learntrack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_module")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer moduleOrder;

    private String videoUrl;

    private String pdfUrl;

    private Integer duration; // duração em segundos

//    @ManyToOne
//    @JoinColumn(name = "course_id")
//    private Course course;
}
