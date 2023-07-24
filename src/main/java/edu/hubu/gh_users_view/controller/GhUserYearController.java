package edu.hubu.gh_users_view.controller;

import edu.hubu.gh_users_view.entity.GhUserYear;
import edu.hubu.gh_users_view.service.GhUserYearService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
@CrossOrigin
public class GhUserYearController {

    @Resource
    private GhUserYearService ghUserYearService;

    @GetMapping("")
    public Map<String, Map<String, Object>> findAllByTId(){

        List<GhUserYear> ghUserYears = ghUserYearService.selectAll();

        Map<String, Map<String, Object>> result = new HashMap<>();

        // 遍历查询结果，按年份归类并计算每年所有国家的人数总和
        for (GhUserYear ghUserYear : ghUserYears) {
            String year = String.valueOf(ghUserYear.getYear());
            int countryId = ghUserYear.getCountryId();
            int totalUsers = ghUserYear.getTotalUsers();

            // 如果结果集中没有当前年份的数据，则添加一个新的年份项
            if (!result.containsKey(year)) {
                Map<String, Object> yearData = new HashMap<>();
                yearData.put("allUsers", 0);
                result.put(year, yearData);
            }

            // 更新该年份的总人数
            Map<String, Object> yearData = result.get(year);
            int allUsers = (int) yearData.get("allUsers");
            yearData.put("allUsers", allUsers + totalUsers);

            // 设置国家信息
            Map<String, Object> countryInfo = new HashMap<>();
            countryInfo.put("chName", ghUserYear.getCountry().getChName());
            countryInfo.put("经度", ghUserYear.getCountry().getLongitude());
            countryInfo.put("纬度", ghUserYear.getCountry().getLatitude());
            countryInfo.put("countryId", countryId);
            countryInfo.put("totalUsers", totalUsers);

            // 将国家信息添加到该年份的数据中
            yearData.put(String.valueOf(countryId), countryInfo);
        }

        return result;
    }

}
