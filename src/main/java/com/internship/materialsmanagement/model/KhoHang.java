package com.internship.materialsmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.beans.Transient;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KhoHang {
    private Long maKho;
    private String tenKho;
    private Long soLuongNhap;
    private Long soLuongXuat;
}
