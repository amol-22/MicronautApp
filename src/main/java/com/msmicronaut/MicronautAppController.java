package com.msmicronaut;

import io.micronaut.http.annotation.*;

@Controller("/micronautApp")
public class MicronautAppController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}