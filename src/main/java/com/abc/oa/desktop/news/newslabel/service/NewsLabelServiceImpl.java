package com.abc.oa.desktop.news.newslabel.service;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;
import com.abc.oa.desktop.news.newslabel.dao.INewsLabelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @date 2020/12/28 2:33
 * version 1.0
 */
@Service
public class NewsLabelServiceImpl implements INewsLabelService {
    @Autowired
    private INewsLabelDao dao;

    @Override
    public Page<NewsLabel> findCurrentPage(int pageno) {
        Page<NewsLabel> page = new Page<>();
        page.setPageno(pageno);

        int totalRows = dao.selectAllCount();
        page.setTotalRows(totalRows);

        List<NewsLabel> datas = dao.selectCurrentPageNewsLabel(page);
        page.setDatas(datas);

        return page;
    }
}
