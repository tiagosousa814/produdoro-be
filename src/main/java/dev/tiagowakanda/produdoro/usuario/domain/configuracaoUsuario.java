package dev.tiagowakanda.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter
public class configuracaoUsuario {
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;

}
