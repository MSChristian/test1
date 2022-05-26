package com.example.test1.infrastructure.in.rest;


import com.example.test1.application.urlshortener.UrlShortener;
import com.example.test1.domain.urlshortener.UrlShortenerData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;

@RestController
@RequestMapping
public class UrlShortenerGetController {

    private final UrlShortener urlShortener;

    public UrlShortenerGetController(UrlShortener urlShortener) {
        this.urlShortener = urlShortener;
    }

    @GetMapping("/api/v1/url-shortener")
    public ResponseEntity<URL> execute(
            @RequestParam URL url,
            @RequestParam String seoKeyword
    ) throws MalformedURLException {
        var shortenedUrl = urlShortener.execute(new UrlShortenerData(url, seoKeyword));
        return ResponseEntity.ok(shortenedUrl);
    }


}
