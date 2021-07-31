package com.mino.api.service;

import com.mino.api.entity.ApiHistoryEntity;

public interface ApiHistoryService {

	public boolean createHistory(ApiHistoryEntity apiHistoryParam);

	public ApiHistoryEntity readHistory(String historyKeyParam);

	public boolean updateHistory(ApiHistoryEntity apiHistoryParam);

	public boolean deleteHistory(String historyKeyParam);

}
