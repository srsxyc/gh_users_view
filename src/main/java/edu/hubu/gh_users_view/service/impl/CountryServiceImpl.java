package edu.hubu.gh_users_view.service.impl;

import edu.hubu.gh_users_view.entity.Country;
import edu.hubu.gh_users_view.mapper.CountryMapper;
import edu.hubu.gh_users_view.service.CountryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Resource
    private CountryMapper countryMapper;

    /**
     * 通过国家代码查询
     * @param countryId
     * @return 国家相关信息一个国家实例
     */
    @Override
    public Country selectByPrimaryKey(Integer countryId) {
        return countryMapper.selectByPrimaryKey(countryId);
    }
}
