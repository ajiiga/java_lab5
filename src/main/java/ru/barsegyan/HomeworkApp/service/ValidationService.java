package ru.barsegyan.HomeworkApp.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.barsegyan.HomeworkApp.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult result) throws ValidationFailedException;
}
