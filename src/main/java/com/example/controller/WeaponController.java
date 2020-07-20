package com.example.controller;

import com.example.entity.Tag;
import com.example.entity.Weapon;
import com.example.service.EsService;
import com.example.service.WeaponService;
import org.activiti.engine.impl.util.json.JSONArray;
import org.activiti.engine.impl.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller

public class WeaponController {

    @Autowired
    private WeaponService weaponService;

    @RequestMapping("JS_Weapon")
    public String JS_Weapon() {
        return  "JS_Weapon";
    }

    @RequestMapping("JS_Weapon_Item")
    public String JS_Weapon_Item(@RequestParam("name") String name,Model model) {
        Weapon weapons = weaponService.selectWeaponByName(name);
        model.addAttribute("weapons",weapons);
        System.out.println(weapons);
        return  "JS_Weapon_Item";
    }

    @ResponseBody
    @RequestMapping("Weapon_List_First")
    public String Weapon_List_First(@RequestParam("biglist") String req_biglist, @RequestParam("list") String req_list, @RequestParam("country") String req_country, @RequestParam("time") String req_time, Model model){

        // 直接将json信息打印出来
        System.out.println(req_biglist);
        System.out.println(req_list);
        System.out.println(req_country);
        System.out.println(req_time);


        List<String> list= new ArrayList();
        list.add("战斗机");
        list.add("攻击机");
        list.add("教练机");
        list.add("轰炸机");
        list.add("预警机");
        list.add("侦查机");

        List<String> biglist= new ArrayList();
        biglist.add("飞行器");
        biglist.add("舰船舰艇");
        biglist.add("枪械与单兵");
        biglist.add("坦克装甲车辆");
        biglist.add("火炮");
        biglist.add("网络攻防");

        List<String> countrylist= new ArrayList();

        countrylist.add("中国");
        countrylist.add("美国");
        countrylist.add("法国");
        countrylist.add("英国");
        countrylist.add("德国");
        countrylist.add("意大利");
        countrylist.add("西班牙");
        countrylist.add("日本");

        List<String> timelist= new ArrayList();
        timelist.add("二战前");
        timelist.add("二战期间");
        timelist.add("二战后至冷战期间");
        timelist.add("冷战后至今");

        JSONArray array = new JSONArray();

            JSONObject obj = new JSONObject();
            obj.put("biglist", biglist);
            obj.put("list", list);
            obj.put("country", countrylist);
            obj.put("time", timelist);
            System.out.println("obj=="+obj);
            array.put(obj);


        return array.toString();

    }

    @ResponseBody
    @RequestMapping("Weapon_List_Select")
    public String Weapon_List_Select(@RequestParam("type") String type){


        System.out.println(type);

        List<String> biglist= new ArrayList();
        List<String> list= new ArrayList();
        List<String> countrylist= new ArrayList();
        List<String> timelist= new ArrayList();

        if(type.equals("舰船舰艇")) {

            list.add("航空母舰");
            list.add("战列舰");
            list.add("巡洋舰");
            list.add("驱逐舰");
            list.add("核潜艇");
            list.add("常规潜艇");
            list.add("导弹艇");
            list.add("两栖作战潜艇");


            biglist.add("飞行器");
            biglist.add("舰船坚挺");
            biglist.add("枪械与单兵");
            biglist.add("坦克装甲车辆");
            biglist.add("火炮");
            biglist.add("网络攻防");

            countrylist.add("中国");
            countrylist.add("美国");
            countrylist.add("法国");
            countrylist.add("英国");
            countrylist.add("德国");
            countrylist.add("意大利");
            countrylist.add("西班牙");
            countrylist.add("日本");
            countrylist.add("印度");
            countrylist.add("苏俄");
            countrylist.add("韩国");
            countrylist.add("朝鲜");
            countrylist.add("巴西");
            countrylist.add("加拿大");
            countrylist.add("西班牙");
            countrylist.add("日本");



            timelist.add("二战前");
            timelist.add("二战期间");
            timelist.add("二战后至冷战期间");
            timelist.add("冷战后至今");

        }else if(type.equals("飞行器")){
            list.add("战斗机");
            list.add("攻击机");
            list.add("教练机");
            list.add("轰炸机");
            list.add("预警机");
            list.add("侦查机");


            biglist.add("飞行器");
            biglist.add("舰船舰艇");
            biglist.add("枪械与单兵");
            biglist.add("坦克装甲车辆");
            biglist.add("火炮");
            biglist.add("网络攻防");


            countrylist.add("中国");
            countrylist.add("美国");
            countrylist.add("法国");
            countrylist.add("英国");
            countrylist.add("德国");
            countrylist.add("意大利");
            countrylist.add("西班牙");
            countrylist.add("日本");


            timelist.add("二战前");
            timelist.add("二战期间");
            timelist.add("二战后至冷战期间");
            timelist.add("冷战后至今");
        }else if(type.equals("枪械与单兵")){
            list.add("非自动步枪");
            list.add("自动步枪");
            list.add("冲锋枪");
            list.add("狙击枪");
            list.add("手枪");
            list.add("霰弹枪");
            list.add("机枪");
            list.add("火箭筒");

            list.add("榴弹发射器");
            list.add("刀具");

            biglist.add("飞行器");
            biglist.add("舰船舰艇");
            biglist.add("枪械与单兵");
            biglist.add("坦克装甲车辆");
            biglist.add("火炮");



            countrylist.add("中国");
            countrylist.add("美国");
            countrylist.add("法国");
            countrylist.add("英国");
            countrylist.add("德国");
            countrylist.add("意大利");
            countrylist.add("西班牙");
            countrylist.add("日本");
            countrylist.add("印度");
            countrylist.add("苏俄");
            countrylist.add("韩国");
            countrylist.add("朝鲜");
            countrylist.add("巴西");
            countrylist.add("加拿大");
            countrylist.add("西班牙");
            countrylist.add("日本");
            countrylist.add("乌克兰");
            countrylist.add("伊拉克");


            timelist.add("二战前");
            timelist.add("二战期间");
            timelist.add("二战后至冷战期间");
            timelist.add("冷战后至今");
        }else if(type.equals("坦克装甲车辆")){
            list.add("步兵坦克车");
            list.add("特种坦克车");
            list.add("装甲运兵车");
            list.add("救护车");
            list.add("越野车");
            list.add("扫雷车");

            biglist.add("飞行器");
            biglist.add("舰船舰艇");
            biglist.add("枪械与单兵");
            biglist.add("坦克装甲车辆");
            biglist.add("火炮");
            biglist.add("网络攻防");

            countrylist.add("中国");
            countrylist.add("美国");
            countrylist.add("法国");
            countrylist.add("英国");
            countrylist.add("德国");
            countrylist.add("意大利");
            countrylist.add("西班牙");
            countrylist.add("日本");
            countrylist.add("印度");
            countrylist.add("苏俄");
            countrylist.add("韩国");
            countrylist.add("朝鲜");
            countrylist.add("巴西");
            countrylist.add("加拿大");
            countrylist.add("西班牙");
            countrylist.add("日本");
            countrylist.add("乌克兰");
            countrylist.add("朝鲜");
            countrylist.add("巴西");
            countrylist.add("加拿大");
            countrylist.add("西班牙");
            countrylist.add("日本");
            countrylist.add("乌克兰");

            timelist.add("二战前");
            timelist.add("二战期间");
            timelist.add("二战后至冷战期间");
            timelist.add("冷战后至今");
        }


        JSONArray array = new JSONArray();

        JSONObject obj = new JSONObject();
        obj.put("biglist", biglist);
        obj.put("list", list);
        obj.put("country", countrylist);
        obj.put("time", timelist);
        System.out.println("obj=="+obj);
        array.put(obj);

        return array.toString();

    }

    @ResponseBody
    @RequestMapping("Weapon_Btn_Select")
    public String Weapon_Btn_Select(@RequestParam("biglist") String req_biglist, @RequestParam("list") String req_list, @RequestParam("country") String req_country, @RequestParam("time") String req_time, Model model){

        // 直接将json信息打印出来
        System.out.println(req_biglist);
        System.out.println(req_list);
        System.out.println(req_country);
        System.out.println(req_time);

        Tag tag = new Tag(req_biglist,req_list,req_country,req_time);

        List<Weapon> List_quary = weaponService.queryByTags(tag);

        System.out.println(List_quary.toString());

        List<Map<String,String>> result = new ArrayList<>();

        for( Weapon w : List_quary){
            HashMap<String,String> temp_obj = new HashMap();
            temp_obj.put("Img_url",w.getImg_url());
            temp_obj.put("country",w.getCountry());
            temp_obj.put("Img_desc",w.getImg_desc());
            temp_obj.put("Weaponname",w.getName());
            result.add(temp_obj);
        }

        JSONArray array = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("resultlist", result);
        System.out.println("obj=="+obj);
        array.put(obj);
        return array.toString();

    }

   /* @Autowired
    JestClient jestClient;*/

    /*@RequestMapping("ES")
    @ResponseBody
    public String ES(){
        *//*Employee employee = new Employee(1,"张三","张三喜欢");
        Index index = new Index.Builder(employee).index("haha").type("employee").build();
        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }*//*
        List<Weapon>contents = weaponService.selectAllWeapon();
        *//*BulkRequest bulkRequest = new BulkRequest();
        bulkRequest.timeout("2m");
        for(int i=0;i<contents.size();i++){
            bulkRequest.add(
                    new IndexRequest("weapons")
                    .source(JSON.toJSONString(contents.get(i)), XContentType.JSON));

        }*//*
        Bulk.Builder bulk = new Bulk.Builder();
        for(int i=0;i<contents.size();i++){
            Index index = new Index.Builder(contents.get(i)).index("multmodel").type("weapons").id(String.valueOf(contents.get(i).getId())).build();
            bulk.addAction(index);
        }
        try {
            BulkResult bulkResult = jestClient.execute(bulk.build());
            System.out.println(bulkResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "bulkResult";
    }*/


    @Autowired
    EsService esService;

    @GetMapping("/search/{keyword}/{pageNo}/{pageSize}")
    @ResponseBody
    public String searchPage(@PathVariable("keyword") String keyword,
                                               @PathVariable("pageNo") int pageNo,
                                               @PathVariable("pageSize") int pageSize){

        System.out.println(keyword);
        List<Weapon> List_quary = esService.searchPage(keyword,pageNo,pageSize);;

        System.out.println(List_quary.toString());

        List<Map<String,String>> result = new ArrayList<>();

        for( Weapon w : List_quary){

            HashMap<String,String> temp_obj = new HashMap();
            temp_obj.put("Img_url",w.getImg_url());
            temp_obj.put("country",w.getCountry());
            temp_obj.put("Img_desc",w.getImg_desc());
            temp_obj.put("Weaponname",w.getName());
            result.add(temp_obj);
        }

        JSONArray array = new JSONArray();
        JSONObject obj = new JSONObject();
        obj.put("resultlist", result);
        System.out.println("obj=="+obj);
        array.put(obj);
        return array.toString();
    }

}
