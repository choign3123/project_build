package com.smu.som.domain.question.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlayCount is a Querydsl query type for PlayCount
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlayCount extends EntityPathBase<PlayCount> {

    private static final long serialVersionUID = -208173717L;

    public static final QPlayCount playCount = new QPlayCount("playCount");

    public final NumberPath<Long> couple = createNumber("couple", Long.class);

    public final NumberPath<Long> family = createNumber("family", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> married = createNumber("married", Long.class);

    public final StringPath userId = createString("userId");

    public QPlayCount(String variable) {
        super(PlayCount.class, forVariable(variable));
    }

    public QPlayCount(Path<? extends PlayCount> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlayCount(PathMetadata metadata) {
        super(PlayCount.class, metadata);
    }

}

