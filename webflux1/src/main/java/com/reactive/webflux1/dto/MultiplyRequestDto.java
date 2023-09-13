package com.reactive.webflux1.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class MultiplyRequestDto {
    public MultiplyRequestDto(int first, int second) {
        this.first = first;
        this.second = second;
    }

    private int first;
    private int second;
}
