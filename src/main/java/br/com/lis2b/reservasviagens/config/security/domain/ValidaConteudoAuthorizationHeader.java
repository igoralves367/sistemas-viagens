package br.com.lis2b.reservasviagens.config.security.domain;

import java.util.function.Predicate;

public class ValidaConteudoAuthorizationHeader implements Predicate<String> {
    @Override
    public boolean test(String ConteudoAuthorizationHeader) {
        return !ConteudoAuthorizationHeader.isEmpty() && ConteudoAuthorizationHeader.startsWith("Bearer");
    }
}
