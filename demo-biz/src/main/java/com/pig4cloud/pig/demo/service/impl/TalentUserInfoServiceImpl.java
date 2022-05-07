/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.pig4cloud.pig.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.demo.entity.TalentUserInfo;
import com.pig4cloud.pig.demo.mapper.TalentUserInfoMapper;
import com.pig4cloud.pig.demo.service.TalentUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 *
 * @author pig code generator
 * @date 2022-05-06 14:33:01
 */
@Service
public class TalentUserInfoServiceImpl extends ServiceImpl<TalentUserInfoMapper, TalentUserInfo> implements TalentUserInfoService {
    @Resource
    private TalentUserInfoMapper talentUserInfoMapper;
    public TalentUserInfo selectPartialById(Long id){
         return talentUserInfoMapper.selectPartialById(id);
    }

    public String getMaxId(){
        return talentUserInfoMapper.getMaxId();
    }
}
