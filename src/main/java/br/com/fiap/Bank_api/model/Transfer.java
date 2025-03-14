package br.com.fiap.Bank_api.model;

import java.math.BigDecimal;

public class Transfer extends AccountMovement{
    private Long idDestiny;
    public Transfer() {
    }
    public Transfer(Long idOrigin, Long idDestiny, BigDecimal value) {
        super(idOrigin, value);
        this.idDestiny = idDestiny;
    }
}
