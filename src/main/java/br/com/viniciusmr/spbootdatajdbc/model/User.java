package br.com.viniciusmr.spbootdatajdbc.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User{
    @Id
    private Long id;    
    private String name;
}