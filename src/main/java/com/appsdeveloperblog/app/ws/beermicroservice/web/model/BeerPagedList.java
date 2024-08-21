package com.appsdeveloperblog.app.ws.beermicroservice.web.model;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerDto> {
    public BeerPagedList(List<BeerDto> content, Pageable pageable, long totalElements) {
        super(content, pageable, totalElements);
    }
    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}
