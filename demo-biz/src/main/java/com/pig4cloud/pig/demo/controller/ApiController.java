package com.pig4cloud.pig.demo.controller;

import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.security.annotation.Inner;
import com.pig4cloud.pig.demo.service.TalentUserInfoService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api" )
public class ApiController {
    private final TalentUserInfoService talentUserInfoService;

    @Inner(value = false)
    @GetMapping("/provider/getPartial/{id}")

    public R selectPartialById(@PathVariable("id") Long id){
        return R.ok(talentUserInfoService.selectPartialById(id));
    }

    @Inner(value = false)
    @GetMapping("/provider/getFull/{id}")
    public R selectCompleteById(@PathVariable("id") Long id){
        return R.ok(talentUserInfoService.getById(id));
    }


}
