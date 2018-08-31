package com.sinochem.controller;

import com.sinochem.parse.FtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ftp")
public class FtpController {

    @Autowired
    @Qualifier("PABFtpService")
    FtpService ftpService;

    @RequestMapping("/download/all")
    public Map downloadAllBill() {
        Map map = new HashMap();
        try {
            List<String> list = ftpService.downloadYesterday();
            map.put("msg","下载T-1日所有对账单成功！");
            map.put("data", list);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }

    @RequestMapping("/downloadBillByDate")
    public Map downloadBillByDate(@RequestParam String date) throws Exception {
        Map map = new HashMap();
        try {
            List<String> list = ftpService.downloadByBillDate(date);
            map.put("msg", "根据日期下载所有类型对账单成功！");
            map.put("data", list);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }

    @RequestMapping("/downloadBillByBillType")
    public Map downloadBillByBillType(@RequestParam String billType) throws Exception {
        Map map = new HashMap();

        try {
            List<String> list = ftpService.downloadByBillType(new String[]{billType});
            map.put("msg", "根据对账单类型下载T-1日对账单成功！");
            map.put("data", list);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }

    @RequestMapping("/downloadBillByDateAndBillType")
    public Map downloadBillByDateAndBillType(@RequestParam String date, @RequestParam String billType) throws Exception {
        Map map = new HashMap();
        try {
            List<String> list = ftpService.downloadByBillTypeAndBillDate(date, new String[]{billType});
            map.put("msg", "根据对账单类型和日期下载对账单成功！");
            map.put("data", list);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
        }
        return map;
    }
}
