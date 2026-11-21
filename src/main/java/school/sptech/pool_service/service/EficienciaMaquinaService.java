package school.sptech.pool_service.service;

import org.springframework.stereotype.Service;
import school.sptech.pool_service.controller.EficienciaMaquinaController;
import school.sptech.pool_service.entity.EficienciaMaquina;
import school.sptech.pool_service.enums.Status;
import school.sptech.pool_service.repository.EficienciaMaquinaRepository;

@Service
public class EficienciaMaquinaService {
    private EficienciaMaquinaRepository eficienciaMaquinaRepository;
    private EficienciaMaquinaController eficienciaMaquinaController;

    public EficienciaMaquinaService() {
    }

    private EficienciaMaquina generateRandomEficiencyData() {
        Integer statusBinario = (int) Math.random() * (1 - 0) + 0;
        Integer hashrate = (int) Math.random() * (1 - 0) + 0;
        Integer sharesAceitos = (int) Math.random() * (1 - 0) + 0;
        Integer sharesRejeitados = (int) Math.random() * (1 - 0) + 0;
        Integer sharesStale = (int) Math.random() * (1 - 0) + 0;

        Status status = Status.fromCodigo(statusBinario);
        return new EficienciaMaquina(
                1L,
                status,
                hashrate,
                sharesAceitos,
                sharesRejeitados,
                sharesStale
        );
    }

    public EficienciaMaquina inserirEficienciaMaquina() {
        return eficienciaMaquinaRepository.save(generateRandomEficiencyData());
    }
}
