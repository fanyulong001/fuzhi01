package com.abc.oa.desktop.news.newslabel.commons.beans;

import java.util.Set;

/**
 * @author admin
 * @date 2020/12/28 1:51
 * version 1.0
 */
public class NewsLabel {
    private Integer id;      //对应数据库中的字段
    private String label_name;
    private String label_content;
    //关联属性，将当前类看作是一方（父栏目），则关联属性就是多方（子栏目）
    private Set<NewsLabel> child;
    //关联属性，将当前类看作是多方（子栏目），则关联属性就是一方（父栏目）
    private NewsLabel parent;

    public Integer getId() {
        return id;
    }

    public String getLabel_name() {
        return label_name;
    }

    public String getLabel_content() {
        return label_content;
    }

    public Set<NewsLabel> getChile() {
        return child;
    }

    public NewsLabel getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "NewsLabel{" +
                "id=" + id +
                ", label_name='" + label_name + '\'' +
                ", label_content='" + label_content + '\'' +
                ", chile=" + child +
                ", parent=" + parent +
                '}';
    }
}
