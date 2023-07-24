package edu.hubu.gh_users_view.mapper;

import edu.hubu.gh_users_view.entity.GhChUserMonth;
import java.util.List;

public interface GhChUserMonthMapper {

    GhChUserMonth selectByPrimaryKey(Integer id);

    List<GhChUserMonth> selectAll();
}