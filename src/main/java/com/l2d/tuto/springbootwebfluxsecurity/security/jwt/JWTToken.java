package com.l2d.tuto.springbootwebfluxsecurity.security.jwt;

import lombok.*;

/**
 * @author duc-d
 */
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWTToken {
	private String token;
}
