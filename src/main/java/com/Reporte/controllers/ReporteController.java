package com.Reporte.controllers;

import com.Reporte.dto.ReporteDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @GetMapping("/ventas")
    public ReporteDTO ventas(@RequestParam String fechaInicio, @RequestParam String fechaFin) {
        // Lógica real vendrá de microservicio Ventas (acá es simulado)
        ReporteDTO r = new ReporteDTO();
        r.setTipo("Ventas");
        r.setDescripcion("Reporte de ventas del periodo");
        r.setTotal(152938.0);
        return r;
    }

    @GetMapping("/inventario")
    public ReporteDTO inventario() {
        ReporteDTO r = new ReporteDTO();
        r.setTipo("Inventario");
        r.setDescripcion("Resumen de stock actual");
        r.setTotal(8743.0);
        return r;
    }
}
