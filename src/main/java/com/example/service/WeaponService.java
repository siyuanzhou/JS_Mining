package com.example.service;


import com.example.entity.Tag;
import com.example.entity.Weapon;
import com.example.mapper.WeaponMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponService {

    @Autowired
    WeaponMapper weaponMapper;

    @Autowired
    RedisTemplate redisTemplate;


   /*public List<Catalog> getCatalog(String catalog1){
        List<Catalog> items;
        //items = weaponMapper.selectCatalog(catalog1);

       *//* Object menu = redisTemplate.opsForValue().get("menu");
        if(menu==null){
            items = weaponMapper.selectCatalog(catalog1);
            redisTemplate.opsForValue().set(menu,items);
        }else{
            items = (List<Catalog>)menu;
        }*//*
        return items;
    }*/


    public List<Weapon> queryByTags(Tag tag){
        /*List<Weapon>items;
        Object weapon = redisTemplate.opsForValue().get(tag.toString());
        if(weapon==null){
            items = weaponMapper.queryByTags(tag);
            System.out.println("查询数据库！！！！");
            redisTemplate.opsForValue().set(tag.toString(),items);
        }else{
            System.out.println("查询缓存！！！！");
            items = (List<Weapon>)weapon;
        }*/
        List<Weapon>items = weaponMapper.queryByTags(tag);
        System.out.println("查询数据库！！！！");
        return items;
    }

    public List<Weapon> selectAllWeapon(){

       return weaponMapper.selectAllWeapon();
    }

    public Weapon selectWeaponByName(String name){

        return weaponMapper.selectWeaponByName(name);
    }
}
