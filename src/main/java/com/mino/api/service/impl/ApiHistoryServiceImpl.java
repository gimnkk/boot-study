package com.mino.api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mino.api.entity.ApiHistoryEntity;
import com.mino.api.repository.ApiHistoryRepository;
import com.mino.api.repository.support.ApiHistoryRepositorySupport;
import com.mino.api.service.ApiHistoryService;

@Service
public class ApiHistoryServiceImpl implements ApiHistoryService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ApiHistoryRepository apiHistoryRepo;

	@Autowired
	private ApiHistoryRepositorySupport apiHistoryRepoSupport;

	@Override
	public boolean createHistory(ApiHistoryEntity apiHistoryParam) {
		apiHistoryRepo.save(apiHistoryParam);
		return true;
	}

	@Override
	public ApiHistoryEntity readHistory(String historyKeyParam) {
		ApiHistoryEntity result = apiHistoryRepo.findByHistoryKey(historyKeyParam).orElse(new ApiHistoryEntity());
		logger.info(result.toString());
		return result;
	}

	@Override
	public boolean updateHistory(ApiHistoryEntity apiHistoryParam) {
		apiHistoryRepoSupport.updateByHistoryKey(apiHistoryParam.getHistoryKey());
		return true;

	}

	@Override
	public boolean deleteHistory(String historyKeyParam) {
		apiHistoryRepoSupport.deleteByHistoryKey(historyKeyParam);
		return true;
	}

}
