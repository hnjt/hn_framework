package com.hn.hn_core_server.service;

import com.hn.hn_core_server.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    public List<Map<Object,Object>> testGetList() {

        return this.dao.testGetList();
    }
}
