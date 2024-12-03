package br.com.tamawilson.records;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Bibliotecas que facilitam o trabalho
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleLombok {

    private String name;
    private int age;
    private double salary;
    private boolean isActive;
    private char grade;
    private long id;
    private float height;
    private byte level;
    private short year;
    private String address;
}
