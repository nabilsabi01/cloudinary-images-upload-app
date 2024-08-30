package com.devart.cloudimages.service;

import com.devart.cloudimages.dto.ImageDTO;
import com.devart.cloudimages.exception.ImageNotFoundException;
import com.devart.cloudimages.mapper.ImageMapper;
import com.devart.cloudimages.model.Image;
import com.devart.cloudimages.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
@Transactional
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;
    private final CloudinaryService cloudinaryService;
    private final ImageMapper imageMapper;

    @Override
    public ImageDTO uploadImage(MultipartFile file) throws IOException {
        String imageUrl = cloudinaryService.uploadFile(file);

        Image image = new Image();
        image.setImageUrl(imageUrl);
        image.setFileName(file.getOriginalFilename());
        image.setFileType(file.getContentType());
        image.setFileSize(file.getSize());

        Image savedImage = imageRepository.save(image);
        return imageMapper.toDTO(savedImage);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ImageDTO> getAllImages(Pageable pageable) {
        return imageRepository.findAll(pageable)
                .map(imageMapper::toDTO);
    }

    @Override
    @Transactional(readOnly = true)
    public ImageDTO getImageById(Long id) {
        Image image = imageRepository.findById(id)
                .orElseThrow(() -> new ImageNotFoundException("Image not found with id: " + id));
        return imageMapper.toDTO(image);
    }

    @Override
    public void deleteImage(Long id) throws IOException {
        Image image = imageRepository.findById(id)
                .orElseThrow(() -> new ImageNotFoundException("Image not found with id: " + id));

        String publicId = extractPublicId(image.getImageUrl());
        cloudinaryService.deleteFile(publicId);
        imageRepository.delete(image);
    }

    private String extractPublicId(String imageUrl) {
        return imageUrl.substring(imageUrl.lastIndexOf("/") + 1, imageUrl.lastIndexOf("."));
    }
}