package com.khodar.springboot.Khodar.Java.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_citizens")
@Data
public class Citizens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String deviceId;
    private Boolean verified;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
