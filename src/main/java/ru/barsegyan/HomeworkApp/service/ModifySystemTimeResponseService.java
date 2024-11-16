package ru.barsegyan.HomeworkApp.service;

import org.springframework.stereotype.Service;
import ru.barsegyan.HomeworkApp.model.Response;
import ru.barsegyan.HomeworkApp.util.DateTimeUtil;

import java.util.Date;


@Service("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}
