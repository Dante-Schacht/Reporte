package com.Reporte.controllers;

import com.Reporte.dto.ReporteDTO;
import com.Reporte.assembler.ReporteAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/reportes")
@RequiredArgsConstructor
public class ReporteController {

    private final ReporteAssembler assembler;

    @GetMapping("/ventas")
    public EntityModel<ReporteDTO> ventas(@RequestParam String fechaInicio, @RequestParam String fechaFin) {
        // Simulación
        ReporteDTO r = new ReporteDTO();
        r.setTipo("Ventas");
        r.setDescripcion("Reporte de ventas del periodo");
        r.setTotal(152938.0);

        return assembler.toModel(r);
    }

    @GetMapping("/inventario")
    public EntityModel<ReporteDTO> inventario() {
        ReporteDTO r = new ReporteDTO();
        r.setTipo("Inventario");
        r.setDescripcion("Resumen de stock actual");
        r.setTotal(8743.0);

        return assembler.toModel(r);
    }
}
