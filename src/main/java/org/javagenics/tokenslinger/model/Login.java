package org.javagenics.tokenslinger.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Login {
    private String email;
    private String password;
}
