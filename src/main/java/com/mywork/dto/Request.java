package com.mywork.dto;

public record Request(
        String type,
        String query,
        String language,
        String unit
) {
}
