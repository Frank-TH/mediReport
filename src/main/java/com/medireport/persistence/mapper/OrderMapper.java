package com.medireport.persistence.mapper;

import com.medireport.domain.Order;
import com.medireport.persistence.entity.Pedido;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DetailMapper.class})
public interface OrderMapper {
    @Mappings({
            @Mapping(source = "idPedido", target = "orderId"),
            @Mapping(source = "idAsesor", target = "adviser"),
            @Mapping(source = "idPaciente", target = "patient"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "examenes", target = "exams")
    })
    Order toOrder(Pedido pedido);

    List<Order> toOrder(List<Pedido> pedidos);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "asesor", ignore = true),
            @Mapping(target = "paciente", ignore = true)
    })
    Pedido toPedido(Order order);

}
