package com.Reporte.assembler;

import com.Reporte.controllers.ReporteController;
import com.Reporte.dto.ReporteDTO;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class ReporteAssembler implements RepresentationModelAssembler<ReporteDTO, EntityModel<ReporteDTO>> {

    @Override
    public EntityModel<ReporteDTO> toModel(ReporteDTO reporte) {
        EntityModel<ReporteDTO> model = EntityModel.of(reporte);

        if ("Ventas".equalsIgnoreCase(reporte.getTipo())) {
            model.add(linkTo(methodOn(ReporteController.class).ventas("2024-01-01", "2024-12-31")).withSelfRel());
            model.add(linkTo(methodOn(ReporteController.class).inventario()).withRel("inventario"));
        } else if ("Inventario".equalsIgnoreCase(reporte.getTipo())) {
            model.add(linkTo(methodOn(ReporteController.class).inventario()).withSelfRel());
            model.add(linkTo(methodOn(ReporteController.class).ventas("2024-01-01", "2024-12-31")).withRel("ventas"));
        }

        return model;
    }
}
