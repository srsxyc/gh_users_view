package edu.hubu.gh_users_view.mapper;

import edu.hubu.gh_users_view.entity.GhUserMonth;
import java.util.List;

public interface GhUserMonthMapper {

    /**
     * 查询所有记录，与国家代码表做连接
     * @return
     */
    List<GhUserMonth> selectAll();

}