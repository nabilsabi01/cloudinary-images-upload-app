package com.devart.cloudimages.service;

import com.devart.cloudimages.dto.ImageDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {
    ImageDTO uploadImage(MultipartFile file) throws IOException;
    Page<ImageDTO> getAllImages(Pageable pageable);
    ImageDTO getImageById(Long id);
    void deleteImage(Long id) throws IOException;
}