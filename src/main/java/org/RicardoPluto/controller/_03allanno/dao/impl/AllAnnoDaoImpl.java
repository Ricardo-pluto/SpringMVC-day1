package org.RicardoPluto.controller._03allanno.dao.impl;

import org.RicardoPluto.controller._03allanno.dao.IAllAnnoDao;
import org.springframework.beans.factory.annotation.Autowired;

public class AllAnnoDaoImpl implements IAllAnnoDao {

    @Override
    public void allAnno() {
        System.out.println("欢迎加入SpringMVC！");
    }
}
