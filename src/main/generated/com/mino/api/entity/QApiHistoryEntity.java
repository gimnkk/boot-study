package com.mino.api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QApiHistoryEntity is a Querydsl query type for ApiHistoryEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QApiHistoryEntity extends EntityPathBase<ApiHistoryEntity> {

    private static final long serialVersionUID = -1242810032L;

    public static final QApiHistoryEntity apiHistoryEntity = new QApiHistoryEntity("apiHistoryEntity");

    public final StringPath data = createString("data");

    public final DateTimePath<java.time.LocalDateTime> expireDate = createDateTime("expireDate", java.time.LocalDateTime.class);

    public final StringPath historyKey = createString("historyKey");

    public final DateTimePath<java.time.LocalDateTime> reqDate = createDateTime("reqDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public final StringPath status = createString("status");

    public QApiHistoryEntity(String variable) {
        super(ApiHistoryEntity.class, forVariable(variable));
    }

    public QApiHistoryEntity(Path<? extends ApiHistoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApiHistoryEntity(PathMetadata metadata) {
        super(ApiHistoryEntity.class, metadata);
    }

}

