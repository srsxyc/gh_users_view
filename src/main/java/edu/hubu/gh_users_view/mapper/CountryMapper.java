package edu.hubu.gh_users_view.mapper;

import edu.hubu.gh_users_view.entity.Country;

import java.util.List;

public interface CountryMapper {

    // 通过国家代码查询
    Country selectByPrimaryKey(Integer countryId);


}