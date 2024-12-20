package com.example.backend.Controllers;

import com.example.backend.DTO.ResponseDto;
import com.example.backend.Services.TrashService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emails")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class TrashController {
    private final TrashService trashService;

    @PutMapping("/trash/{userId}/{emailId}")
    public ResponseEntity<ResponseDto> trashEmail(
            @PathVariable Long userId,
            @PathVariable Long emailId,
            @RequestParam(defaultValue = "false") boolean isSender
    ) {
        ResponseDto response = trashService.trashEmail(userId, emailId, isSender);
        return ResponseEntity.ok(response);
    }
}

