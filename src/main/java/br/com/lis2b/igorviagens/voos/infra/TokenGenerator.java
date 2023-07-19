package br.com.lis2b.igorviagens.voos.infra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
public class TokenGenerator {
    private static final String TOKEN_ENDPOINT = "https://test.api.amadeus.com/v1/security/oauth2/token";

    @Value("${amadeus.clientId}")
    private String clientId;

    @Value("${amadeus.clientSecret}")
    private String clientSecret;

    public String generateAuthorizationToken() {
        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>();
        requestBody.add("grant_type", "client_credentials");
        requestBody.add("client_id", clientId);
        requestBody.add("client_secret", clientSecret);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

        RestTemplate restTemplate = new RestTemplate();
        TokenResponse tokenResponse = restTemplate.postForObject(TOKEN_ENDPOINT, requestEntity, TokenResponse.class);

        return "Bearer " + tokenResponse.getAccessToken();
    }
}
