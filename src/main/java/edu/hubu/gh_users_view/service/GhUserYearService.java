package edu.hubu.gh_users_view.service;

import edu.hubu.gh_users_view.entity.GhUserYear;

import java.util.List;

public interface GhUserYearService {

    /**
     * 查询所有
     * @return
     */
    List<GhUserYear> selectAll();

}
