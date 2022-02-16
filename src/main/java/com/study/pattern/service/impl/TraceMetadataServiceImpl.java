package com.study.pattern.service.impl;

import com.study.pattern.entity.TraceMetadata;
import com.study.pattern.model.MetaInfoVo;
import com.study.pattern.model.MetaTypeVo;
import com.study.pattern.repository.TraceMetadataMapper;
import com.study.pattern.service.ITraceMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: TraceMetadataServiceImpl
 * Description:
 * @Author: luohx
 * Date: 2022/2/15 上午10:16
 * History:
 * <author>          <time>          <version>          <desc>
 * luohx            修改时间           1.0
 */
@Service
public class TraceMetadataServiceImpl implements ITraceMetadataService {

    @Autowired
    private TraceMetadataMapper dataMapper;

    @Override
    public List<MetaTypeVo> getMetaTypeList() {
        return dataMapper.getMetaTypeList();
    }

    @Override
    public List<MetaInfoVo> getMetaInfoByCode(String classCode) {
        return dataMapper.getMetaInfoByCode(classCode);
    }

    @Override
    public TraceMetadata getMetaDataByCode(String nodeCode, Integer level) {
        return dataMapper.getMetaDataByCode(nodeCode, level);
    }
}
