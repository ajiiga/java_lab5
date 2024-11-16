package ru.barsegyan.HomeworkApp.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.HomeworkApp.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
