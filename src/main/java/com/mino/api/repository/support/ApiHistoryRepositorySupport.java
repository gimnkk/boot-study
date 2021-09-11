package com.mino.api.repository.support;

import static com.mino.api.entity.QApiHistoryEntity.apiHistoryEntity;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.mino.api.dto.TestHistoryDto;
import com.mino.api.entity.ApiHistoryEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
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
	
	public Optional<TestHistoryDto> findOneBySeq(Long seq) {
		return Optional.ofNullable(
				jpaQueryFactory
				.select(Projections.fields(TestHistoryDto.class, 
						apiHistoryEntity.reqDate, apiHistoryEntity.status, apiHistoryEntity.expireDate))
				.from(apiHistoryEntity)
				//.join(q).on(apiHistoryEntity.seq.eq(q.seq))
				.where(apiHistoryEntity.seq.eq(seq))
				.fetchOne()
				);
	}
}
