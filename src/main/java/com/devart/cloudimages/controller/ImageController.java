package com.devart.cloudimages.controller;

import com.devart.cloudimages.dto.ImageDTO;
import com.devart.cloudimages.service.ImageService;
import com.devart.cloudimages.validation.FileSize;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/images")
@RequiredArgsConstructor
public class ImageController {

    private final ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<ImageDTO> uploadImage(@RequestParam("file") @Valid @NotNull @FileSize(max = "10MB") MultipartFile file) throws IOException {
        ImageDTO uploadedImage = imageService.uploadImage(file);
        return new ResponseEntity<>(uploadedImage, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page<ImageDTO>> getAllImages(Pageable pageable) {
        Page<ImageDTO> images = imageService.getAllImages(pageable);
        return ResponseEntity.ok(images);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImageDTO> getImageById(@PathVariable Long id) {
        ImageDTO image = imageService.getImageById(id);
        return ResponseEntity.ok(image);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable Long id) throws IOException {
        imageService.deleteImage(id);
        return ResponseEntity.noContent().build();
    }
}