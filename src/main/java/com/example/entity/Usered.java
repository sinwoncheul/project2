package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "USERED")
@NoArgsConstructor
public class Usered {
    @Id
    @Column(name = "USERED")
    private Long usered = null;

    @Column(name = "ID")
    private String id = null;

    @Column(name = "PASSWORD")
    private String password = null;

    @Column(name = "NAME")
    private String name = null;

    @Column(name = "PHONE")
    private Long phone = null;

    @Column(name = "ADDRESS")
    private String address = null;

    @Column(name = "CREATETIME")
    private Date createtime = null;
}
