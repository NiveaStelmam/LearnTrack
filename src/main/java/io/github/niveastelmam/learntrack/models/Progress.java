package io.github.niveastelmam.learntrack.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_progress")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer time; // tempo atual do vídeo em segundos

    private Boolean completed;

//    @OneToOne
//    @JoinColumn(name = "module_id")
//    private Module module;
}
