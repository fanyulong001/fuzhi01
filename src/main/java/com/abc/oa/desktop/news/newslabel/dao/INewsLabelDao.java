package com.abc.oa.desktop.news.newslabel.dao;

import com.abc.oa.desktop.news.newslabel.commons.beans.NewsLabel;
import com.abc.oa.desktop.news.newslabel.commons.vo.Page;

import java.util.List;

/**
 * @author admin
 * @date 2020/12/28 3:19
 * version 1.0
 */
public interface INewsLabelDao {
    int selectAllCount();
//    1111
    List<NewsLabel> selectCurrentPageNewsLabel(Page<NewsLabel> page);

}
