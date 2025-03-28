package dev.tiagowakanda.produdoro.pomodo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ConfiguracaoPadraoPomodoro")
@Getter
public class ConfiguracaoPadrao {

    private static final String CODIGO_DEFAULT = "DEFAULT";
    @Builder.Default
    @MongoId(targetType = FieldType.STRING)
    private String codigo = CODIGO_DEFAULT;
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;

}
