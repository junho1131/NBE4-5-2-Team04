package com.project2.domain.post.dto.toggle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ScrapResponseDTO {
    private boolean scrapped;
    private int scrapCount;
}