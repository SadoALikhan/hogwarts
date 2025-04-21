package com.hogwartss.school.h.service;

import com.hogwartss.school.h.model.Avatar;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface AvatarService {

    void uploadAvatar(Long studentId, MultipartFile file) throws IOException;

    Avatar findAvatar(Long studentId);
}
