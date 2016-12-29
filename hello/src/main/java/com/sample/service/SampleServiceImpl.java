package com.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.sample.dao.SampleDao;

@Service("sampleService")
public class SampleServiceImpl implements SampleService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleDao")
	private SampleDao sampleDao;

	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		return sampleDao.selectBoardList(map);
	}
	
}
