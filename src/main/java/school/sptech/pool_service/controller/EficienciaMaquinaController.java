package school.sptech.pool_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import school.sptech.pool_service.entity.EficienciaMaquina;
import school.sptech.pool_service.repository.EficienciaMaquinaRepository;
import school.sptech.pool_service.service.EficienciaMaquinaService;

@Controller
@RequestMapping("/api/eficiencia-maquina")
public class EficienciaMaquinaController {

    private final EficienciaMaquinaService eficienciaMaquinaService;

    public EficienciaMaquinaController(EficienciaMaquinaService eficienciaMaquinaService) {
        this.eficienciaMaquinaService = eficienciaMaquinaService;
    }

    @PostMapping("/post")
    public ResponseEntity<EficienciaMaquina> inserirEficienciaMaquina() {
        EficienciaMaquina eficineciaInserida = eficienciaMaquinaService.inserirEficienciaMaquina();
        return ResponseEntity.status(HttpStatus.CREATED).body(eficineciaInserida);
    }
}
