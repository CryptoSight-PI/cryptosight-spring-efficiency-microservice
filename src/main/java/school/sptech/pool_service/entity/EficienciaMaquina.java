package school.sptech.pool_service.entity;

import jakarta.persistence.*;
import school.sptech.pool_service.enums.Status;

import java.time.LocalDateTime;
import java.util.EnumMap;

@Entity
@Table(name = "eficiencia_maquina")
public class EficienciaMaquina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long id_maquina;
    private Status status;
    private Integer hashrate;
    private Integer shares_aceitos;
    private Integer shares_rejeitados;
    private Integer shares_stale;
    private LocalDateTime timestamp_medicao;

    public EficienciaMaquina(Long id_maquina, Status status, Integer hashrate, Integer shares_aceitos, Integer shares_rejeitados, Integer shares_stale) {
        this.id_maquina = id_maquina;
        this.status = status;
        this.hashrate = hashrate;
        this.shares_aceitos = shares_aceitos;
        this.shares_rejeitados = shares_rejeitados;
        this.shares_stale = shares_stale;
        this.timestamp_medicao = LocalDateTime.now();
    }

    public Long getId_maquina() {
        return id_maquina;
    }

    public LocalDateTime getTimestamp_medicao() {
        return timestamp_medicao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getHashrate() {
        return hashrate;
    }

    public void setHashrate(Integer hashrate) {
        this.hashrate = hashrate;
    }

    public Integer getShares_aceitos() {
        return shares_aceitos;
    }

    public void setShares_aceitos(Integer shares_aceitos) {
        this.shares_aceitos = shares_aceitos;
    }

    public Integer getShares_rejeitados() {
        return shares_rejeitados;
    }

    public void setShares_rejeitados(Integer shares_rejeitados) {
        this.shares_rejeitados = shares_rejeitados;
    }

    public Integer getShares_stale() {
        return shares_stale;
    }

    public void setShares_stale(Integer shares_stale) {
        this.shares_stale = shares_stale;
    }
}
