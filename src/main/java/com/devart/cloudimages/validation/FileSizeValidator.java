package com.devart.cloudimages.validation;

import com.devart.cloudimages.validation.FileSize;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartFile;

public class FileSizeValidator implements ConstraintValidator<FileSize, MultipartFile> {
    private long maxSizeBytes;

    @Override
    public void initialize(FileSize constraintAnnotation) {
        this.maxSizeBytes = DataSize.parse(constraintAnnotation.max()).toBytes();
    }

    @Override
    public boolean isValid(MultipartFile file, ConstraintValidatorContext context) {
        return file == null || file.getSize() <= maxSizeBytes;
    }
}