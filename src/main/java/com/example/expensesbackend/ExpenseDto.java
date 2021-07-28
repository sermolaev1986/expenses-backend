package com.example.expensesbackend;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ExpenseDto {
    private BigDecimal amount;
    private String category;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
}
