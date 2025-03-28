package dev.tiagowakanda.produdoro.area.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Document(collection = "Area")
public class Area {
    @Id
    private UUID idArea;
    private String nome;
    private String descricao;
    @Indexed
    private UUID idUsuario;

}
