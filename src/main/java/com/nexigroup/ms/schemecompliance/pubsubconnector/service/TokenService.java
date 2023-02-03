package com.nexigroup.ms.schemecompliance.pubsubconnector.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.net.URI;

@Service
public class TokenService {

//    @Autowired
//    private SfdcAuthenticatedProperties properties;
//
//    @Autowired
//    private RestTemplate plainRestTemplate;
//
//    @Value("${sfdc.authenticated.dev_env}")
//    private boolean devEnv;
//
//    public OAuthTokenResponse retrieveTokenResponse() throws IOException {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//
//        URI url = UriComponentsBuilder
//                .fromUriString(properties.getHost())
//                .path("/services/oauth2/token")
//                .build()
//                .toUri();
//
//        LinkedMultiValueMap<String, String> formParams = new LinkedMultiValueMap<>();
//        formParams.add("grant_type", "password");
//        formParams.add("username", properties.getUsername());
//        if (devEnv) {
//            formParams.add("password", properties.getPassword() + "2Xl6rwG0icT9GbXFX5qRfPL9");
//        } else {
//            formParams.add("password", properties.getPassword());
//        }
//        formParams.add("client_id", properties.getClientId());
//        formParams.add("client_secret", properties.getSecret());
//
//        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(formParams, headers);
//
//        OAuthTokenResponse response = plainRestTemplate.postForEntity(url, request, OAuthTokenResponse.class).getBody();
//
//        if (response != null && response.getAccessToken() != null) {
//            return response;
//        }
//        throw new RuntimeException("SFDC auth failed due to: " + response);
//    }
}
