package edu.hubu.gh_users_view.service.impl;

import edu.hubu.gh_users_view.entity.GhUserYear;
import edu.hubu.gh_users_view.mapper.GhUserYearMapper;
import edu.hubu.gh_users_view.service.GhUserYearService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ghUserYearService")
public class GhUserYearServiceImpl implements GhUserYearService {

    @Resource
    private GhUserYearMapper ghUserYearMapper;

    @Override
    public List<GhUserYear> selectAll() {
        return ghUserYearMapper.selectAll();
    }
}
