package edu.hubu.gh_users_view.service;

import edu.hubu.gh_users_view.entity.GhUserMonth;

import java.util.List;

public interface GhUserMonthService {

    /**
     * 查询所有
     * @return
     */
    List<GhUserMonth> selectAll();

}
