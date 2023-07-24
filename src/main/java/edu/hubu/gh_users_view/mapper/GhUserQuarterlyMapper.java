package edu.hubu.gh_users_view.mapper;

import edu.hubu.gh_users_view.entity.GhUserQuarterly;
import java.util.List;

public interface GhUserQuarterlyMapper {

    /**
     * 查询所有
     * @return
     */
    List<GhUserQuarterly> selectAll();
}