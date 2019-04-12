package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Table(name ="wokao")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Wokao {
    private Integer id;
    private String name;
}
