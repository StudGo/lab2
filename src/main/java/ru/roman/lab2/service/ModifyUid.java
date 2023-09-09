package ru.roman.lab2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.roman.lab2.model.Response;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
