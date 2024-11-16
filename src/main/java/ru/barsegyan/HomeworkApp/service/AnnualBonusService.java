package ru.barsegyan.HomeworkApp.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.HomeworkApp.model.Positions;

@Service
public interface AnnualBonusService {
    double calculate(Positions positions, double salary, double bonus, int workDays);
}
