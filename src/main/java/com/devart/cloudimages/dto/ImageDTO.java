package com.devart.cloudimages.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ImageDTO {
    private Long id;
    private String imageUrl;
    private String fileName;
    private String fileType;
    private Long fileSize;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}