package edu.hubu.gh_users_view;

import edu.hubu.gh_users_view.entity.Country;
import edu.hubu.gh_users_view.entity.GhUserMonth;
import edu.hubu.gh_users_view.entity.GhUserQuarterly;
import edu.hubu.gh_users_view.entity.GhUserYear;
import edu.hubu.gh_users_view.service.CountryService;
import edu.hubu.gh_users_view.service.GhUserMonthService;
import edu.hubu.gh_users_view.service.GhUserQuarterlyService;
import edu.hubu.gh_users_view.service.GhUserYearService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class GhUsersViewApplicationTests {

    @Resource
    private CountryService countryService;
    @Resource
    private GhUserMonthService ghUserMonthService;
    @Resource
    private GhUserQuarterlyService ghUserQuarterlyService;
    @Resource
    private GhUserYearService ghUserYearService;

    @Test
    void countryServiceTest(){
        Country country = countryService.selectByPrimaryKey(4);
        System.out.println(country);
    }

    @Test
    void ghUserMonthServiceTest(){
        List<GhUserMonth> ghUserMonths = ghUserMonthService.selectAll();
        ghUserMonths.forEach(System.out::println);
    }

    @Test
    void ghUserQuarterlyServiceTest(){
        List<GhUserQuarterly> ghUserQuarterlies = ghUserQuarterlyService.selectAll();
        ghUserQuarterlies.forEach(System.out::println);
    }

    @Test
    void ghUserYearServiceTest(){
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
        System.out.println(result);
    }

}
