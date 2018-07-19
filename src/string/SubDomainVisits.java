package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: gws
 * @Date: 06/05/2018 23:39
 * @Description:
 */
public class SubDomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String, Integer> map = new HashMap<>();
        int len = cpdomains.length;

        for (int i = 0; i < len; i++) {
            String cur = cpdomains[i];
            int times = Integer.valueOf(cur.split(" ")[0]);
            String domain = cur.split(" ")[1];
            map.put(domain, map.getOrDefault(domain, 0) + times);

            String subdomain = "";
            if (domain.indexOf(".") >= 0) {
                subdomain = domain.substring(domain.indexOf(".") + 1);
                map.put(subdomain, map.getOrDefault(subdomain, 0) + times);
            }


            String subsubdomain = "";
            if (subdomain.indexOf(".") >= 0) {
                subsubdomain = subdomain.substring(subdomain.indexOf(".") + 1);
                map.put(subsubdomain, map.getOrDefault(subsubdomain, 0) + times);
            }
        }

        List<String> res = new ArrayList<>(map.size());
        for(String key : map.keySet()) {
            res.add(map.get(key) + " " + key);
        }
        return res;
    }

    public static void main(String[] args) {
        SubDomainVisits subDomainVisits = new SubDomainVisits();
        System.out.println(subDomainVisits.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }
}
