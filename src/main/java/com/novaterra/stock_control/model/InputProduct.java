package com.novaterra.stock_control.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ENTRADA_PRODUTOS")
public class InputProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false)
    private Product product;

    @NotNull(message = "A data de entrada é obrigatória")
    @Column(name = "DATA_ENTRADA", nullable = false)
    private LocalDateTime dataEntrada;

    @NotNull(message = "O preço unitário é obrigatório")
    @Column(name = "PRECO_UNITARIO", nullable = false)
    private Double precoUnitario;

    @NotNull(message = "A quantidade é obrigatória")
    @Column(name = "QUANTIDADE", nullable = false)
    private Integer quantidade;
}