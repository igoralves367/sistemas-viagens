package br.com.lis2b.igorviagens.voos.infra;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class TokenResponse {
	@JsonProperty("access_token")
    private String accessToken;
}
