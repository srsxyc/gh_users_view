package edu.hubu.gh_users_view.service.impl;

import edu.hubu.gh_users_view.entity.GhUserQuarterly;
import edu.hubu.gh_users_view.mapper.GhUserQuarterlyMapper;
import edu.hubu.gh_users_view.service.GhUserQuarterlyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ghUserQuarterlyService")
public class GhUserQuarterlyServiceImpl implements GhUserQuarterlyService {

    @Resource
    private GhUserQuarterlyMapper ghUserQuarterlyMapper;

    @Override
    public List<GhUserQuarterly> selectAll() {
        return ghUserQuarterlyMapper.selectAll();
    }
}
