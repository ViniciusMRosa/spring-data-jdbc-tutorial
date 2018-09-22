package br.com.viniciusmr.spbootdatajdbc.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import org.springframework.data.relational.core.mapping.Table;


@RequiredArgsConstructor(staticName = "of")
@Data
public class User{
    @Id
    private Long id;
    @NonNull
    private String name;
}