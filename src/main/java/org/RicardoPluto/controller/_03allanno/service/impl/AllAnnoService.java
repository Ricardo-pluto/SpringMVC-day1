package org.RicardoPluto.controller._03allanno.service.impl;

import org.RicardoPluto.controller._03allanno.dao.IAllAnnoDao;
import org.RicardoPluto.controller._03allanno.service.IAllAnnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllAnnoService implements IAllAnnoService {
    @Autowired
    private IAllAnnoDao allAnnoDao;

    @Override
    public void allAnno() {
        allAnnoDao.allAnno();
    }
}
