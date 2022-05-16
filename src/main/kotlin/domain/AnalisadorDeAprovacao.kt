package domain
import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {
    private lateinit var escolhecriterio : CriterioDeAprovacao

    fun defineCriterio(criterio: CriterioDeAprovacao) {
        this.escolhecriterio = criterio 
    }

    fun fechaBoletim(boletim: Boletim): BoletimFechado {
        val media
        val aprovacao

        media = escolhecriterio. media(boletim)
        aprovacao = escolhecriterio.aprovacao(boletim)
 
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, media, aprovacao)
    }

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------

}