package br.com.fernandinesuplementos.loja.entities.melhorEnvio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Packages implements Serializable {

    private String price;
    private String discount;
    private String format;

}
