package ru.barsegyan.HomeworkApp.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.HomeworkApp.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
