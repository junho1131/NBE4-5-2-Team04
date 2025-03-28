package com.project2.domain.post.dto.comment;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentRequestDTO {
    private String content;
    private Long parentId;
}