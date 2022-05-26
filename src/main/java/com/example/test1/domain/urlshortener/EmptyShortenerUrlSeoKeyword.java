package com.example.test1.domain.urlshortener;

public class EmptyShortenerUrlSeoKeyword extends RuntimeException {
    public EmptyShortenerUrlSeoKeyword() {
        super("Url Seo keyword is empty");
    }
}
