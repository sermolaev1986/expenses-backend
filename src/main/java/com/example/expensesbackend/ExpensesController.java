package com.example.expensesbackend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(value = "/expenses", produces = {"application/json"})
class ExpensesController {

    private final List<ExpenseDto> expenses = new CopyOnWriteArrayList<>();

    @GetMapping
    public List<ExpenseDto> getExpenses() {
        return expenses;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @RequestMapping(consumes = {"application/json"})
    public ExpenseDto createExpense(@RequestBody ExpenseDto expenseDto) {
        expenses.add(expenseDto);
        return expenseDto;
    }
}
