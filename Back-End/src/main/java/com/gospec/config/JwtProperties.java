package com.gospec.config;

public class JwtProperties {
	public static final String SECRET = "gospec";
	public static final int EXPIRATION_TIME = 36000000;
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
}
