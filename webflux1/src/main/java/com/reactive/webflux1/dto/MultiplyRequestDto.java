package com.reactive.webflux1.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MultiplyRequestDto {
    public MultiplyRequestDto(int first, int second) {
        this.first = first;
        this.second = second;
    }

    private int first;
    private int second;
}
