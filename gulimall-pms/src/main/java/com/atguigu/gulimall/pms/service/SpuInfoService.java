package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.SpuInfoEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * spu信息
 *
 * @author xieweiquan
 * @email xx@atguigu.com
 * @date 2019-08-01 21:12:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo queryPageByCatId(QueryCondition queryCondition, Long catId);

    void updateSpuStates(Long spuId, Integer status);
}

