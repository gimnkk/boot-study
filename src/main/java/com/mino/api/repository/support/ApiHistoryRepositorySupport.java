package com.mino.api.repository.support;

import static com.mino.api.entity.QApiHistoryEntity.apiHistoryEntity;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.mino.api.entity.ApiHistoryEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class ApiHistoryRepositorySupport extends QuerydslRepositorySupport {

	private final JPAQueryFactory jpaQueryFactory;

	public ApiHistoryRepositorySupport(JPAQueryFactory jpaQueryFactory) {
		super(ApiHistoryEntity.class);
		this.jpaQueryFactory = jpaQueryFactory;
	}

	@Transactional
	public void deleteByHistoryKey(String historyKey) {
		jpaQueryFactory.delete(apiHistoryEntity).where(apiHistoryEntity.historyKey.eq(historyKey)).execute();
	}

	@Transactional
	public void updateByHistoryKey(String historyKey) {
		jpaQueryFactory.update(apiHistoryEntity).where(apiHistoryEntity.historyKey.eq(historyKey))
				.set(apiHistoryEntity.expireDate, LocalDateTime.now()).set(apiHistoryEntity.status, "DONE").execute();
	}
}
