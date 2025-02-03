package com.sesi.projeto.entities;

import com.sesi.projeto.dto.PagamentoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table ( name = "pagamento")
public class Pagamento {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;

    public Pagamento(Long id, Instant momento) {
        this.id = id;
        this.momento = momento;
    }

    public Pagamento() {
    }

    public Pagamento(PagamentoDTO dto){
        this.momento = dto.momento();
    }


    public Instant getMomento() {
        return momento;
    }

    public void setMomento(Instant momento) {
        this.momento = momento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
