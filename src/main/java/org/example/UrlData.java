package org.example;

import lombok.*;

@AllArgsConstructor
@Data
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
