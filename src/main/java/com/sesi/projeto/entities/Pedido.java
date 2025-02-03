package com.sesi.projeto.entities;

import com.sesi.projeto.dto.PedidoDTO;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table (name = "pedido")
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    private StatusDoPedido status;

    public Pedido(Long id, Instant momento, StatusDoPedido status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Pedido() {
    }

    public Pedido(PedidoDTO dtopedido){
        this.momento = dtopedido.momento();
        this.status = dtopedido.status();
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
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
