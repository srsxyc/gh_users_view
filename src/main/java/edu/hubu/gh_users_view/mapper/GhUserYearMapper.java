package edu.hubu.gh_users_view.mapper;

import edu.hubu.gh_users_view.entity.GhUserYear;
import java.util.List;

public interface GhUserYearMapper {

    /**
     * 查询所有
     * @return
     */
    List<GhUserYear> selectAll();
}