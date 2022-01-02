package com.million.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
