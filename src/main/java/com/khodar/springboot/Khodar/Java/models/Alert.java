package com.khodar.springboot.Khodar.Java.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.Severity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_alerts")
@Data
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean active;
    @Enumerated(EnumType.STRING)
    private Severity severity;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;
}
