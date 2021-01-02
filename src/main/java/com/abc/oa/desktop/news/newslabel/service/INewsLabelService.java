package com.abc.oa.desktop.news.newslabel.service;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;

/**
 * @author admin
 * @date 2020/12/28 2:32
 * version 1.0
 */
public interface INewsLabelService {
    Page<NewsLabel> findCurrentPage(int pageno);
}
