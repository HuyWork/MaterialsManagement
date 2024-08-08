package com.internship.materialsmanagement.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VatTu {
    private Long maVatTu;
    private String tenVatTu;
    private Long donGia;
}
