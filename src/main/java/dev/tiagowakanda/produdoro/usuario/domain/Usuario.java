package dev.tiagowakanda.produdoro.usuario.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Document(collection = "Usuario")
public class Usuario {
    @Id
    private UUID idUsuario;
    @Email
    @Indexed
    private String email;
    private configuracaoUsuario configuracao;
    @Builder.Default
    private StatusUsuario status = StatusUsuario.FOCO;
    private Integer quantidadePomodorosPausaCurta = 0;
}
