package edu.hubu.gh_users_view.service;

import edu.hubu.gh_users_view.entity.Country;


public interface CountryService {

    /**
     * 通过国家代码查询
     * @param countryId
     * @return 国家相关信息一个国家实例
     */
    Country selectByPrimaryKey(Integer countryId);

}
