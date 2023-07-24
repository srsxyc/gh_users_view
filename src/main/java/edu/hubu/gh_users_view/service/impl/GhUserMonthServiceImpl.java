package edu.hubu.gh_users_view.service.impl;

import edu.hubu.gh_users_view.entity.GhUserMonth;
import edu.hubu.gh_users_view.mapper.GhUserMonthMapper;
import edu.hubu.gh_users_view.service.GhUserMonthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ghUserMonthService")
public class GhUserMonthServiceImpl implements GhUserMonthService {

    @Resource
    private GhUserMonthMapper ghUserMonthMapper;

    @Override
    public List<GhUserMonth> selectAll() {
        return ghUserMonthMapper.selectAll();
    }
}
