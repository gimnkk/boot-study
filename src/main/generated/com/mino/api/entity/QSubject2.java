package com.mino.api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSubject2 is a Querydsl query type for Subject2
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSubject2 extends EntityPathBase<Subject2> {

    private static final long serialVersionUID = -2054387911L;

    public static final QSubject2 subject2 = new QSubject2("subject2");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<Subject2, QSubject2> subject = this.<Subject2, QSubject2>createList("subject", Subject2.class, QSubject2.class, PathInits.DIRECT2);

    public QSubject2(String variable) {
        super(Subject2.class, forVariable(variable));
    }

    public QSubject2(Path<? extends Subject2> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSubject2(PathMetadata metadata) {
        super(Subject2.class, metadata);
    }

}

